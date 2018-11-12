package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 17/01/18.
 */
data class TaskPayment(

        @Expose
        @SerializedName("Id")
        var TaskPaymentId: Long = 0,

        @Expose
        @SerializedName("UserId")
        var UserId: Long? = 0,

        @Expose
        @SerializedName("ProfileImageUrl")
        var ProfileImageUrl: String? = null,

        @Expose
        @SerializedName("ProfileOwnerName")
        var ProfileOwnerName: String? = null,

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
        var VersionNumber: Int? = 0,

        @Expose
        @SerializedName("TaskId")
        var TaskId: Long? = 0,

        @Expose
        @SerializedName("PaymentType")
        var PaymentType: String? = null,

        @Expose
        @SerializedName("PaymentMethod")
        var PaymentMethod: String? = null,

        @Expose
        @SerializedName("EmployeeID")
        var EmployeeID: Long? = 0,

        @Expose
        @SerializedName("EmployeePaymentGateWayId")
        var EmployeePaymentGateWayId: Int? = null,

        @Expose
        @SerializedName("PayableAmount")
        var PayableAmount: Double? = null,

        @Expose
        @SerializedName("DueAmount")
        var DueAmount: Double? = null,

        @Expose
        @SerializedName("PaymentAmount")
        var PaymentAmount: Double? = null,

        @Expose
        @SerializedName("TaskBiddingId")
        var TaskBiddingId: Long? = 0,

        @Expose
        @SerializedName("Description")
        var Description: String? = null,

        @Expose
        @SerializedName("AcAccountNo")
        var AcAccountNo: String? = null,

        @Expose
        @SerializedName("AccountStatus")
        var AccountStatus: String? = null,

        @Expose
        @SerializedName("TransactionType")
        var TransactionType: String? = null,

        @Expose
        @SerializedName("TaskTitle")
        var TaskTitle: String? = null,

        @Expose
        @SerializedName("NetTotalAmount")
        var NetTotalAmount: Double? = 0.0,

        @Expose
        @SerializedName("DiscountAmount")
        var DiscountAmount: Double? = 0.0,

        @Expose
        @SerializedName("UserPromotionId")
        var UserPromotionId: Int? = 0
)



