package client.yalantis.com.githubclient.mvp

import android.content.Context
import android.support.annotation.StringRes

/**
 * Created by prossik on 7/11/17.
 */
interface BaseMvpView {

    fun getContext(): Context

    fun showError(error: String?)

    fun showError(@StringRes stringResId: Int)

    fun showMessage(@StringRes srtResId: Int)

    fun showMessage(message: String)

}
