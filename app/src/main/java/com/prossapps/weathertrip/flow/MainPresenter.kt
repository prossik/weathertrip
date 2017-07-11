package com.prossapps.weathertrip.flow

import client.yalantis.com.githubclient.api.ApiSettings
import client.yalantis.com.githubclient.api.GeneralErrorHandler
import client.yalantis.com.githubclient.manager.ApiManager
import client.yalantis.com.githubclient.mvp.BaseMvpPresenterImpl
import rx.functions.Action1

/**
 * Created by prossik on 7/11/17.
 */
class MainPresenter: BaseMvpPresenterImpl<MainContract.View>(), MainContract.Presenter {


    override fun loadWeatherData(searchValue: String) {
            ApiManager.loadWeather(searchValue, ApiSettings.APPTOKENVALUE)
                    .doOnError { mView?.showMessage(it.toString()) }
                    .subscribe(Action1 { mView?.showWeather(it) },
                            GeneralErrorHandler(
                                    mView, true,
                                    { throwable, errorBody, isNetwork -> mView?.showError(throwable.message) }))

    }

}