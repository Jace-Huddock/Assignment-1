package com.example.weatherapp2

import android.Manifest.permission.ACCESS_COARSE_LOCATION
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts.RequestPermission
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp2.ui.CurrentConditions
import com.example.weatherapp2.ui.ForecastScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            var hasLocationPermission = remember { false }
            val requestPermissionLauncher = rememberLauncherForActivityResult(
                contract = RequestPermission()) {
                hasLocationPermission = it

            }
            NavHost(navController,startDestination = "CurrentConditions") {
                composable("CurrentConditions") {
                    CurrentConditions(
                        hasLocationPermission = hasLocationPermission,
                        onGetWeatherForMyLocationClick = {
                            requestPermissionLauncher.launch(ACCESS_COARSE_LOCATION)
                        }
                    ) {
                        navController.navigate("Forecast")
                    }
                }

                composable("Forecast") {
                    ForecastScreen()
                }
            }
        }
    }


}