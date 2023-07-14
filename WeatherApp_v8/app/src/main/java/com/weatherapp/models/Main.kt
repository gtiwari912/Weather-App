package com.weatherapp.models

import java.io.Serializable

data class Main(
    val temp: Int,
    val pressure: Int,
    val humidity: Int,
    val tempMin: Int,
    val tempMax: Int
) : Serializable