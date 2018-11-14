package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SignInRequest {

    data class ServerLoginRequest internal constructor(@Expose
                                                       @SerializedName("username") internal val email: String,
                                                       @Expose
                                                       @SerializedName("password") internal val password: String)
}