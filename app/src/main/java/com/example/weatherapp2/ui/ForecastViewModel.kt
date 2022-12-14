package com.example.weatherapp2.ui

import androidx.lifecycle.ViewModel
import com.example.weatherapp2.models.DayForecast
import com.example.weatherapp2.service.OpenWeatherMapApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class ForecastViewModel @Inject constructor(private val api: OpenWeatherMapApi): ViewModel() {
    private val _forecast = Channel<DayForecast>()

    public val dayForecast: Flow<DayForecast> = _forecast.receiveAsFlow()

    fun fetchData() = runBlocking {
        val dayForecast = api.getDayForecast("55044")
            _forecast.trySend(dayForecast)
        }
}