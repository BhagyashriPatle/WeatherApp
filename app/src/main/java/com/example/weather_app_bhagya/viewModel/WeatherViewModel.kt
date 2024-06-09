package com.example.weather_app_bhagya.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.weather_app_bhagya.apiService.RetrofitClient
import com.example.weather_app_bhagya.model.WeatherResponse
import com.example.weather_app_bhagya.repository.WeatherRepository
import kotlinx.coroutines.launch
class WeatherViewModel(application: Application) : AndroidViewModel(application) {
    private val weatherRepository = WeatherRepository(RetrofitClient.weatherService)
    private val _weatherData = MutableLiveData<WeatherResponse>()
    val weatherData: LiveData<WeatherResponse> = _weatherData
    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> = _errorMessage

    fun fetchWeather(cityName: String, units: String = "metric") {
        viewModelScope.launch {
            try {
                val apiKey = "30787df096680a21ec39fcc3d92962fd"
                val response = weatherRepository.getWeather(cityName, apiKey, units)
                _weatherData.value = response
                println("response======> $response")
            } catch (e: Exception) {
                _errorMessage.value = e.message
            }
        }
    }
}

