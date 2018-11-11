package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserCommentPublicModelList(

        @Expose
        @SerializedName("Id")
        var Id: Long? = null,

        @Expose
        @SerializedName("EntityId")
        var EntityId: Long? = null,

        @Expose
        @SerializedName("EntityName")
        var EntityName: String? = null,

        @Expose
        @SerializedName("CommentText")
        var CommentText: String? = null,

        @Expose
        @SerializedName("AdditionalData")
        var AdditionalData: String? = null,

        @Expose
        @SerializedName("CanDelete")
        var CanDelete: Boolean? = null,

        @Expose
        @SerializedName("LikeCount")
        var LikeCount: Long? = null,

        @Expose
        @SerializedName("LikeStatus")
        var LikeStatus: Long? = null,

        @Expose
        @SerializedName("DateCreatedUtc")
        var DateCreatedUtc: String? = null,

        @Expose
        @SerializedName("DateCreated")
        var DateCreated: String? = null,

        @Expose
        @SerializedName("IsSpam")
        var IsSpam: Boolean? = null,

        @Expose
        @SerializedName("User")
        var User: User? = null
)