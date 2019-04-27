package com.worldvisionsoft.kotlinbasicprojectsetup.data.remote

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppApiHelper @Inject constructor(val apiService: ApiService) : ApiHelper {

    override fun login(header: String, loginBody: LoginRequest): Call<BaseResponse> {
        return apiService.performServerLogin(header, loginBody)
    }
}