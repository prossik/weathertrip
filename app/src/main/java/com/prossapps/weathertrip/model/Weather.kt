package com.prossapps.weathertrip.model

import java.util.*

/**
 * Created by prossik on 7/11/17.
 */
class Weather(val coord: Coord, val weather: Array<Weather>, val base: String, val main: Main, val visibility: Long, val wind: Wind, val clouds: Clouds, val dt: Long, val sys: Sys, val id: Long, val name: String, val cod: Long) {

    class Coord(val lon: Double, val lat: Double) {
        override fun toString(): String {
            return "Coord(lon=$lon, lat=$lat)"
        }
    }

    class Weather(val id: Long, val main: String, val description: String, val icon: String) {
        override fun toString(): String {
            return "Weather(id=$id, main='$main', description='$description', icon='$icon')"
        }
    }

    class Main(val temp: Double, val pressure: Long, val humidity: Long, val temp_min: Double, val temp_max: Double) {
        override fun toString(): String {
            return "Main(temp=$temp, pressure=$pressure, humidity=$humidity, temp_min=$temp_min, temp_max=$temp_max)"
        }
    }

    class Wind(val speed: Double, val deg: Long) {
        override fun toString(): String {
            return "Wind(speed=$speed, deg=$deg)"
        }
    }

    class Clouds(val all: Long) {
        override fun toString(): String {
            return "Clouds(all=$all)"
        }
    }

    class Sys(val type: Long, val id: Long, val message: Double, val country: String, val sunrise: Long, val sunset: Long) {
        override fun toString(): String {
            return "Sys(type=$type, id=$id, message=$message, country='$country', sunrise=$sunrise, sunset=$sunset)"
        }
    }

    override fun toString(): String {
        return "Weather(coord=$coord, weather=${Arrays.toString(weather)}, base='$base', main=$main, visibility=$visibility, wind=$wind, clouds=$clouds, dt=$dt, sys=$sys, id=$id, name='$name', cod=$cod)"
    }


}