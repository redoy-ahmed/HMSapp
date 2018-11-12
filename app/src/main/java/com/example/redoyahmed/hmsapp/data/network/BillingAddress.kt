package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BillingAddress(

        @Expose
        @SerializedName("Id")
        var Id: Long? = null,

        @Expose
        @SerializedName("UserId")
        var UserId: Long? = null,

        @Expose
        @SerializedName("Status")
        var Status: String? = null,

        @Expose
        @SerializedName("CreationDate")
        var CreationDate: String? = "",

        @Expose
        @SerializedName("UpdatedDate")
        var UpdatedDate: String? = "",

        @Expose
        @SerializedName("Address1")
        var Address1: String? = "",

        @Expose
        @SerializedName("Address2")
        var Address2: String? = "",

        @Expose
        @SerializedName("Zip")
        var Zip: String? = "",

        @Expose
        @SerializedName("City")
        var City: String? = "",

        @Expose
        @SerializedName("State")
        var State: String? = "",

        @Expose
        @SerializedName("Country")
        var Country: String? = "",

        @Expose
        @SerializedName("IsVerified")
        var IsVerified: Boolean? = false,

        @Expose
        @SerializedName("IsDefault")
        var IsDefault: Boolean? = false
)