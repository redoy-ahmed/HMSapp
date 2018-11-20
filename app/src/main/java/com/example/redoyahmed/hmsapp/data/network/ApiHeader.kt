package com.example.redoyahmed.hmsapp.data.network

import com.example.redoyahmed.hmsapp.di.ApiKeyInfo
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import javax.inject.Inject


class ApiHeader @Inject constructor(internal var privateApiHeader: PrivateApiHeader) {

    class PrivateApiHeader @Inject constructor(@ApiKeyInfo
                                               @Expose
                                               @SerializedName("access_token") val accessToken: String?)

}