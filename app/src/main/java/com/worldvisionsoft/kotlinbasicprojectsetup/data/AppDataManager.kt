package com.worldvisionsoft.kotlinbasicprojectsetup.data

import android.content.Context
import com.google.gson.Gson
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.DbHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.user.User
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.pref.PreferencesHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.ApiHelper
import javax.inject.Inject

class AppDataManager constructor(
    @Inject val context: Context, val
    dbHelper: DbHelper, val preferencesHelper: PreferencesHelper, val apiHelper: ApiHelper, val gson: Gson
) : DataManager {

    override fun setApiHeader(header: String) {

    }

    override fun login(loginBody: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUsers(userId: String): List<User> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAccessToken(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}