package com.worldvisionsoft.kotlinbasicprojectsetup.data.remote

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppApiHelper @Inject constructor(val apiService: ApiService) : ApiHelper {

    override fun login(loginBody: String): Call<BaseResponse> {

        Log.d("tttt", "AppApiHelper" +loginBody);


        val call = apiService.performServerLogin(loginBody)

        call.enqueue(object : Callback<BaseResponse> {

            override fun onResponse(call: Call<BaseResponse>, response: Response<BaseResponse>) {

            }

            override fun onFailure(call: Call<BaseResponse>, t: Throwable) {

            }
        })

        return call
    }
}