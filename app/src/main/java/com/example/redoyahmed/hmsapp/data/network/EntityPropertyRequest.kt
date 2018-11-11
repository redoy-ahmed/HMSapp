package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 11/01/18.
 */
class EntityPropertyRequest {

    data class ServerEntityPropertyPostRequest internal constructor(

            @Expose
            @SerializedName("EntityId")
            var EntityId: Long? = null,

            @Expose
            @SerializedName("EntityName")
            var EntityName: String? = null,

            @Expose
            @SerializedName("PropertyName")
            var PropertyName: String? = null,

            @Expose
            @SerializedName("Value")
            var Value: String? = null )
}