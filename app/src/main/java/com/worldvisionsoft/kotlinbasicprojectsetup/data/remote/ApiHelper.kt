package com.worldvisionsoft.kotlinbasicprojectsetup.data.remote

import retrofit2.Call

interface ApiHelper {
    fun login(header: String, loginBody: LoginRequest) : Call<BaseResponse>
}