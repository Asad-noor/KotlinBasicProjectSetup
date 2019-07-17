package com.worldvisionsoft.kotlinbasicprojectsetup.data

import com.google.gson.Gson
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.DbHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.pref.PreferencesHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.ApiHelper

interface DataManager : ApiHelper, DbHelper, PreferencesHelper{

    fun setApiHeader(header: String)
    fun getGsonNow(): Gson
}