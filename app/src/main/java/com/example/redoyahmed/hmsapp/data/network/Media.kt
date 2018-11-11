package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.shohokari.data.models.therest.AttachmentType
import java.util.*

/**
 * Created by jyotidubey on 17/01/18.
 */
data class Media(

        @Expose
        @SerializedName("Id")
        var MediaId: Long? = null,
        @Expose
        @SerializedName("DateCreatedUtc")
        var DateCreatedUtc: String? = null,
        @Expose
        @SerializedName("DateCreatedLocal")
        var DateCreatedLocal: String? = null,
        @Expose
        @SerializedName("CreatedBy")
        var CreatedBy: String? = null,
        @Expose
        @SerializedName("Url")
        var Url: String? = null,
        @Expose
        @SerializedName("ThumbnailUrl")
        var ThumbnailUrl: String? = null,
        @Expose
        @SerializedName("MediaType")
        var MediaType: Int? = null,
        @Expose
        @SerializedName("MimeType")
        var MimeType: String? = null,
        @Expose
        @SerializedName("TotalLikes")
        var TotalLikes: Int? = null,
        @Expose
        @SerializedName("TotalComments")
        var TotalComments: Int? = null,
        @Expose
        @SerializedName("CanComment")
        var CanComment: Boolean? = null,
        @Expose
        @SerializedName("LikeStatus")
        var LikeStatus: Int? = null,
        @Expose
        @SerializedName("NextMediaId")
        var NextMediaId: Int? = null,
        @Expose
        @SerializedName("FullyLoaded")
        var FullyLoaded: Boolean? = null,

        @Expose
        @SerializedName("ThumbnailPath")
        var ThumbnailPath: String? = null,



        var  attachmentType : AttachmentType = AttachmentType.OTHER

)



