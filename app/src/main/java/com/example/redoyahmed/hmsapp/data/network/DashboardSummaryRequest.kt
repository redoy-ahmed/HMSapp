package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DashboardSummaryRequest {

    data class GetDashboardSummaryRequest internal constructor(@Expose
                                                               @SerializedName("UserId")
                                                               var UserId: Long? = null)
}