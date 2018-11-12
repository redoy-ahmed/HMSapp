package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

data class FCMDeviceInfo(

        @Expose
        @SerializedName("UserId")
        var UserId: Long? = null,

        @Expose
        @SerializedName("CreationDate")
        var CreationDate: Date? = null,

        @Expose
        @SerializedName("DeviceType")
        var DeviceType: String? = null,

        @Expose
        @SerializedName("DeviceId")
        var DeviceId: String? = null,

        @Expose
        @SerializedName("DeviceToken")
        var DeviceToken: String? = null,

        @Expose
        @SerializedName("BrowserName")
        var BrowserName: String? = null,

        @Expose
        @SerializedName("VersionNumber")
        var VersionNumber: String? = null,

        @Expose
        @SerializedName("Id")
        var Id: Int? = null
)