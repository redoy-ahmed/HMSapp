package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by jyotidubey on 17/01/18.
 */
data class Notification(


        @Expose
        @SerializedName("TaskTitleUrl")
        var IsRead: Boolean? = false,

        @Expose
        @SerializedName("PublishDateTime")
        var PublishDateTime: Date? = null,

        @Expose
        @SerializedName("ReadDateTime")
        var ReadDateTime: Date? = null,

        @Expose
        @SerializedName("EntityId")
        var EntityId: Int? = null,

        @Expose
        @SerializedName("EntityName")
        var EntityName: String? = null,

        @Expose
        @SerializedName("EntityTitle")
        var EntityTitle: String? = null,

        @Expose
        @SerializedName("EntityDescription")
        var EntityDescription: String? = null,

        @Expose
        @SerializedName("EventName")
        var EventName: String? = null,

        @Expose
        @SerializedName("InitiatorId")
        var InitiatorId: String? = null,

        @Expose
        @SerializedName("InitiatorDisplayName")
        var InitiatorDisplayName: String? = null,

        @Expose
        @SerializedName("InitiatorImageUrl")
        var InitiatorImageUrl: String? = null,

        @Expose
        @SerializedName("Message")
        var Message: String? = null

)