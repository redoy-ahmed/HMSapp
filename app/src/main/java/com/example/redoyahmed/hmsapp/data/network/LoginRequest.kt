package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by jyotidubey on 11/01/18.
 */
class LoginRequest {

    data class ServerLoginRequest internal constructor(@Expose
                                                       @SerializedName("email") internal val email: String,
                                                       @Expose
                                                       @SerializedName("password") internal val password: String)

    data class FacebookLoginRequest internal constructor(@Expose
                                                         @SerializedName("fb_user_id")
                                                         internal val fbUserId: String,
                                                         @Expose
                                                         @SerializedName("fb_access_token")
                                                         internal val fbAccessToken: String)

    data class GoogleLoginRequest internal constructor(@Expose
                                                       @SerializedName("google_user_id")
                                                       internal val googleUserId: String,
                                                       @Expose
                                                       @SerializedName("google_id_token")
                                                       internal val idToken: String)


    data class FacebookLoginRegistrationRequest internal constructor(

            @Expose
            @SerializedName("FirstName")
            internal val FirstName: String,
            @Expose
            @SerializedName("LastName")
            internal val LastName: String,
            @Expose
            @SerializedName("ReferenceId")
            internal val ReferenceId: String,
            @Expose
            @SerializedName("ReferenceType")
            internal val ReferenceType: String,
            @Expose
            @SerializedName("Email")
            internal val Email: String,

            @Expose
            @SerializedName("Headline")
            internal val Headline: String? = "",
            @Expose
            @SerializedName("Persist")
            internal val Persist: String? = "",
            @Expose
            @SerializedName("ResponseData")
            internal val ResponseData: String? = "",
            @Expose
            @SerializedName("BriefBio")
            internal val BriefBio: String? = "",
            @Expose
            @SerializedName("ExperienceTitle")
            internal val ExperienceTitle: String? = "",

            @Expose
            @SerializedName("ExperienceCompany")
            internal val ExperienceCompany: String? = "",

            @Expose
            @SerializedName("ExperienceLocation")
            internal val ExperienceLocation: String? = "",

            @Expose
            @SerializedName("ExperienceFromDate")
            internal val ExperienceFromDate: String? = "",

            @Expose
            @SerializedName("ExperienceRemarks")
            internal val ExperienceRemarks: String? = ""

    )
}