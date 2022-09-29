package com.example.ics342proj

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ics342proj.databinding.FragmentForecastBinding


class ForecastFragment : Fragment(R.layout.fragment_forecast) {

    private lateinit var binding: FragmentForecastBinding
    //private val args: ForecastFragmentArgs by navArgs()
    private val data: List<Forecast> = (0..100).map { Forecast(it.toString()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.forecastList.layoutManager = LinearLayoutManager(requireContext())
        binding.forecastList.adapter = ForecastAdapter(data)
    }
}



