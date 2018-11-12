package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ReportTaskRequest {

    data class ReportTaskRequestCall internal constructor(
            @Expose
            @SerializedName("Status")
            var Status: Int? = null,

            @Expose
            @SerializedName("Title")
            var Title: String? = null,

            @Expose
            @SerializedName("Description")
            var Description: String? = null,

            @Expose
            @SerializedName("Remarks")
            var Remarks: String? = null,

            @Expose
            @SerializedName("InitiatorId")
            var InitiatorId: Long? = null,

            @Expose
            @SerializedName("ServiceDate")
            var ServiceDate: String? = null,

            @Expose
            @SerializedName("ResolutionType")
            var ResolutionType: String? = null
    )
}