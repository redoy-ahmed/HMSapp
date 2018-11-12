package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PaymentMethodRequest {

    data class AddPaymentMethod internal constructor(
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
            @SerializedName("PaymentMethodType")
            var PaymentMethodType: String? = null,

            @Expose
            @SerializedName("CardName")
            var CardName: String? = null,

            @Expose
            @SerializedName("CardNumber")
            var CardNumber: String? = null,

            @Expose
            @SerializedName("ExpiryDate")
            var ExpiryDate: String? = null,

            @Expose
            @SerializedName("CVC")
            var CVC: String? = null,

            @Expose
            @SerializedName("ExpiryMonth")
            var ExpiryMonth: String? = null,

            @Expose
            @SerializedName("AccountName")
            var AccountName: String? = null,

            @Expose
            @SerializedName("BankName")
            var BankName: String? = null,

            @Expose
            @SerializedName("AccountNumber")
            var AccountNumber: String? = null,

            @Expose
            @SerializedName("SwiftCode")
            var SwiftCode: String? = null)


    data class UpdatePaymentMethod internal constructor(
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
            @SerializedName("PaymentMethodType")
            var PaymentMethodType: String? = null,

            @Expose
            @SerializedName("CardName")
            var CardName: String? = null,

            @Expose
            @SerializedName("CardNumber")
            var CardNumber: String? = null,

            @Expose
            @SerializedName("ExpiryDate")
            var ExpiryDate: String? = null,

            @Expose
            @SerializedName("CVC")
            var CVC: String? = null,

            @Expose
            @SerializedName("ExpiryMonth")
            var ExpiryMonth: String? = null,

            @Expose
            @SerializedName("AccountName")
            var AccountName: String? = null,

            @Expose
            @SerializedName("BankName")
            var BankName: String? = null,

            @Expose
            @SerializedName("AccountNumber")
            var AccountNumber: String? = null,

            @Expose
            @SerializedName("SwiftCode")
            var SwiftCode: String? = null)

    data class GetPaymentMethod internal constructor(@Expose
                                                     @SerializedName("UserId")
                                                     var UserId: Long? = null)
}