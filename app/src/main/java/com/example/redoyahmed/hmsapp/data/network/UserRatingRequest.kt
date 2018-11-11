package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 11/01/18.
 */
class UserRatingRequest {



    data class ServerUserRatingPostRequest internal constructor(

            @Expose
            @SerializedName("Id")
            internal val UserRatingId: Long,

            @Expose
            @SerializedName("UserId")
            internal val UserId: Long = 0,

            @Expose
            @SerializedName("Status")
            internal val Status: Int = 0,

            @Expose
            @SerializedName("CreationDate")
            internal val CreationDate: String?,

            @Expose
            @SerializedName("Rating")
                internal val Rating: Double,

            @Expose
            @SerializedName("TaskBiddingId")
            internal val TaskBiddingId: Long,

            @Expose
            @SerializedName("EmployeeId")
            internal val EmployeeId: Long,

            @Expose
            @SerializedName("Comments")
            internal val Comments: String?,

            @Expose
            @SerializedName("InitiatorName")
            internal val InitiatorName: String?,

            @Expose
            @SerializedName("TaskTitle")
            internal val TaskTitle: String?
    )


}