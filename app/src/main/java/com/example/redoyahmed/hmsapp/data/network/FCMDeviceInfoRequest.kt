package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class FCMDeviceInfoRequest {

    data class ServerFCMDeviceInfoRequest internal constructor(

            @Expose
            @SerializedName("UserId")
            internal val UserId: Long? = null,

            @Expose
            @SerializedName("DeviceType")
            internal val DeviceType: String? = "",

            @Expose
            @SerializedName("DeviceId")
            internal val DeviceId: String? = "",

            @Expose
            @SerializedName("DeviceToken")
            internal val DeviceToken: String? = "",

            @Expose
            @SerializedName("BrowserName")
            internal val BrowserName: String? = "",

            @Expose
            @SerializedName("VersionNumber")
            internal val VersionNumber: String? = ""

    )

}