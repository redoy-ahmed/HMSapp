package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserRatingSummaryData(

        @Expose
        @SerializedName("CompletedTaskerTaskCount")
        var CompletedTaskerTaskCount: Int? = null,

        @Expose
        @SerializedName("TaskerCompletionRate")
        var TaskerCompletionRate: Int? = null,

        @Expose
        @SerializedName("PosterCompletionRate")
        var PosterCompletionRate: Int? = null,

        @Expose
        @SerializedName("CompletedPosterTaskCount")
        var CompletedPosterTaskCount: Int? = null,

        @Expose
        @SerializedName("IsPoster")
        var IsPoster: Boolean? = false,

        @Expose
        @SerializedName("TotalTaskerFiveStar")
        var TotalTaskerFiveStar: Int? = null,

        @Expose
        @SerializedName("TotalTaskerFourStar")
        var TotalTaskerFourStar: Int? = null,

        @Expose
        @SerializedName("TotalTaskerThreeStar")
        var TotalTaskerThreeStar: Int? = null,

        @Expose
        @SerializedName("TotalTaskerTwoStar")
        var TotalTaskerTwoStar: Int? = null,

        @Expose
        @SerializedName("TotalTaskerOneStar")
        var TotalTaskerOneStar: Int? = null,

        @Expose
        @SerializedName("TotalPosterFiveStar")
        var TotalPosterFiveStar: Int? = null,

        @Expose
        @SerializedName("TotalPosterFourStar")
        var TotalPosterFourStar: Int? = null,

        @Expose
        @SerializedName("TotalPosterThreeStar")
        var TotalPosterThreeStar: Int? = null,

        @Expose
        @SerializedName("TotalPosterTwoStar")
        var TotalPosterTwoStar: Int? = null,

        @Expose
        @SerializedName("TaskerAverageRating")
        var TaskerAverageRating: Int? = null,

        @Expose
        @SerializedName("TaskerRatingCount")
        var TaskerRatingCount: Int? = null,

        @Expose
        @SerializedName("PosterAverageRating")
        var PosterAverageRating: Int? = null,

        @Expose
        @SerializedName("PosterRatingCount")
        var PosterRatingCount: Int? = null,

        @Expose
        @SerializedName("Id")
        var Id: Int? = null
)