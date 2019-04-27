package com.worldvisionsoft.kotlinbasicprojectsetup.data

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.DbHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.user.User
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.pref.PreferencesHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.ApiHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.BaseResponse
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.LoginRequest
import retrofit2.Call
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDataManager @Inject constructor(val context: Context,val apiHelper: ApiHelper, val
    dbHelper: DbHelper,val preferencesHelper: PreferencesHelper,val gson: Gson
) : DataManager {

    override fun login(header: String, loginBody: LoginRequest): Call<BaseResponse> {

        //May be you have some logic dependency on preference or database values, so this is the place
        //where you should keep the business logic and then pass this call to api part.
        //AppApiHelper class is responsible only for serving the request, no logic will be added there

        return apiHelper.login(header, loginBody)
    }

    override fun setAccessToken(accessToken: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setApiHeader(header: String) {

    }

    override fun getUsers(userId: String): List<User> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAccessToken(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}