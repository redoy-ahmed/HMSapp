package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by AITL-01 on 5/7/2018.
 */


data class UserBadge(

        @Expose
        @SerializedName("Status")
        var Status: Int? = null,
        @Expose
        @SerializedName("CreationDate")
        var CreationDate: Date? = null,
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