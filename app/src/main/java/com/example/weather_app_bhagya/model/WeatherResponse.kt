package com.example.weather_app_bhagya.model


data class WeatherResponse(
    val main : Main,
    val weather : List<Weather>
)