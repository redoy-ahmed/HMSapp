package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserPortfulio(

        @Expose
        @SerializedName("UserId")
        var UserId: Long? = 0,

        @Expose
        @SerializedName("DocumentUrl")
        var DocumentUrl: String? = null,

        @Expose
        @SerializedName("PortfulioItems")
        var PortfulioItems: String? = null,

        @Expose
        @SerializedName("Id")
        var Id: Int? = 0
)