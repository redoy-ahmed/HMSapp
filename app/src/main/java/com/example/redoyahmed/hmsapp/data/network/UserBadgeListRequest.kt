package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserBadgeListRequest {

    data class GetUserBadgeListRequest internal constructor(
            @Expose
            @SerializedName("UserId")
            var UserId: Long? = null)


    data class GetUserBadgeRequest internal constructor(
            @Expose
            @SerializedName("UserId")
            var UserId: Long? = 0,

            @Expose
            @SerializedName("Status")
            var Status: Int? = null,

            @Expose
            @SerializedName("Title")
            var Title: String? = null,

            @Expose
            @SerializedName("Type")
            var Type: String? = null,

            @Expose
            @SerializedName("IsVerified")
            var IsVerified: Boolean? = false
    )

    data class PostUserBadgeRequest internal constructor(

            @Expose
            @SerializedName("UserId")
            var UserId: Long? = 0,

            @Expose
            @SerializedName("Status")
            var Status: Int? = null,

            @Expose
            @SerializedName("Title")
            var Title: String? = null,

            @Expose
            @SerializedName("Type")
            var Type: String? = null,

            @Expose
            @SerializedName("IsVerified")
            var IsVerified: Boolean? = false,

            @Expose
            @SerializedName("RefrenceUrl")
            var RefrenceUrl: String? = null,

            @Expose
            @SerializedName("ReferenceType")
            var ReferenceType: String? = null

    )
}