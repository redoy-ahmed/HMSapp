package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class TaskAlertRequest {

    data class GetAllTaskAlert internal constructor(@Expose
                                                    @SerializedName("UserId")
                                                    internal val Id: Long)

    data class AddNewTaskAlert internal constructor(@Expose
                                                    @SerializedName("Keyword")
                                                    internal val Keyword: String? = null,

                                                    @Expose
                                                    @SerializedName("IsOnline")
                                                    internal val IsOnline: Boolean? = null,

                                                    @Expose
                                                    @SerializedName("Location")
                                                    internal val Location: String? = null,

                                                    @Expose
                                                    @SerializedName("Latitude")
                                                    internal val Latitude: Double? = null,

                                                    @Expose
                                                    @SerializedName("Longitude")
                                                    internal val Longitude: Double? = null,

                                                    @Expose
                                                    @SerializedName("Distance")
                                                    internal val Distance: Int? = null,

                                                    @Expose
                                                    @SerializedName("UserId")
                                                    internal val UserId: Long? = null)

    data class UpdateTaskAlert internal constructor(@Expose
                                                    @SerializedName("Keyword")
                                                    internal val Keyword: String? = null,

                                                    @Expose
                                                    @SerializedName("IsOnline")
                                                    internal val IsOnline: Boolean? = null,

                                                    @Expose
                                                    @SerializedName("Location")
                                                    internal val Location: String? = null,

                                                    @Expose
                                                    @SerializedName("Latitude")
                                                    internal val Latitude: Double? = null,

                                                    @Expose
                                                    @SerializedName("Longitude")
                                                    internal val Longitude: Double? = null,

                                                    @Expose
                                                    @SerializedName("Distance")
                                                    internal val Distance: Int? = null,

                                                    @Expose
                                                    @SerializedName("UserId")
                                                    internal val UserId: Long? = null,

                                                    @Expose
                                                    @SerializedName("Id")
                                                    internal val Id: Long)
}