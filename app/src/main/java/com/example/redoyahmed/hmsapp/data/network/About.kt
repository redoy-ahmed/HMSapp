package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class About(

        @Expose
        @SerializedName("UserId")
        var UserId: Long? = null,

        @Expose
        @SerializedName("User")
        var User: User? = null,

        @Expose
        @SerializedName("WhatIamlookingfor")
        var WhatIamlookingfor: String? = null,

        @Expose
        @SerializedName("Languages")
        var Languages: String? = null,

        @Expose
        @SerializedName("Qualifications")
        var Qualifications: String? = null,

        @Expose
        @SerializedName("Experiences")
        var Experiences: String? = null,

        @Expose
        @SerializedName("GoAround")
        var GoAround: String? = null,

        @Expose
        @SerializedName("Remarks")
        var Remarks: String? = null,

        @Expose
        @SerializedName("Id")
        var Id: Int? = null
)