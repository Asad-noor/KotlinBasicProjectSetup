package com.worldvisionsoft.kotlinbasicprojectsetup.data.local.pref

interface PreferencesHelper {

    fun getAccessToken() : String?
    fun setAccessToken(accessToken: String?)

}
