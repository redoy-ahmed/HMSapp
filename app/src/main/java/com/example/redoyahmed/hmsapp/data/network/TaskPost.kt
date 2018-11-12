package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by jyotidubey on 17/01/18.
 */
data class TaskPost(


        @Expose
        @SerializedName("UserId")
        var UserId: Long = 0,

        @Expose
        @SerializedName("Status")
        var Status: String? = null,

        @Expose
        @SerializedName("CreationDate")
        var CreationDate: String? = null,

        @Expose
        @SerializedName("UpdatedDate")
        var UpdatedDate: String? = null,

        @Expose
        @SerializedName("Title")
        var Title: String? = null,


        @Expose
        @SerializedName("Description")
        var Description: String? = null,


        @Expose
        @SerializedName("IsInPersonOrOnline")
        var IsInPersonOrOnline: String? = null,


        @Expose
        @SerializedName("DutDateType")
        var DutDateType: String? = null,


        @Expose
        @SerializedName("DeliveryDate")
        var DeliveryDate: String? = null,


        @Expose
        @SerializedName("DeliveryTime")
        var DeliveryTime: String? = null,


        @Expose
        @SerializedName("WorkerNumber")
        var WorkerNumber: Int? = null,


        @Expose
        @SerializedName("Skill")
        var Skill: String? = null,


        @Expose
        @SerializedName("IsFixedPrice")
        var IsFixedPrice: String? = null,


        @Expose
        @SerializedName("HourlyRate")
        var HourlyRate: String? = null

)