package com.example.ics342proj.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Forecast(
    val temp: String,
) : Parcelable


