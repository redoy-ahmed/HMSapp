package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class TaskAttachmentRequest {

    data class PasswordChangeRequest internal constructor(@Expose
                                                          @SerializedName("CurrentPassword")
                                                          var UserId: String? = null,

                                                          @Expose
                                                          @SerializedName("Password")
                                                          var Password: String? = null,

                                                          @Expose
                                                          @SerializedName("ConfirmPassword")
                                                          var ConfirmPassword: String? = null)
}