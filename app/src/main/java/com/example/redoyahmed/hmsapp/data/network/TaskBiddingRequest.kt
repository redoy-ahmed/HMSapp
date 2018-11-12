package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 11/01/18.
 */
class TaskBiddingRequest {


    data class ServerTaskBiddingRequest internal constructor(
            @Expose
            @SerializedName("TaskId") internal val TaskId: Long,
            @Expose
            @SerializedName("IsAll") internal val InPersonOrOnline: Boolean,
            @Expose
            @SerializedName("Page") internal val Page: Int,
            @Expose
            @SerializedName("Count") internal val Count: Int,
            @Expose
            @SerializedName("userId") internal val userId: Long

    )


    data class ServerTaskBiddingPostRequest internal constructor(

            @Expose
            @SerializedName("Id")
            internal val TaskBiddingId: Long,

            @Expose
            @SerializedName("UserId")
            internal val UserId: Long = 0,

            @Expose
            @SerializedName("Status")
            internal val Status: Int = 0,

            @Expose
            @SerializedName("TaskId")
            internal val TaskId: Long,

            @Expose
            @SerializedName("CoverLetter")
            internal val CoverLetter: String?,

            @Expose
            @SerializedName("Description")
            internal val Description: String?,

            @Expose
            @SerializedName("DeliveryDate")
            internal val DeliveryDate: String?,

            @Expose
            @SerializedName("DeliveryTime")
            internal val DeliveryTime: String?,

            @Expose
            @SerializedName("FixedbiddigAmount")
            internal val FixedbiddigAmount: Double,

            @Expose
            @SerializedName("TotalHourPerWeek")
            internal val TotalHourPerWeek: Double?,

            @Expose
            @SerializedName("TotalHour")
            internal val TotalHour: Double?,

            @Expose
            @SerializedName("HourlyRate")
            internal val HourlyRate: Double?,

            @Expose
            @SerializedName("ReferenceId")
            internal val ReferenceId: String?,

            @Expose
            @SerializedName("ReferenceType")
            internal val ReferenceType: String?,

            @Expose
            @SerializedName("PaymentStatus")
            internal val PaymentStatus: Int? = 0,

            @Expose
            @SerializedName("ServiceFeeAmount")
            var ServiceFeeAmount: Double = 0.0,

            @Expose
            @SerializedName("ShohokariAmount")
            var ShohokariAmount: Double = 0.0,

            @Expose
            @SerializedName("NetTotalAmount")
            var NetTotalAmount: Double,

            @Expose
            @SerializedName("DiscountAmount")
            var DiscountAmount: Double,

            @Expose
            @SerializedName("UserPromotionId")
            var UserPromotionId: Int
    )


}