package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ForgotPasswordRequest {

    data class ServerForgotPasswordRequest internal constructor(@Expose
                                                                @SerializedName("email") internal val email: String)

}