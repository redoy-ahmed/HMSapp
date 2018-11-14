package com.example.redoyahmed.hmsapp.data.network

import com.example.redoyahmed.hmsapp.di.ApiKeyInfo
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import javax.inject.Inject


class ApiHeader @Inject constructor(internal val publicApiHeader: PublicApiHeader, internal val protectedApiHeader: ProtectedApiHeader, internal var privateApiHeader: PrivateApiHeader) {

    class PublicApiHeader @Inject constructor(@ApiKeyInfo
                                              @Expose
                                              @SerializedName
                                              ("api_key") val apiKey: String)

    class ProtectedApiHeader @Inject constructor(@Expose
                                                 @SerializedName("api_key") val apiKey: String,
                                                 @Expose
                                                 @SerializedName("user_id") val userId: String?,
                                                 @Expose
                                                 @SerializedName("access_token") val accessToken: String?)


    class PrivateApiHeader @Inject constructor(@ApiKeyInfo
                                              @Expose
                                              @SerializedName
                                              ("Cookie") val cookieKey: String?)

}