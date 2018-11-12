package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 11/01/18.
 */
class UserCommentRequest {


    data class ServerUserCommentRequest internal constructor(
            @Expose
            @SerializedName("EntityId") internal val EntityId: Long,
            @Expose
            @SerializedName("EntityName") internal val EntityName: String,
            @Expose
            @SerializedName("Page") internal val Page: Int,
            @Expose
            @SerializedName("Count") internal val Count: Int

    )


    data class ServerUserCommentPostPostRequest internal constructor(

            @Expose
            @SerializedName("Id")
            internal val UserCommentId: Long,
            @Expose
            @SerializedName("EntityId")
            internal val EntityId: Long,
            @Expose
            @SerializedName("EntityName")
            internal val EntityName: String,
            @Expose
            @SerializedName("CommentText")
            internal val CommentText: String,
            @Expose
            @SerializedName("AdditionalData")
            internal val AdditionalData: String?,
            @Expose
            @SerializedName("InlineTags")
            internal val InlineTags: String?
    )

}