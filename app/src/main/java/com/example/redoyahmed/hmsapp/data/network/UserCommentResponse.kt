package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserCommentResponse(

        @Expose
        @SerializedName("Success")
        private var Success: Boolean = false,

        @Expose
        @SerializedName("Comments")
        var userCommentPublicModelList: List<UserCommentPublicModelList>? = null
)