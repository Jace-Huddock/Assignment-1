package com.example.weatherapp2.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DayForecast(
    @Json(name = "date") val date: Long,
    @Json(name = "sunrise") val sunrise: Long,
    @Json(name = "sunset") val sunset: Long,
    @Json(name = "forecastTemp") val forecastTemp: ForecastTemp,
    @Json(name = "pressure") val pressure: Float,
    @Json(name = "humidity") val humidity: Int,
    @Json(name = "min") val min: Float,
    @Json(name = "max") val max: Float
)

data class ForecastTemp(
    @Json(name = "min") val min: Float,
    @Json(name = "max") val max: Float,
)