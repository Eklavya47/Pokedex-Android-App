package com.company.pokedexapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.company.pokedexapp.pokemondetail.PokemonDetailScreen
import com.company.pokedexapp.screens.PokemonListScreen
import com.company.pokedexapp.ui.theme.PokedexAppTheme
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            PokedexAppTheme {
                Scaffold {innerPadding ->
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "pokemon_list_screen",
                        modifier = Modifier.padding(innerPadding)){
                        composable("pokemon_list_screen"){
                            PokemonListScreen(navController = navController)
                        }
                        composable(
                            "pokemon_detail_screen/{dominantColor}/{pokemonName}",
                            arguments = listOf(
                                navArgument("dominantColor"){
                                    type = NavType.IntType
                                },
                                navArgument("pokemonName"){
                                    type = NavType.StringType
                                }
                            )
                        ){
                            val dominantColor = remember{
                                val color = it.arguments?.getInt("dominantColor")
                                color?.let { Color(it) }?: Color.White
                            }
                            val pokemonName = remember {
                                it.arguments?.getString("pokemonName")
                            }
                            PokemonDetailScreen(
                                dominantColor = dominantColor,
                                pokemonName = pokemonName?.lowercase(Locale.ROOT) ?: "",
                                navController = navController
                            )
                        }
                    }
                }

            }
        }
    }
}

