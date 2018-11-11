package com.shohokari.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BillingAddressRequest {

    data class AddBillingAddress internal constructor(

            @Expose
            @SerializedName("UserId")
            var UserId: Long? = null,

            @Expose
            @SerializedName("Status")
            var Status: Int? = 0,

            @Expose
            @SerializedName("CreationDate")
            var CreationDate: String? = null,

            @Expose
            @SerializedName("UpdatedDate")
            var UpdatedDate: String? = null,

            @Expose
            @SerializedName("Address1")
            var Address1: String? = null,

            @Expose
            @SerializedName("Address2")
            var Address2: String? = null,

            @Expose
            @SerializedName("Zip")
            var Zip: String? = null,

            @Expose
            @SerializedName("City")
            var City: String? = null,

            @Expose
            @SerializedName("State")
            var State: String? = null,

            @Expose
            @SerializedName("Country")
            var Country: String? = null,

            @Expose
            @SerializedName("IsVerified")
            var IsVerified: Boolean? = false,

            @Expose
            @SerializedName("IsDefault")
            var IsDefault: Boolean? = false)


    data class UpdateBillingAddress internal constructor(

            @Expose
            @SerializedName("Id")
            var Id: Long? = null,

            @Expose
            @SerializedName("UserId")
            var UserId: Long? = null,

            @Expose
            @SerializedName("Status")
            var Status: Int? = 0,

            @Expose
            @SerializedName("CreationDate")
            var CreationDate: String? = null,

            @Expose
            @SerializedName("UpdatedDate")
            var UpdatedDate: String? = null,

            @Expose
            @SerializedName("Address1")
            var Address1: String? = "",

            @Expose
            @SerializedName("Address2")
            var Address2: String? = "",

            @Expose
            @SerializedName("Zip")
            var Zip: String? = "",

            @Expose
            @SerializedName("City")
            var City: String? = "",

            @Expose
            @SerializedName("State")
            var State: String? = "",

            @Expose
            @SerializedName("Country")
            var Country: String? = "",

            @Expose
            @SerializedName("IsVerified")
            var IsVerified: Boolean? = false,

            @Expose
            @SerializedName("IsDefault")
            var IsDefault: Boolean? = false)

    data class GetBillingAddress internal constructor(@Expose
                                                      @SerializedName("UserId")
                                                      var UserId: Long? = null)
}