package com.worldvisionsoft.kotlinbasicprojectsetup.data.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LoginRequest (
    @Expose
    @SerializedName("User")
    var User: String,

    @Expose
    @SerializedName("Password")
    var Password: String,

    @Expose
    @SerializedName("Value")
    var Value: String
)