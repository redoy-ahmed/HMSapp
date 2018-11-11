package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TaskAlertKeyword(

        @Expose
        @SerializedName("Id")
        var Id: Long? = null,

        @Expose
        @SerializedName("Status")
        var Status: Int? = null,

        @Expose
        @SerializedName("CreationDate")
        var CreationDate: String? = null,

        @Expose
        @SerializedName("Keyword")
        var Keyword: String? = null,

        @Expose
        @SerializedName("IsOnline")
        var IsOnline: Boolean? = false,

        @Expose
        @SerializedName("Location")
        var Location: String? = null,

        @Expose
        @SerializedName("Latitude")
        var Latitude: Double? = null,

        @Expose
        @SerializedName("Longitude")
        var Longitude: Double? = null,

        @Expose
        @SerializedName("UserId")
        var UserId: Int? = null,

        @Expose
        @SerializedName("Distance")
        var Distance: Double? = null
)