package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DashboardTaskSummaryResponse(

        @Expose
        @SerializedName("Success")
         var Success: Boolean = false,

        @Expose
        @SerializedName("ResponseData")
        var responseData: ResponseData? = null
)