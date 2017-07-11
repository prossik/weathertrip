package com.prossapps.weathertrip.flow

import client.yalantis.com.githubclient.mvp.BaseMvpPresenter
import client.yalantis.com.githubclient.mvp.BaseMvpView
import com.prossapps.weathertrip.model.Weather

/**
 * Created by prossik on 7/11/17.
 */
object MainContract {

    interface View : BaseMvpView {
        fun showWeather(weather: Weather)

    }

    interface Presenter : BaseMvpPresenter<View> {
        fun loadWeatherData(toString: String)

    }


}