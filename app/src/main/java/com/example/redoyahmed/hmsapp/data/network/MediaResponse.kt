package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MediaResponse(

        @Expose
        @SerializedName("Success")
        private var Success: Boolean = false,

        @Expose
        @SerializedName("ResponseData")
        var ResponseData: ResponseData? = null
)

