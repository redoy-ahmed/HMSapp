package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SignInResponse(

    @Expose
    @SerializedName("success")
    var success: Boolean? = null,

    @Expose
    @SerializedName("responseData")
    var responseData: ResponseData? = null,

    @Expose
    @SerializedName("messages")
    var messages: Messages? = null,

    @Expose
    @SerializedName("errorMessages")
    var errorMessages: ErrorMessages? = null
)

