package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SignUpResponse(

        @Expose
        @SerializedName("Success")
        var Success: Boolean = false,

        @Expose
        @SerializedName("Messages")
        var Messages: Messages? = null,

        @Expose
        @SerializedName("ErrorMessages")
        var ErrorMessages: Messages? = null,

        @Expose
        @SerializedName("ResponseData")
        var responseData: ResponseData? = null
)