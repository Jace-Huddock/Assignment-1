package com.example.ics342proj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.ics342proj.data.CurrentConditions
import com.example.ics342proj.databinding.ActivityMainBinding
import com.example.ics342proj.ui.CurrentConditionsScreen
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var viewBinding: ActivityMainBinding
        @Inject set
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate() called")
        viewBinding = ActivityMainBinding.inflate(layoutInflater)

        setContent {
            CurrentConditionsScreen()
        }

        viewModel.viewState.observe(this) { currentConditions ->
          //  viewBinding.cityName.text = currentConditions.cityName
            //viewBinding.currentTemp.text = getString(R.string.current_temp, currentConditions.temp.toInt())
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}