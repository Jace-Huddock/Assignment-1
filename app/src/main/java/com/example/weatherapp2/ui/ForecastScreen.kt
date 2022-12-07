package com.example.weatherapp2.ui

import android.annotation.SuppressLint

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.weatherapp2.R
import com.example.weatherapp2.models.*
import com.example.weatherapp2.toHourMinute
import com.example.weatherapp2.toMonthDay


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ForecastScreen(
    latitudeLongitude: LatitudeLongitude?,
    viewModel: ForecastViewModel = hiltViewModel(),
) {
    val state by viewModel.dayForecast.collectAsState(initial = null)

    if (latitudeLongitude != null) {
        LaunchedEffect(Unit) {
            viewModel.fetchCurrentLocationData(latitudeLongitude)
        }
    } else {
        LaunchedEffect(Unit) {
            viewModel.fetchData()
        }
    }

    Scaffold(
        topBar = { AppBar(title = stringResource(id = R.string.app_name))},
    ) {

        state.let {
            it?.let { it -> ForecastContent(it) }
        }
    }

}

@Composable
private fun ForecastContent(
    forecastConditions: DayForecastConditions,
){
    LazyColumn {
        items(items = forecastConditions.forecastData)  { item: DayForecastData ->
            ForecastRow(item = item)
        }
    }
}


@Composable
fun ForecastRow(item: DayForecastData) =
    Row(
        modifier = Modifier.background(Color.White).padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val textStyle = TextStyle(
            fontSize = 12.sp,
        )
        Image(painter = painterResource(id = R.drawable.sun_icon), contentDescription = "")
        Spacer(modifier = Modifier.weight(1f, true))
        Text(
            text = item.date.toMonthDay(),
            style = TextStyle(
                fontSize = 16.sp,
            )
        )
        Spacer(modifier = Modifier.weight(1f, true))
        Column {
            Text(
                text = stringResource(id = R.string.date, item.forecastTemp.max.toInt()),
                style = textStyle,
            )
            Text(
                text = stringResource(id = R.string.low_temp, item.forecastTemp.min.toInt()),
                style = textStyle,
            )
        }
        Spacer(modifier = Modifier.weight(1f, true))
        Column(
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = stringResource(id = R.string.sunrise, item.sunrise.toHourMinute()),
                style = textStyle,
            )
            Text(
                text = stringResource(id = R.string.sunset, item.sunset.toHourMinute()),
                style = textStyle,
            )
        }
    }


@Preview(
    name = "ForecastScreen",
    device = Devices.PIXEL_4,
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ForecastRowPreview() {
}


