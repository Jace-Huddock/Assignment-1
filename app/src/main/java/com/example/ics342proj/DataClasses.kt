package com.example.ics342proj

data class DayForecast(val date: Long, val sunrise: Long, val sunset: Long, val temp: ForecastTemp, val pressure: Float, val humidity: Int)

data class ForecastTemp(val day: Float, val min: Float, val max: Float)
