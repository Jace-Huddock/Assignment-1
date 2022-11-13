package com.example.weatherapp2.models

import com.squareup.moshi.Json

data class DayForecastData(
    @Json(name = "date") val date: Long,
    @Json(name = "sunrise") val sunrise: Long,
    @Json(name = "sunset") val sunset: Long,
    @Json(name = "forecastTemp") val forecastTemp: DayForecast,
    @Json(name = "pressure") val pressure: Float,
    @Json(name = "humidity") val humidity: Int,
    @Json(name = "min") val min: Float,
    @Json(name = "max") val max: Float
)

data class DayForecast(
    @Json(name = "weather") val weatherData: List<WeatherData>,
    @Json(name = "main") val forecast: DayForecastData,
)