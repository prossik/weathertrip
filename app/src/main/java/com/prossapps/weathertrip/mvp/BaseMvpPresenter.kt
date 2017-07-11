package client.yalantis.com.githubclient.mvp

/**
 * Created by prossik on 7/11/17.
 */
interface BaseMvpPresenter<in V : BaseMvpView> {

    fun attachView(view: V)

    fun detachView()
}