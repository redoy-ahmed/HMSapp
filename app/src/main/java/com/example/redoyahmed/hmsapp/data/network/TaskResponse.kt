package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 13/01/18.
 */
data class TaskResponse(

        @Expose
        @SerializedName("Success")
        private var Success: Boolean = false,

        @Expose
        @SerializedName("ResponseData")
        var responseData: ResponseData? = null,

        @Expose
        @SerializedName("Messages")
        var Messages: Messages? = null,

        @Expose
        @SerializedName("ErrorMessages")
        var ErrorMessages: Messages? = null

)

