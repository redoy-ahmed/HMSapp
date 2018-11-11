package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ProfileInfoResponse(

        @Expose
        @SerializedName("Success")
        var Success: Boolean = false,

//        @Expose
//        @SerializedName("Messages")
//        var Messages: Messages? = null,
//
//        @Expose
//        @SerializedName("post_user")
//        var ErrorMessages: Messages? = null,

        @Expose
        @SerializedName("ResponseData")
        var responseData: ResponseData? = null
)