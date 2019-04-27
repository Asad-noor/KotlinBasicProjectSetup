package com.worldvisionsoft.kotlinbasicprojectsetup.data.remote

import retrofit2.Call

interface ApiHelper {
    fun login(loginBody: String) : Call<BaseResponse>
}