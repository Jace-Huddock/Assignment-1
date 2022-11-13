package com.example.weatherapp2.service

import com.example.weatherapp2.models.CurrentConditions
import com.example.weatherapp2.models.DayForecast
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapApi {

    @GET("data/2.5/weather")
    suspend fun getCurrentConditions(
        @Query("zip") zip: String,
        @Query("appid") apiKey: String = "9c7e1f2a0b8de3d50451e550c61a9fa2",
        @Query("units") units: String = "imperial"
    ) : CurrentConditions

    @GET("data/2.5/weather")
    suspend fun getDayForecast(
        @Query("zip") zip: String,
        @Query("appid") apiKey: String = "9c7e1f2a0b8de3d50451e550c61a9fa2",
        @Query("units") units: String = "imperial"
    ) : DayForecast
}