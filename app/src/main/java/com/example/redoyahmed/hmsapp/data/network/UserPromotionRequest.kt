package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserPromotionRequest {

    data class GetUserPromotionRequest internal constructor(

            @Expose
            @SerializedName("UserId")
            var UserId: Long? = null)

    data class PostUserPromotionRequest internal constructor(

            @Expose
            @SerializedName("UserId")
            var UserId: Long? = 0,

            @Expose
            @SerializedName("PromotionCode")
            var PromotionCode: String? = "")
}