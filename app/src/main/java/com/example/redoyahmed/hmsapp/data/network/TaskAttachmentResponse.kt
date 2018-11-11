package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TaskAttachmentResponse(

        @Expose
        @SerializedName("Success")
        private var Success: Boolean = false,

        @Expose
        @SerializedName("Messages")
        private var Messages: Messages? = null
)