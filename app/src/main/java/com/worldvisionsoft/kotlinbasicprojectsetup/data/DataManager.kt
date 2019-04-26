package com.worldvisionsoft.kotlinbasicprojectsetup.data

import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.DbHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.pref.PreferencesHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.ApiHelper

interface DataManager : DbHelper, PreferencesHelper{

    fun setApiHeader(header: String)
}