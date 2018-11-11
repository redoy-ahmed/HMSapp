package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Messages(

        @Expose
        @SerializedName("change_password")
        var change_password: List<String>? = null,

        @Expose
        @SerializedName("post_user")
        var post_user: List<String>? = null,

        @Expose
        @SerializedName("forgotpassword")
        var forgotpassword: List<String>? = null,

        @Expose
        @SerializedName("register")
        var register: List<String>? = null,

        @Expose
        @SerializedName("user_badge_post")
        var user_badge_post: List<String>? = null,

        @Expose
        @SerializedName("logout")
        var logout: List<String>? = null



)