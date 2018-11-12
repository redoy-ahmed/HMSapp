package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserSkillListRequest {

    data class GetUserSkillListRequest internal constructor(
            @Expose
            @SerializedName("UserId")
            var UserId: Long? = null)

    data class AddUsersSkillListRequest internal constructor(
            @Expose
            @SerializedName("UserId")
            var UserId: Long? = null,

            @Expose
            @SerializedName("WhatIamlookingfor")
            var WhatIamlookingfor: String? = null,

            @Expose
            @SerializedName("Languages")
            var Languages: String? = null,

            @Expose
            @SerializedName("Qualifications")
            var Qualifications: String ? = null,

            @Expose
            @SerializedName("Experiences")
            var Experiences: String? = null,

            @Expose
            @SerializedName("GoAround")
            var GoAround: String ? = null,

            @Expose
            @SerializedName("Remarks")
            var Remarks: String? = null)

//        data class UpdateUsersSkillListRequest internal constructor(
//                @Expose
//                @SerializedName("UserId")
//                var UserId: Long? = 0,
//
//                @Expose
//                @SerializedName("Id")
//                var Id: Long? = 0,
//
//                @Expose
//                @SerializedName("WhatIamlookingfor")
//                var WhatIamlookingfor: ArrayList<String>? = ArrayList(),
//
//                @Expose
//                @SerializedName("Languages")
//                var Languages: ArrayList<String>? = ArrayList(),
//
//                @Expose
//                @SerializedName("Qualifications")
//                var Qualifications: ArrayList<String>? = ArrayList(),
//
//                @Expose
//                @SerializedName("Experiences")
//                var Experiences: ArrayList<String>? = ArrayList(),
//
//                @Expose
//                @SerializedName("GoAround")
//                var GoAround: ArrayList<String>? = ArrayList(),
//
//                @Expose
//                @SerializedName("Remarks")
//                var Remarks: String? = "")
}