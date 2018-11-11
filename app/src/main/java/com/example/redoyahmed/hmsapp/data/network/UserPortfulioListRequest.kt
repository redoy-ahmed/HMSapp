package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserPortfulioListRequest {

    data class GetUserPortfulioListRequest internal constructor(
            @Expose
            @SerializedName("UserId")
            var UserId: Long? = null)


    data class ServerUserPortfulioPostRequest internal constructor(
            @Expose
            @SerializedName("Id")
            var PortfulioId: Long? = null,
            @Expose
            @SerializedName("UserId")
            var UserId: Long? = null,

            @Expose
            @SerializedName("DocumentUrl")
            var DocumentUrl: String? = null,

            @Expose
            @SerializedName("PortfulioItemsUrls")
            var PortfulioItemsUrls: String? = null





    )
}