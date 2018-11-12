package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 13/01/18.
 */
data class UserRatingResponse(

        @Expose
        @SerializedName("Success")
         var Success: Boolean = false,

        @Expose
        @SerializedName("ResponseData")
        var responseData: ResponseData? = null
)

