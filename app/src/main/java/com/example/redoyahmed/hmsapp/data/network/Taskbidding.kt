package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by jyotidubey on 17/01/18.
 */
data class Taskbidding(

        @Expose
        @SerializedName("Id")
        var TaskbiddingId: Long? = 0,
        @Expose
        @SerializedName("UserId")
        var UserId: Long? = null,
        @Expose
        @SerializedName("Status")
        var Status: String? = null,
        @Expose
        @SerializedName("CreationDate")
        var CreationDate: String? = null,
        @Expose
        @SerializedName("UpdatedDate")
        var UpdatedDate: String? = null,
        @Expose
        @SerializedName("VersionNumber")
        var VersionNumber: String? = null,
        @Expose
        @SerializedName("TaskId")
        var TaskId: Long? = null,
        @Expose
        @SerializedName("CoverLetter")
        var CoverLetter: String? = null,
        @Expose
        @SerializedName("Description")
        var Description: String? = null,
        @Expose
        @SerializedName("DeliveryDate")
        var DeliveryDate: String? = null,
        @Expose
        @SerializedName("DeliveryTime")
        var DeliveryTime: String? = null,
        @Expose
        @SerializedName("FixedbiddigAmount")
        var FixedbiddigAmount: Double? = null,
        @Expose
        @SerializedName("HourlyBiddingAmount")
        var HourlyBiddingAmount: Double? = null,
        @Expose
        @SerializedName("TotalHourPerWeek")
        var TotalHourPerWeek: Double? = null,
        @Expose
        @SerializedName("TotalHour")
        var TotalHour: Double? = null,
        @Expose
        @SerializedName("OwnerName")
        var OwnerName: String? = null,
        @Expose
        @SerializedName("ThumbnailPath")
        var ThumbnailPath: String? = null,
        @Expose
        @SerializedName("ReferenceType")
        var ReferenceType: String? = null,
        @Expose
        @SerializedName("ReferenceId")
        var ReferenceId: String? = null,
        @Expose
        @SerializedName("Remarks")
        var Remarks: String? = null,
        @Expose
        @SerializedName("ImageServerUrl")
        var ImageServerUrl: String? = null,
        @Expose
        @SerializedName("OwnerImageUrl")
        var OwnerImageUrl: String? = null,
        @Expose
        @SerializedName("TaskCompletionRate")
        var TaskCompletionRate: Float? = 0.0f,
        @Expose
        @SerializedName("AverageRating")
        var AverageRating: Int? = 0,
        @Expose
        @SerializedName("IsTaskOwner")
        var IsTaskOwner: Boolean? = false,
        @Expose
        @SerializedName("TaskOwnerId")
        var TaskOwnerId: Int? = null,
        @Expose
        @SerializedName("IsReview")
        var IsReview: Boolean? = null,
        @Expose
        @SerializedName("ReferenceBiddingUserId")
        var ReferenceBiddingUserId: String? = null,
        @Expose
        @SerializedName("ReferenceBiddingUserType")
        var ReferenceBiddingUserType: String? = null,

        @Expose
        @SerializedName("PaymentStatus")
        var PaymentStatus: String? = null,

        @Expose
        @SerializedName("ServiceFeeAmount")
        var ServiceFeeAmount: Double? = 0.0,

        @Expose
        @SerializedName("ShohokariAmount")
        var ShohokariAmount: Double? = 0.0,

        @Expose
        @SerializedName("NetTotalAmount")
        var NetTotalAmount: Double? = 0.0,

        @Expose
        @SerializedName("DiscountAmount")
        var DiscountAmount: Double? = 0.0,

        @Expose
        @SerializedName("UserPromotionId")
        var UserPromotionId: Int? = 0,
        @Expose
        @SerializedName("RatingCount")
        var RatingCount: Int? = 0
)