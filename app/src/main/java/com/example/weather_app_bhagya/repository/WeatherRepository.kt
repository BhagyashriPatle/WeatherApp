package com.example.weather_app_bhagya.repository

import com.example.weather_app_bhagya.apiService.WeatherApiService
import com.example.weather_app_bhagya.model.WeatherResponse
class WeatherRepository(private val weatherApiService: WeatherApiService) {
    suspend fun getWeather(cityName: String, apiKey: String, units: String = "metric"): WeatherResponse {
        return weatherApiService.getWeather(cityName, apiKey, units)
    }
}
