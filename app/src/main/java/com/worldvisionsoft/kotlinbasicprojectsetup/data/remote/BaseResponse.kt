package com.worldvisionsoft.kotlinbasicprojectsetup.data.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BaseResponse {
    @Expose
    @SerializedName("StatusCode")
    var statusCode: Int = 0

    @Expose
    @SerializedName("Data")
    var data: Any? = null

    @Expose
    @SerializedName("Message")
    var message: String? = null
}