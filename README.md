# ⚡ Pokedex Android App
A sleek and modern Pokedex app built using Kotlin and Jetpack Compose. This app fetches real-time Pokémon data from an external API using Retrofit, and implements pagination for smooth data loading. It features a search bar to filter Pokémon and a details screen to showcase comprehensive stats of each Pokémon. Dependency injection is managed using Dagger Hilt for better scalability and testability.

# ✨ Features
- 🏠 **Home Screen** – Displays a paginated list of Pokémon.
- 📋 **Pokemon List** – Browse through all Pokemon with infinite scrolling
- 🔍 **Search Pokemon** – Find Pokemon by name or number
- 📄 **Details Screen** – View detailed stats of Pokemon and information
- 🔁 **Pagination** – Loads more Pokémon as you scroll.
- 🎨 **Modern UI** – Built with Jetpack Compose for a fluid user experience
- 🧩 **Dependency Injection** – Efficiently managed with Dagger Hilt.
- 🌐 **Network Calls** – Data fetched from public Pokémon API using Retrofit.
- 🌈 **Type Colors** – Each Pokemon type represented with its distinctive color
- 📊 **Stats Visualization** – Visual representation of Pokemon statistics

# 📸 Screenshots
![home](https://github.com/user-attachments/assets/ef974d84-e985-4b40-9535-df7e611f038f)
![search screen](https://github.com/user-attachments/assets/9d4e1ea1-1a81-4eea-b59f-37ce4049a45a)
![details screen](https://github.com/user-attachments/assets/918fa892-12e6-410c-a196-d6c4e66052aa)

# ⚙️ Tech Stack
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM (Model-View-ViewModel)
- **Dependency Injection**: Hilt
- **API Communication**: Retrofit
- **Image Loading**: Coil
- **Coroutines & Flow**: For asynchronous operations

# 📂 Project Structure
- **data/**: Contains data models, DTOs, and data source implementations
- **di/**: Dependency injection modules using Hilt
- **pokemondetail/**: Components related to the Pokemon detail screen
- **repository/**: Repository implementations for data management
- **screens/**: Contains different screens of the application
- **ui/**: UI components and theme-related classes
- **util/**: Utility classes and helper functions
- **MainActivity.kt**: Main activity of the application
- **PokedexApplication.kt**: Application class for Hilt initialization

# 🚀 Getting Started
Follow these steps to run the project locally:
1. Clone the repository
2. Open the project in Android Studio
3. Sync the project with Gradle files
4. Run the app on an emulator or physical device

# 🔧 Requirements
- Android Studio Hedgehog or later
- Minimum SDK: 21
- Target SDK: 34
- Kotlin 1.9.0 or higher

# 🤝 Contributing
Contributions are welcome! If you'd like to fix a bug or add a feature, feel free to fork the repository and submit a pull request.
