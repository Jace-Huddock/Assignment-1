package com.example.ics342proj.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.ics342proj.R

@Composable
fun CurrentConditionsScreen(){
    Text(text = stringResource(id = R.string.city_name))
}

@Preview(
    "CurrentConditions",
    device = Devices.PIXEL_4,
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun CurrentConditionsScreenPreview(){
    CurrentConditionsScreen()
}