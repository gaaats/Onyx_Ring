package com.ferrero.app.utils

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

class CountryRepo(private val countryApi: ApiInterface) {
    suspend fun getDattttttttt() = countryApi.getDataaaaaaa()
}

interface HostInterface {
    @GET("typo.json")
    suspend fun getDataDevvvvvvvv(): Response<Jfrhfrrf>
}

class DevRepo(private val devData: HostInterface) {
    suspend fun getDataDevvvvvvvv() = devData.getDataDevvvvvvvv()
}

@Keep
data class Jjjtgtghu(
    @SerializedName("countryCode")
    val cou: String,
)


@Keep
data class Jfrhfrrf(
    @SerializedName("geo")
    val geoooo: String,
    @SerializedName("view")
    val viewvvv: String,
    @SerializedName("appsChecker")
    val appsCheckerrrrr: String,
)

interface ApiInterface {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getDataaaaaaa(): Response<Jjjtgtghu>
}
