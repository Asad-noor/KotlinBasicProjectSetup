package com.worldvisionsoft.kotlinbasicprojectsetup.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BaseResponse<T: Any>(
    @Expose
    @SerializedName("StatusCode")
    var statusCode: String? = null,

    @Expose
    @SerializedName("Data")
    var data: List<T>? = null,

    @Expose
    @SerializedName("Message")
    var message: String? = null
)