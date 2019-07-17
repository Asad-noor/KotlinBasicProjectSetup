package com.worldvisionsoft.kotlinbasicprojectsetup.ui.home

import android.util.Log
import com.google.gson.Gson
import com.worldvisionsoft.kotlinbasicprojectsetup.data.DataManager
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.BaseResponse
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.LoginRequest
import com.worldvisionsoft.kotlinbasicprojectsetup.ui.base.BaseViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel constructor(dataManager: DataManager) : BaseViewModel<HomeNavigator>(dataManager) {

    // 2. Then this method is called from the view class
    fun performHome(loginRequest: LoginRequest) {
        getDataManager().login("abc", loginRequest).enqueue(object : Callback<BaseResponse> {

            override fun onResponse(call: Call<BaseResponse>, response: Response<BaseResponse>) {
                Log.d("tttt", "body >>>>>" +response.body().toString())

                val baseResponse: BaseResponse
                //baseResponse = getDataManager().getGsonNow().fromJson(getGson().toJson(response.body()), BaseResponse::class.java)
                //Log.d("tttt", "message is >"+baseResponse.message)
                getNavigator()?.openMainActivity()
            }

            override fun onFailure(call: Call<BaseResponse>, t: Throwable) {
                Log.d("tttt", "error >>>>>" + t.message)
            }
        })
    }

    // 1. This method is called from xml view Button and then redirect to view class where home is overridden
    fun onServerLoginClick() {
        getNavigator()?.home()
    }
}