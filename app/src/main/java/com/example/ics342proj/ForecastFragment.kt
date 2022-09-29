package com.example.ics342proj

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ics342proj.databinding.FragmentForecastBinding

private forecastData = listOf(
    Forecast( temp: "75"),
    Forecast( temp: "72"),
    Forecast( temp: "71"),
    Forecast( temp: "79"),
    Forecast( temp: "65"),
    Forecast( temp: "82"),
)
class ForecastFragment : Fragment(R.layout.fragment_forecast) {

    private lateinit var binding: FragmentForecastBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.forecastList.layoutManager = LinearLayoutManager(requireContext())
        binding.forecastList.adapter = ForecastAdapter(forecastData)
    }
}


