package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

data class UserRatings(

        @Expose
        @SerializedName("Id")
        var UserRatingId: Long = 0,

        @Expose
        @SerializedName("UserId")
        var UserId: Long = 0,

        @Expose
        @SerializedName("User")
        var User: User? = null,

        @Expose
        @SerializedName("Status")
        var Status: Int? = 0,

        @Expose
        @SerializedName("CreationDate")
        var CreationDate: String? = null,

        @Expose
        @SerializedName("Rating")
        var Rating: Double? = 0.0,

        @Expose
        @SerializedName("TaskBiddingId")
        var TaskBiddingId: Long? = 0,

        @Expose
        @SerializedName("EmployeeId")
        var EmployeeId: Long? = 0,

        @Expose
        @SerializedName("Comments")
        var Comments: String? = null,

        @Expose
        @SerializedName("InitiatorName")
        var InitiatorName: String? = null,

        @Expose
        @SerializedName("TaskTitle")
        var TaskTitle: String? = null,

        @Expose
        @SerializedName("IsPoster")
        var IsPoster: Boolean? = false,

        @Expose
        @SerializedName("ProfileImageUrl")
        var ProfileImageUrl: String? = null,

        @Expose
        @SerializedName("EmployeeName")
        var EmployeeName: String? = null


)