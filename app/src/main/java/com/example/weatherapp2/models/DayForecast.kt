package com.example.weatherapp2.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DayForecastData(
    @Json(name = "dt") val date: Long,
    @Json(name = "sunrise") val sunrise: Long,
    @Json(name = "sunset") val sunset: Long,
    @Json(name = "temp") val forecastTemp: ForecastTemp,
    @Json(name = "weather") val weatherData: List<WeatherData>,
)

data class ForecastTemp(
    @Json(name = "min") val min: Float,
    @Json(name = "max") val max: Float,
)

data class DayForecastConditions(
    @Json(name = "list") val forecastData: List<DayForecastData>,
)
