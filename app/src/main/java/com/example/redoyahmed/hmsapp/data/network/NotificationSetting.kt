package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by jyotidubey on 17/01/18.
 */
data class NotificationSetting(

        @Expose
        @SerializedName("Message")
        var UserId: Int? = null,

        @Expose
        @SerializedName("Message")
        var Status: Int? = null,
        @Expose
        @SerializedName("Message")
        var CreationDate: String? = null,

        @Expose
        @SerializedName("Message")
        var Title: String? = null,
        @Expose
        @SerializedName("Message")
        var Type: String? = null,

        @Expose
        @SerializedName("Message")
        var IsEmail: Boolean? = false,
        @Expose
        @SerializedName("Message")
        var IsSMS: Boolean? = false,
        @Expose
        @SerializedName("Message")
        var IsPush: Boolean? = false

)