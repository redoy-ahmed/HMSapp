package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 11/01/18.
 */
class TaskRequest {

    data class ServerTaskRequest internal constructor(
            @Expose
            @SerializedName("SearchText") internal val SearchText: String,
            @Expose
            @SerializedName("Distance") internal val Distance: Double,
            @Expose
            @SerializedName("Location") internal val Location: String,
            @Expose
            @SerializedName("InPersonOrOnline") internal val InPersonOrOnline: Boolean,
            @Expose
            @SerializedName("FromPrice") internal val FromPrice: Double,
            @Expose
            @SerializedName("ToPrice") internal val ToPrice: Double,
            @Expose
            @SerializedName("IsHideAssignTask") internal val IsHideAssignTask: Int,
            @Expose
            @SerializedName("Latitude") internal val Latitude: Double,
            @Expose
            @SerializedName("Longitude") internal val Longitude: Double,
            @Expose
            @SerializedName("UserId") internal val UserId: Long,
            @Expose
            @SerializedName("Status") internal val Status: Int,
            @Expose
            @SerializedName("Page") internal val Page: Int,
            @Expose
            @SerializedName("Count") internal val Count: Int
    )

    data class ServerTaskPostRequest internal constructor(

            @Expose
            @SerializedName("UserId")
            internal val UserId: Long,

            @Expose
            @SerializedName("Title")
            internal val Title: String,

            @Expose
            @SerializedName("Description")
            internal val Description: String,

            @Expose
            @SerializedName("IsInPersonOrOnline")
            internal val IsInPersonOrOnline: Boolean,

            @Expose
            @SerializedName("DutDateType")
            internal val DutDateType: Int,

            @Expose
            @SerializedName("DeliveryDate")
            internal val DeliveryDate: String,

            @Expose
            @SerializedName("DeliveryTime")
            internal val DeliveryTime: String,

            @Expose
            @SerializedName("WorkerNumber")
            internal val WorkerNumber: Int,

            @Expose
            @SerializedName("Skill")
            internal val Skill: String,

            @Expose
            @SerializedName("IsFixedPrice")
            internal val IsFixedPrice: Boolean,

            @Expose
            @SerializedName("HourlyRate")
            internal val HourlyRate: Double,

            @Expose
            @SerializedName("FixedBudgetAmount")
            internal val FixedBudgetAmount: Double,

            @Expose
            @SerializedName("NetTotalAmount")
            internal val NetTotalAmount: Double,

            @Expose
            @SerializedName("PaidAmount")
            internal val PaidAmount: Double,

            @Expose
            @SerializedName("DueAmount")
            internal val DueAmount: Double,

            @Expose
            @SerializedName("JobCategory")
            internal val JobCategory: String,

            @Expose
            @SerializedName("EmployeeId")
            internal val EmployeeId: Long,

            @Expose
            @SerializedName("TotalBidsNumber")
            internal val TotalBidsNumber: Int,

            @Expose
            @SerializedName("PreferedLocation")
            internal val PreferedLocation: String,

            @Expose
            @SerializedName("Latitude")
            internal val Latitude: Double,

            @Expose
            @SerializedName("Longitude")
            internal val Longitude: Double,

            @Expose
            @SerializedName("Requirements")
            internal val Requirements: String,

            @Expose
            @SerializedName("TotalHours")
            internal val TotalHours: Double,

            @Expose
            @SerializedName("Id")
            internal val TaskId: Long = 0,

            @SerializedName("Status")
            internal val Status: Int
    )
}