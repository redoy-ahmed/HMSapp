package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserPromotions(

        @Expose
        @SerializedName("Id")
        var Id: Long? = 0,

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
        @SerializedName("Rate")
        var Rate: Int? = 0,

        @Expose
        @SerializedName("MaximumAmount")
        var MaximumAmount: Int? = 0,

        @Expose
        @SerializedName("UserType")
        var UserType: String? = null,

        @Expose
        @SerializedName("ExpiryDate")
        var ExpiryDate: String? = null,

        @Expose
        @SerializedName("PromotionCode")
        var PromotionCode: String? = null,

        @Expose
        @SerializedName("IsFixedRate")
        var IsFixedRate: Boolean? = false


)