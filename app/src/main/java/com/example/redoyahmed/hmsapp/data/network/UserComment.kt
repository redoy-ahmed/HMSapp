package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by jyotidubey on 17/01/18.
 */
data class UserComment(
        @Expose
        @SerializedName("Id")
        var UserCommentId: Long? = null,
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
        var LikeCount: Int? = null,
        @Expose
        @SerializedName("LikeStatus")
        var LikeStatus: Int? = null,
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
        var user: User? = null)



