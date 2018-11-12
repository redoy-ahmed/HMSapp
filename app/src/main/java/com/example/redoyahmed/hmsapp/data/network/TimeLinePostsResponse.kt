package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TimeLinePostsResponse(

        @Expose
        @SerializedName("Success")
        var Success: Boolean = false,

        @Expose
        @SerializedName("ResponseData")
        var responseData: ResponseData? = null,

        @Expose
        @SerializedName("Comment")
        var Comment: UserCommentPublicModelList? = null
)