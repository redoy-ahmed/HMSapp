package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Skill(

        @Expose
        @SerializedName("UserId")
        var UserId: Long? = null,

        @Expose
        @SerializedName("WhatIamlookingfor")
        var WhatIamlookingfor: ArrayList<String>? = null,

        @Expose
        @SerializedName("Languages")
        var Languages: ArrayList<String>? = null,

        @Expose
        @SerializedName("Qualifications")
        var Qualifications: ArrayList<String>? = null,

        @Expose
        @SerializedName("Experiences")
        var Experiences: ArrayList<String>? = null,

        @Expose
        @SerializedName("GoAround")
        var GoAround: ArrayList<String>? = null,

        @Expose
        @SerializedName("Remarks")
        var Remarks: String? = null

)