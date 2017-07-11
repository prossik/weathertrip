package com.prossapps.weathertrip.flow

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import client.yalantis.com.githubclient.mvp.BaseMvpActivity
import com.prossapps.weathertrip.R
import com.prossapps.weathertrip.common.Utils
import com.prossapps.weathertrip.common.convertFahrenheitTocelsius
import com.prossapps.weathertrip.model.Weather
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : BaseMvpActivity<MainContract.View,
        MainPresenter>(),
        MainContract.View {


    override var mPresenter: MainPresenter = MainPresenter()

    @SuppressLint("SetTextI18n")
    override fun showWeather(weather: Weather) {
        Log.d("this", weather.toString())
        var tempValue = Utils.convertFahrenheitTocelsius(weather.main.temp)
        var info = weather.weather.get(0).description
        var city = weather.name
        resultTextView?.text = "In $city currently $tempValue C, $info"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter.attachView(view = this)
        editTextView.setOnEditorActionListener() { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH
                    || actionId == EditorInfo.IME_ACTION_DONE
                    || event.getAction() == KeyEvent.ACTION_DOWN
                    && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                mPresenter.loadWeatherData(editTextView?.text?.toString()!!)
                true
            } else {
                false
            }
        }
        editTextView.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                resultTextView.text=""
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
    }
}
