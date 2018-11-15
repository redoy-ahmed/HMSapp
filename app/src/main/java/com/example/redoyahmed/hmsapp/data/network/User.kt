package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class User(

    @Expose
    @SerializedName("userId")
    var userId: String? = null,

    @Expose
    @SerializedName("username")
    var Email: String? = null,

    @Expose
    @SerializedName("password")
    var Password: String? = null,

    @Expose
    @SerializedName("mobile")
    var Mobile: String? = null,

    @Expose
    @SerializedName("address")
    var Address: String? = null,

    @Expose
    @SerializedName("gender")
    var Gender: String? = null,

    @Expose
    @SerializedName("token")
    var Token: String? = null,

    @Expose
    @SerializedName("roles")
    var roles: List<Task>? = null
)