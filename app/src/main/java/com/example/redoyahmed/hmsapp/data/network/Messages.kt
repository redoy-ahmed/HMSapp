package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Messages(

    @Expose
    @SerializedName("messages")
    var messages: String? = null
)