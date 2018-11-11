package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Notifications(

        @Expose
        @SerializedName("IsRead")
        var IsRead: Boolean? = false,

        @Expose
        @SerializedName("PublishDateTime")
        var PublishDateTime: String? = null,

        @Expose
        @SerializedName("ReadDateTime")
        var ReadDateTime: String? = null,

        @Expose
        @SerializedName("EntityId")
        var EntityId: Long? = null,

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
        @SerializedName("InitiatorName")
        var InitiatorName: String? = null,


        @Expose
        @SerializedName("InitiatorImageUrl")
        var InitiatorImageUrl: String? = null,

        @Expose
        @SerializedName("Message")
        var Message: String? = null,

        @Expose
        @SerializedName("WebUrl")
        var WebUrl: String? = null,

        @Expose
        @SerializedName("Description")
        var Description: String? = null,

        @Expose
        @SerializedName("NotificationEventId")
        var NotificationEventId: Int = 0,

        @Expose
        @SerializedName("Id")
        var Id: Long = 0


)