package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TaskSummaryUserData(

        @Expose
        @SerializedName("PosterTaskDraftCount")
        var PosterTaskDraftCount: Int? = null,

        @Expose
        @SerializedName("PosterTaskOpenForBidCount")
        var PosterTaskOpenForBidCount: Int? = null,

        @Expose
        @SerializedName("PosterTaskAssignedCount")
        var PosterTaskAssignedCount: Int? = null,

        @Expose
        @SerializedName("PosterTaskAwaitingPaymentCount")
        var PosterTaskAwaitingPaymentCount: Int? = null,

        @Expose
        @SerializedName("PosterTaskCompletedCount")
        var PosterTaskCompletedCount: Int? = null,

        @Expose
        @SerializedName("TaskBidOnCount")
        var TaskBidOnCount: Int? = null,

        @Expose
        @SerializedName("TaskAssignedCount")
        var TaskAssignedCount: Int? = null,

        @Expose
        @SerializedName("TaskAwaitingPaymentCount")
        var TaskAwaitingPaymentCount: Int? = null,

        @Expose
        @SerializedName("TaskCompletedCount")
        var TaskCompletedCount: Int? = null,

        @Expose
        @SerializedName("TaskOverDueCount")
        var TaskOverDueCount: Int? = null,

        @Expose
        @SerializedName("PosterTaskOverDueCount")
        var PosterTaskOverDueCount: Int? = null,

        @Expose
        @SerializedName("Id")
        var Id: Int? = null
)