package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 12/01/18.
 */
data class LogoutResponse internal constructor(
        @Expose
        @SerializedName("Success")
        var Success: Boolean = false,

        @Expose
        @SerializedName("Messages")
        var Messages: Messages? = null,

        @Expose
        @SerializedName("ResponseData")
        var ResponseData: ResponseData? = null
)

