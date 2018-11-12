package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Resolution(

        @Expose
        @SerializedName("UserId")
        var UserId: Long = 0,

        @Expose
        @SerializedName("CreationDate")
        var CreationDate: String? = null,

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
        @SerializedName("EmailAddress")
        var EmailAddress: String? = null,

        @Expose
        @SerializedName("PhoneNumber")
        var PhoneNumber: String? = null,

        @Expose
        @SerializedName("InitiatorId")
        var InitiatorId: String? = null,

        @Expose
        @SerializedName("ServiceDate")
        var ServiceDate: String? = null,

        @Expose
        @SerializedName("ResolutionType")
        var ResolutionType: String? = null,

        @Expose
        @SerializedName("Id")
        var Id: Long? = null
)