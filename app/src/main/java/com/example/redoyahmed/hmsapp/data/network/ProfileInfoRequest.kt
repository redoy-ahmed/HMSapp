package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProfileInfoRequest {


    data class UpdateProfileInfoGeneral internal constructor
    (
            @Expose
            @SerializedName("Id")
            internal val Id: Long?,

            @Expose
            @SerializedName("FirstName")
            internal val FirstName: String?,

            @Expose
            @SerializedName("LastName")
            internal val LastName: String?,

            @Expose
            @SerializedName("Headline")
            internal val Headline: String?,

            @Expose
            @SerializedName("BriefBio")
            internal val BriefBio: String?,

            @Expose
            @SerializedName("MobileNumber")
            internal val MobileNumber: String?,

            @Expose
            @SerializedName("DateofBirth")
            internal val DateofBirth: String?,

            @Expose
            @SerializedName("Address")
            internal val Address: String?,

            @Expose
            @SerializedName("Latitude")
            internal val Latitude: String?,

            @Expose
            @SerializedName("Longitude")
            internal val Longitude: String?
    )


    data class UpdateProfileInfoSkill internal constructor
    (
            @Expose
            @SerializedName("Id")
            internal val Id: Int? = null,

            @Expose
            @SerializedName("UserId")
            internal val UserId: Int? = null,

            @Expose
            @SerializedName("WhatIamlookingfor")
            internal val WhatIamlookingfor: String? = null,

            @Expose
            @SerializedName("Languages")
            internal val Languages: String? = null,

            @Expose
            @SerializedName("Qualifications")
            internal val Qualifications: String? = null,

            @Expose
            @SerializedName("Experiences")
            internal val Experiences: String? = null,

            @Expose
            @SerializedName("GoAround")
            internal val GoAround: String? = null,

            @Expose
            @SerializedName("Remarks")
            internal val Remarks: String? = null
    )

    data class GetPublicProfileInfo internal constructor
    (
            @Expose
            @SerializedName("Id")
            internal val Id: Long? = null
    )


}