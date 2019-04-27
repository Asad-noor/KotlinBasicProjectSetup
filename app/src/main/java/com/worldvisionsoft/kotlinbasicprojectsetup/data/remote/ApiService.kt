package com.worldvisionsoft.kotlinbasicprojectsetup.data.remote

import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @POST(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
    fun performServerLogin(@Query("LoginRequest") action: String): Call<BaseResponse>

//    @Headers("Content-Type: application/json")
//    @POST("account/login")
//    abstract fun login(@Body loginData: LoginData): Call<BaseResponse>
}