package client.yalantis.com.githubclient.api

import com.prossapps.weathertrip.model.Weather
import org.json.JSONObject
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by andrewkhristyan on 10/6/16.
 */
interface ApiService {

    @GET("/data/2.5/weather")
    fun getWeather(@Query(ApiSettings.QUERY) searchQuery: String,
                   @Query(ApiSettings.APPTOKEN) token: String): Observable<Weather>


}