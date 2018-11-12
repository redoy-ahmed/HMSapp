package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 17/01/18.
 */
data class TimeLinePosts(

        @Expose
        @SerializedName("Id")
        var TimeLinePostId: Long? = null,

        @Expose
        @SerializedName("OwnerId")
        var OwnerId: Long? = null,

        @Expose
        @SerializedName("OwnerEntityType")
        var OwnerEntityType: String? = null,

        @Expose
        @SerializedName("OwnerImageUrl")
        var OwnerImageUrl: String? = null,

        @Expose
        @SerializedName("OwnerProfileUrl")
        var OwnerProfileUrl: String? = null,

        @Expose
        @SerializedName("OwnerName")
        var OwnerName: String? = null,

        @Expose
        @SerializedName("PostTypeName")
        var PostTypeName: String? = null,

        @Expose
        @SerializedName("IsSponsored")
        var IsSponsored: Boolean? = null,

        @Expose
        @SerializedName("Message")
        var Message: String? = null,

        @Expose
        @SerializedName("AdditionalAttributeValue")
        var AdditionalAttributeValue: String? = null,

        @Expose
        @SerializedName("DateCreatedUtc")
        var DateCreatedUtc: String? = null,

        @Expose
        @SerializedName("DateUpdatedUtc")
        var DateUpdatedUtc: String? = null,

        @Expose
        @SerializedName("DateCreated")
        var DateCreated: String? = null,

        @Expose
        @SerializedName("DateUpdated")
        var DateUpdated: String? = null,

        @Expose
        @SerializedName("TotalLikes")
        var TotalLikes: Int? = null,

        @Expose
        @SerializedName("TotalComments")
        var TotalComments: Int? = null,

        @Expose
        @SerializedName("CanDelete")
        var CanDelete: Boolean? = null,

        @Expose
        @SerializedName("PublishDateUtc")
        var PublishDateUtc: String? = null,

        @Expose
        @SerializedName("PublishDate")
        var PublishDate: String? = null,

        @Expose
        @SerializedName("LikeStatus")
        var LikeStatus: Int? = null,

        @Expose
        @SerializedName("IsOwner")
        var IsOwner: Boolean? = false,

        @Expose
        @SerializedName("Checkin")
        var Checkin: String? = null,

        @Expose
        @SerializedName("FromLat")
        var FromLat: Double? = null,

        @Expose
        @SerializedName("FromLng")
        var FromLng: Double? = null,

        @Expose
        @SerializedName("TaskId")
        var TaskId: Long? = null,

        @Expose
        @SerializedName("IsPrivate")
        var IsPrivate: Boolean? = false,

        @Expose
        @SerializedName("InlineTags")
        var InlineTags: String? = null,

        @Expose
        @SerializedName("UserCommentPublicModelList")
        var UserCommentPublicModelList: List<UserCommentPublicModelList>? = null
)