package com.worldvisionsoft.kotlinbasicprojectsetup.data.remote

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {

    @POST(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
    fun performServerLogin(@Header("token") header: String, @Body loginRequest: LoginRequest): Call<BaseResponse>

//    @Headers("Content-Type: application/json")
//    @POST("account/login")
//    abstract fun login(@Body loginData: LoginData): Call<BaseResponse>
}