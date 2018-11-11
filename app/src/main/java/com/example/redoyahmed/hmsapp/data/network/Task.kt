package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by jyotidubey on 17/01/18.
 */
data class Task(

        @Expose
        @SerializedName("Id")
        var Id: Long = 0,

        @Expose
        @SerializedName("UserId")
        var UserId: Long = 0,

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
        @SerializedName("Title")
        var Title: String? = null,


        @Expose
        @SerializedName("Description")
        var Description: String? = null,


        @Expose
        @SerializedName("IsInPersonOrOnline")
        var IsInPersonOrOnline: Boolean? = null,


        @Expose
        @SerializedName("DutDateType")
        var DutDateType: Int? = null,


        @Expose
        @SerializedName("DeliveryDate")
        var DeliveryDate: String? = null,


        @Expose
        @SerializedName("DeliveryTime")
        var DeliveryTime: String? = null,


        @Expose
        @SerializedName("WorkerNumber")
        var WorkerNumber: Int = 0,


        @Expose
        @SerializedName("Skill")
        var Skill: String? = null,


        @Expose
        @SerializedName("IsFixedPrice")
        var IsFixedPrice: Boolean? = null,


        @Expose
        @SerializedName("HourlyRate")
        var HourlyRate: Double? = null,


        @Expose
        @SerializedName("FixedBudgetAmount")
        var FixedBudgetAmount: Double? = null,

        @Expose
        @SerializedName("NetTotalAmount")
        var NetTotalAmount: Double? = null,

        @Expose
        @SerializedName("PaidAmount")
        var PaidAmount: Double? = null,
        @Expose
        @SerializedName("DueAmount")
        var DueAmount: Double? = null,
        @Expose
        @SerializedName("JobCategory")
        var JobCategory: String? = null,
        @Expose
        @SerializedName("EmployeeId")
        var EmployeeId: Long? = null,
        @Expose
        @SerializedName("TotalBidsNumber")
        var TotalBidsNumber: Int? = 0,
        @Expose
        @SerializedName("PreferedLocation")
        var PreferedLocation: String? = "",
        @Expose
        @SerializedName("Latitude")
        var Latitude: Double? = 0.0,
        @Expose
        @SerializedName("Longitude")
        var Longitude: Double? = 0.0,
        @Expose
        @SerializedName("OwnerName")
        var OwnerName: String? = null,
        @Expose
        @SerializedName("ThumbnailPath")
        var ThumbnailPath: String? = null,
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
        @SerializedName("Requirements")
        var Requirements: String? = null,
        @Expose
        @SerializedName("TotalHours")
        var TotalHours: Double? = null,
        @Expose
        @SerializedName("TaskTitleUrl")
        var TaskTitleUrl: String? = null,
        @Expose
        @SerializedName("LastMessage")
        var LastMessage: String? = null,
        @Expose
        @SerializedName("LastMessageDateTime")
        var LastMessageDateTime: String? = null,
        @Expose
        @SerializedName("IsReadMessage")
        var IsReadMessage: Boolean? = false,

        @Expose
        @SerializedName("TotalAcceptedNumber")
        var TotalAcceptedNumber: Int? = 0,

        @Expose
        @SerializedName("TotalCompletedNumber")
        var TotalCompletedNumber: Int? = 0

)