package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ChangePasswordResponse(

        @Expose
        @SerializedName("Success")
        private var Success: Boolean = false,

        @Expose
        @SerializedName("Messages")
        private var Messages: Messages? = null
)