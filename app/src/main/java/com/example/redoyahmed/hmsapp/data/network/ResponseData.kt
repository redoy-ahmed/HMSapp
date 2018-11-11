package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 17/01/18.
 */
data class ResponseData(

        @Expose
        @SerializedName("User")
        var user: User? = null,

        @Expose
        @SerializedName("Locations")
        var taskList: List<Task>? = null,

        @Expose
        @SerializedName("Task")
        var task: Task? = null,

        @Expose
        @SerializedName("TaskAlertKeywords")
        var taskAlertKeywordList: List<TaskAlertKeyword>? = null,

        @Expose
        @SerializedName("TaskAlertKeyword")
        var taskAlertKeyword: TaskAlertKeyword? = null,

        @Expose
        @SerializedName("skill")
        var skill: Skill? = null,

        @Expose
        @SerializedName("UserNotificationSetting")
        var userNotificationSetting: UserNotificationSetting? = null,

        @Expose
        @SerializedName("UserRatings")
        var userRatings: List<UserRatings>? = null,

        @Expose
        @SerializedName("UserRating")
        var userRating: UserRatings? = null,

        @Expose
        @SerializedName("PaymentMethod")
        var paymentMethod: PaymentMethod? = null,

        @Expose
        @SerializedName("PaymentMethods")
        var paymentMethodList: List<PaymentMethod>? = null,



        @Expose
        @SerializedName("BillingAddress")
        var billingAddress: BillingAddress? = null,

        @Expose
        @SerializedName("TaskPayments")
        var taskPayments: List<TaskPayment>? = null,

        @Expose
        @SerializedName("TaskPayment")
        var taskPayment: TaskPayment? = null,

        @Expose
        @SerializedName("TaskBiddings")
        var taskBiddingList: List<Taskbidding>? = null,

        @Expose
        @SerializedName("TaskBidding")
        var taskBidding: Taskbidding? = null,

        @Expose
        @SerializedName("TimelinePosts")
        var timelinePostList: List<TimeLinePosts>? = null,

        @Expose
        @SerializedName("Post")
        var timelinePost: TimeLinePosts? = null,

        @Expose
        @SerializedName("Notifications")
        var notifications: List<Notifications>? = null,

        @Expose
        @SerializedName("UserRatingSummaryData")
        var userRatingSummaryData: List<UserRatingSummaryData>? = null,

        @Expose
        @SerializedName("TaskSummaryUserData")
        var taskSummaryUserData: TaskSummaryUserData? = null,

        @Expose
        @SerializedName("Images")
        var mediaList: List<Media>? = null,

        @Expose
        @SerializedName("About")
        var about: About? = null,

        @Expose
        @SerializedName("Image")
        var media: Media? = null,

        @Expose
        @SerializedName("TaskPictures")
        var taskPictureList: List<Media>? = null,

        @Expose
        @SerializedName("UserBadges")
        var userBadges: List<UserBadges>? = null,

        @Expose
        @SerializedName("UserBadge")
        var userBadge: UserBadges? = null,

        @Expose
        @SerializedName("UserPortfulio")
        var userPortfulio: UserPortfulio? = null,

        @Expose
        @SerializedName("FCMDeviceInfo")
        var fcmDeviceInfo: FCMDeviceInfo? = null,

        @Expose
        @SerializedName("UserPromotions")
        var UserPromotions: List<UserPromotions>? = null,

        @Expose
        @SerializedName("UserPromotion")
        var userPromotion: UserPromotion? = null,

        @Expose
        @SerializedName("Resolution")
        var Resolution: Resolution? = null,

        @Expose
        @SerializedName("EntityProperty")
        var entityProperty: EntityProperty? = null
)