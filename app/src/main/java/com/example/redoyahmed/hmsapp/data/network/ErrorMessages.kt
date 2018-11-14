package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ErrorMessages(

    @Expose
    @SerializedName("errorMessages")
    var errorMessages: String? = null
)