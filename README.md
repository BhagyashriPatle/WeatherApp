# Weather App

This is a simple weather application for Android that displays weather information based on the user's location or a specified city.

## Features

- Display current weather information including temperature and description.
- Automatically fetch weather data based on the device's location.
- Allow users to search for weather information by entering a city name.
- Change background  color based on the weather description.

## Installation

Clone the repository and open the project in Android Studio.

API Keys :-
You need to obtain API keys for the following services:

OpenWeatherMap API: Get your API key from OpenWeatherMap and replace "YOUR_OPENWEATHERMAP_API_KEY" in WeatherRepository.kt with your actual API key.

Google Maps API: Get your API key from Google Cloud Console and replace "YOUR_GOOGLE_MAPS_API_KEY" in google_maps_api.xml with your actual API key.

Running the App:- 

Open the project in Android Studio.
Replace "YOUR_OPENWEATHERMAP_API_KEY" and "YOUR_GOOGLE_MAPS_API_KEY" with your actual API keys.
Build and run the app on an emulator or physical device.

Libraries Used:-
Retrofit: For making network requests.
Gson: For JSON serialization and deserialization.
Glide: For loading images from URLs.
Google Maps SDK: For displaying maps and fetching user location.

Architecture:-
The app uses MVVM (Model-View-ViewModel) architecture for separation of concerns and better maintainability.

Testing:-
Unit tests are included for ViewModel classes using JUnit.

Future Improvements:-
Implement more detailed weather information (e.g., wind speed, humidity).
Add support for different temperature units (Celsius, Fahrenheit).
Improve error handling and user feedback.
