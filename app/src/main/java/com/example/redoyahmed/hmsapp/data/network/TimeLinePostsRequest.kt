package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 11/01/18.
 */
class TimeLinePostsRequest {


    data class ServerTimeLineRequest internal constructor(

            @Expose
            @SerializedName("CustomerId") internal val CustomerId: Long,
            @Expose
            @SerializedName("TaskId") internal val TaskId: Long,
            @Expose
            @SerializedName("timeLineId") internal val timeLineId: Long,
            @Expose
            @SerializedName("IsPrivate") internal val IsPrivate: Boolean,
            @Expose
            @SerializedName("Page") internal val Page: Int,
            @Expose
            @SerializedName("Count") internal val Count: Int

    )


    data class ServerTimeLinePostRequest internal constructor(

//            @Expose
//            @SerializedName("OwnerId")
//            internal val OwnerId: Long,
//
//            @Expose
//            @SerializedName("OwnerEntityType")
//            internal val OwnerEntityType: String,

            @Expose
            @SerializedName("PostTypeName")
            internal val PostTypeName: String?,

//            @Expose
//            @SerializedName("IsSponsored")
//            internal val IsSponsored: Boolean,

            @Expose
            @SerializedName("Message")
            internal val Message: String?,

            @Expose
            @SerializedName("AdditionalAttributeValue")
            internal val AdditionalAttributeValue: String?,

//            @Expose
//            @SerializedName("LinkedToEntityId")
//            internal val LinkedToEntityId: Long?,
//
//            @Expose
//            @SerializedName("LinkedToEntityName")
//            internal val LinkedToEntityName: String?,

//            @Expose
//            @SerializedName("IsHidden")
//            internal val IsHidden: Boolean,

//            @Expose
//            @SerializedName("PublishDate")
//            internal val PublishDate: String?,

            @Expose
            @SerializedName("InlineTags")
            internal val InlineTags: String?,

            @Expose
            @SerializedName("Checkin")
            internal val Checkin: String?,

            @Expose
            @SerializedName("FromLat")
            internal val FromLat: Double?,

            @Expose
            @SerializedName("FromLng")
            internal val FromLng: Double?,

            @Expose
            @SerializedName("TaskId")
            internal val TaskId: Long?,

            @Expose
            @SerializedName("IsPrivate")
            internal val IsPrivate: Boolean? = false
    )

    data class ServerTimeLineCommentPostRequest internal constructor(

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
            internal val AdditionalData: String,

            @Expose
            @SerializedName("CanDelete")
            internal val CanDelete: Boolean?,

            @Expose
            @SerializedName("UserId")
            internal val UserId: Long?


    )
}
