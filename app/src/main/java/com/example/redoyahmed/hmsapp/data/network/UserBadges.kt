package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserBadges(

        @Expose
        @SerializedName("UserId")
        var UserId: Long? = null,

        @Expose
        @SerializedName("User")
        var User: User? = null,

        @Expose
        @SerializedName("Status")
        var Status: Int? = null,

        @Expose
        @SerializedName("CreationDate")
        var CreationDate: String? = null,

        @Expose
        @SerializedName("Title")
        var Title: String? = null,

        @Expose
        @SerializedName("Type")
        var Type: String? = null,

        @Expose
        @SerializedName("Description")
        var Description: String? = null,

        @Expose
        @SerializedName("ReferenceId")
        var ReferenceId: String? = null,
//
        @Expose
        @SerializedName("ReferenceType")
        var ReferenceType: String? = null,
//
//        @Expose
//        @SerializedName("RefrenceNumber")
//        var RefrenceNumber: String? = null,

        @Expose
        @SerializedName("RefrenceUrl")
        var RefrenceUrl: String? = null,

//        @Expose
//        @SerializedName("Refrence")
//        var Refrence: String? = null,
//
//        @Expose
//        @SerializedName("AccountNumber")
//        var AccountNumber: String? = null,
//
//        @Expose
//        @SerializedName("AccountName")
//        var AccountName: String? = null,
//
//        @Expose
//        @SerializedName("SwiftCode")
//        var SwiftCode: String? = null,
//
        @Expose
        @SerializedName("IsVerified")
        var IsVerified: Boolean? = false,
//
        @Expose
        @SerializedName("VerificationCode")
        var VerificationCode: String? = null,

        @Expose
        @SerializedName("Id")
        var Id: Int? = null

)