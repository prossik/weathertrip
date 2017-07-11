package com.prossapps.weathertrip.common

/**
 * Created by prossik on 7/11/17.
 */
class Utils {
    companion object {}
}

// Converts to celsius
fun Utils.Companion.convertFahrenheitTocelsius(fahrenheit: Double): Int {
    return ((fahrenheit.toInt()-32) / 1.8).toInt()
}

