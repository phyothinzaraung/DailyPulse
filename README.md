# KMM News App

This is a Kotlin Multiplatform Mobile (KMM) project that fetches and displays news data from [NewsAPI.org](https://newsapi.org). The app is designed to work on both Android and iOS platforms using shared business logic.

## Features
- Fetches news articles from [NewsAPI.org](https://newsapi.org)
- Displays headlines, descriptions, and images
- Supports both Android and iOS
- Uses Ktor for network requests
- Utilizes Jetpack Compose for UI on Android and SwiftUI for iOS

## Technologies Used
- **Kotlin Multiplatform Mobile (KMM)**
- **Ktor** for networking
- **Coroutines** for asynchronous tasks
- **Jetpack Compose** (Android UI)
- **SwiftUI** (iOS UI)
- **NewsAPI.org** as the news source

## Setup Instructions
1. Clone the repository:
   ```sh
   git clone [https://github.com/phyothinzaraung/DailyPulse.git]
   cd DailyPulse
   ```
2. Open the project in **Android Studio** (Arctic Fox or later) with the KMM plugin installed.
3. Get an API key from [NewsAPI.org](https://newsapi.org/register) and add it to your `local.properties` file:
   ```properties
   NEWS_API_KEY=your_api_key_here
   ```
4. Run the project on an Android emulator or iOS simulator.

## Screenshot
<img width="835" alt="Screenshot 2025-02-01 at 10 32 29 PM" src="https://github.com/user-attachments/assets/2173ed89-e278-4eea-8896-0c37dc09d0b0" />
