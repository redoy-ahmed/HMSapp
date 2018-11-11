package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 17/01/18.
 */
data class User(

        @Expose
        @SerializedName("FirstName")
        var FirstName: String? = null,

        @Expose
        @SerializedName("LastName")
        var LastName: String? = null,

        @Expose
        @SerializedName("UserName")
        var UserName: String? = null,

        @Expose
        @SerializedName("Name")
        var Name: String? = null,

        @Expose
        @SerializedName("ProfileImageUrl")
        var ProfileImageUrl: String? = null,

        @Expose
        @SerializedName("CoverImageUrl")
        var CoverImageUrl: String? = null,

        @Expose
        @SerializedName("ProfileUrl")
        var ProfileUrl: String? = null,

        @Expose
        @SerializedName("IsFirstLogin")
        var IsFirstLogin: Boolean = false,

        @Expose
        @SerializedName("MobileNumber")
        var MobileNumber: String? = null,

        @Expose
        @SerializedName("IsMobileNumberVerified")
        var IsMobileNumberVerified: Boolean = false,

        @Expose
        @SerializedName("IsProfileImageVerified")
        var IsProfileImageVerified: Boolean = false,

        @Expose
        @SerializedName("IsEmailVerified")
        var IsEmailVerified: Boolean = false,

        @Expose
        @SerializedName("Headline")
        var Headline: String? = null,

        @Expose
        @SerializedName("BriefBio")
        var BriefBio: String? = null,

        @Expose
        @SerializedName("ReferenceId")
        var ReferenceId: String? = null,

        @Expose
        @SerializedName("ReferenceType")
        var ReferenceType: String? = null,

        @Expose
        @SerializedName("Remarks")
        var Remarks: String? = null,

        @Expose
        @SerializedName("Locations")
        var Locations: String? = null,

        @Expose
        @SerializedName("UserProfileUrl")
        var UserProfileUrl: String? = null,

        @Expose
        @SerializedName("Id")
        var Id: Long = 0,

        @Expose
        @SerializedName("Email")
        var Email: String? = null,

        @Expose
        @SerializedName("ProfileImageId")
        var ProfileImageId: Int? = 0,

        @Expose
        @SerializedName("CoverImageId")
        var CoverImageId: Int? = 0,

        @Expose
        @SerializedName("StanfordWorkplaceURL")
        var StanfordWorkplaceURL: String? = null,

        @Expose
        @SerializedName("Cohort")
        var Cohort: String? = null,

        @Expose
        @SerializedName("CommunityId")
        var CommunityId: String? = null,

        @Expose
        @SerializedName("DateofBirth")
        var DateofBirth: String? = null,

        @Expose
        @SerializedName("Address")
        var Address: String? = null,

        @Expose
        @SerializedName("DateCreatedLocal")
        var DateCreatedLocal: String? = null,

        @Expose
        @SerializedName("IsOnline")
        var IsOnline: Boolean? = false,

        @Expose
        @SerializedName("LastLoginDate")
        var LastLoginDate: String? = null,

        @Expose
        @SerializedName("Latitude")
        var Latitude: String? = null,

        @Expose
        @SerializedName("Longitude")
        var Longitude: String? = null,

        @Expose
        @SerializedName("UnreadNotificationCount")
        var UnreadNotificationCount: Int? = 0,


        @Expose
        @SerializedName("NationalIDVerifiedStatus")
        var NationalIDVerifiedStatus: Int? = 0,
        @Expose
        @SerializedName("BankVerifiedStatus")
        var BankVerifiedStatus: Int? = 0

)