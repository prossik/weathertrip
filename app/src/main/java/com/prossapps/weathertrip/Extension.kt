package com.prossapps.weathertrip

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Created by prossik on 7/11/17.
 */
inline fun <reified T> Gson.fromJson(json: String): T {
    return this.fromJson<T>(json, object: TypeToken<T>() {}.type)
}