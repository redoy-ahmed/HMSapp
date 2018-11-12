package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Promotion(

        @Expose
        @SerializedName("UserId")
        var UserId: Long = 0,

        @Expose
        @SerializedName("CreationDate")
        var CreationDate: String? = null,

        @Expose
        @SerializedName("FixedRate")
        var FixedRate: Double? = null,

        @Expose
        @SerializedName("PercentageRate")
        var PercentageRate: Int? = null,

        @Expose
        @SerializedName("MaximumAmount")
        var MaximumAmount: Double? = null,

        @Expose
        @SerializedName("TotalTask")
        var TotalTask: Int? = null,

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
        @SerializedName("Remarks")
        var Remarks: String? = null
)