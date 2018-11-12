package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserPromotion(

        @Expose
        @SerializedName("UserId")
        var UserId: Long? = 0,

        @Expose
        @SerializedName("CreationDate")
        var CreationDate: String? = null,

        @Expose
        @SerializedName("PromotionId")
        var PromotionId: Long? = 0,

        @Expose
        @SerializedName("NumberPromotionUsedTask")
        var NumberPromotionUsedTask: Int? = 0,

        @Expose
        @SerializedName("TotalTask")
        var TotalTask: Int? = 0,

        @Expose
        @SerializedName("UserIds")
        var UserIds: String? = null,

        @Expose
        @SerializedName("ISNotification")
        var ISNotification: Boolean? = false,

        @Expose
        @SerializedName("ISEmail")
        var ISEmail: Boolean? = false,

        @Expose
        @SerializedName("ISSMS")
        var ISSMS: Boolean? = null,

        @Expose
        @SerializedName("PromotionCode")
        var PromotionCode: String? = null,

        @Expose
        @SerializedName("Id")
        var Id: Long? = 0



)