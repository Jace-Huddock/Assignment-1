package com.example.ics342proj.data
/*
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.ics342proj.data.DayForecast
import com.example.ics342proj.databinding.FragmentForecastBinding
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

private val forecastTemps = listOf(
    ForecastTemp(51f,80f),
    ForecastTemp(53f,83f),
    ForecastTemp(71f,87f),
    ForecastTemp(31f,50f),
    ForecastTemp(32f,60f),
    ForecastTemp(66f,110f),
    ForecastTemp(12f,32f),
    ForecastTemp(5f,60f),
    ForecastTemp(34f,70f),
    ForecastTemp(56f,66f),
    ForecastTemp(42f,70f),
    ForecastTemp(23f,67f),
    ForecastTemp(46f,89f),
    ForecastTemp(14f,58f),
    ForecastTemp(22f,32f),
    ForecastTemp(32f,80f),

)

private val forecastData = listOf(
    DayForecast(1666827715, 8, 9, forecastTemps[0], 1023f, 30),
    DayForecast(1666914115, 805, 910, forecastTemps[1], 1033f, 20),
    DayForecast(1667000515, 806, 911, forecastTemps[2], 1024f, 80),
    DayForecast(1667086915, 810, 912, forecastTemps[3], 1123f, 60),
    DayForecast(1667173315, 804, 913, forecastTemps[4], 1046f, 86),
    DayForecast(1667259715, 810, 905, forecastTemps[5], 1074f, 32),
    DayForecast(1667346115, 801, 906, forecastTemps[6], 1023f, 37),
    DayForecast(1667432515, 8, 910, forecastTemps[7], 1043f, 57),
    DayForecast(1667518915, 812, 903, forecastTemps[8], 1075f, 78),
    DayForecast(1667605315, 805, 904, forecastTemps[9], 1011f, 57),
    DayForecast(1667691715, 803, 900, forecastTemps[10], 1012f, 90),
    DayForecast(1667778115, 808, 915, forecastTemps[11], 1013f, 100),
    DayForecast(1667864515, 810, 910, forecastTemps[12], 1123f, 100),
    DayForecast(1667950915, 8, 909, forecastTemps[13], 1223f, 34),
    DayForecast(1668037315, 812, 912, forecastTemps[14], 1043f, 46),
    DayForecast(1668123715, 802, 9, forecastTemps[15], 1023f, 80),
)

class ForecastFragment : Fragment(R.layout.fragment_forecast) {

    private lateinit var binding: FragmentForecastBinding
    private val args: ForecastFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentForecastBinding.bind(view)
        binding.forecastList.adapter = ForecastAdapter(forecastData)

        val dateTimeStamp = 16660827715L // Oct 26
        val formatter = DateTimeFormatter.ofPattern("MMM dd")
        val dateTime = LocalDateTime.ofEpochSecond(dateTimeStamp, 0, ZoneOffset.of("-5"))
        val formattedDate = formatter.format(dateTime)

        val timeFormatter = DateTimeFormatter.ofPattern("h:mm a")
        val formattedTime = timeFormatter.format(dateTime)

        val tempString = resources.getString(R.string.degree_temp, 70)
        Log.d("ForecastFragment", formattedDate)
        Log.d("ForecastFragment", formattedTime)


    }
}
*/


