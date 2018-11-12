package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class TaskPaymentsRequest {

    data class GetTaskPayments internal constructor(@Expose
                                                    @SerializedName("UserId")
                                                    var UserId: Long? = null)


    data class GetTaskPaymentsByTaskIDAndTaskBiddingId internal constructor(
            @Expose
            @SerializedName("TaskId")
            var TaskId: Long? = null,

            @Expose
            @SerializedName("TaskBiddingId")
            var TaskBiddingId: Long? = null

    )


    data class ServerTaskPaymentPostRequest internal constructor(

//            @Expose
//            @SerializedName("Id")
//            internal val TaskPaymentId: Long = 0,

            @Expose
            @SerializedName("CreationDate")
            internal val CreationDate: String?,

            @Expose
            @SerializedName("UpdatedDate")
            internal val UpdatedDate: String?,

            @Expose
            @SerializedName("VersionNumber")
            internal val VersionNumber: Int? = 0,

            @Expose
            @SerializedName("Status")
            internal val Status: Int = 0,

            @Expose
            @SerializedName("UserId")
            internal val UserId: Long = 0,

            @Expose
            @SerializedName("TaskId")
            internal val TaskId: Long,

            @Expose
            @SerializedName("PaymentType")
            internal val PaymentType: String?,

            @Expose
            @SerializedName("PaymentMethod")
            internal val PaymentMethod: String,

            @Expose
            @SerializedName("EmployeeID")
            internal val EmployeeID: Long?,

            @Expose
            @SerializedName("PayableAmount")
            internal val PayableAmount: Double?,

            @Expose
            @SerializedName("DueAmount")
            internal val DueAmount: Double?,

            @Expose
            @SerializedName("PaymentAmount")
            internal val PaymentAmount: Double?,

            @Expose
            @SerializedName("TaskBiddingId")
            internal val TaskBiddingId: Long?,

            @Expose
            @SerializedName("Description")
            internal val Description: String?

//            @Expose
//            @SerializedName("AcAccountNo")
//            var AcAccountNo: String,
//
//            @Expose
//            @SerializedName("AccountStatus")
//            var AccountStatus: String

    )


    data class ServerTaskSSLPaymentPostRequest internal constructor(

            @Expose
            @SerializedName("amount")
            internal val amount: Double?,

            @Expose
            @SerializedName("bank_tran_id")
            internal val bank_tran_id: String? = "",

            @Expose
            @SerializedName("card_issuer")
            internal val card_issuer: String? = "",

            @Expose
            @SerializedName("card_issuer_country")
            internal val card_issuer_country: String? = "",

            @Expose
            @SerializedName("card_issuer_country_code")
            internal val card_issuer_country_code: String? = "",

            @Expose
            @SerializedName("card_no")
            internal val card_no: String? = "",

            @Expose
            @SerializedName("card_type")
            internal val card_type: String? = "",

            @Expose
            @SerializedName("status")
            internal val status: String? = "",

            @Expose
            @SerializedName("store_amount")
            internal val store_amount: String? = "",

            @Expose
            @SerializedName("store_id")
            internal val store_id: String? = "",

            @Expose
            @SerializedName("tran_date")
            internal val tran_date: String? = "",


            @Expose
            @SerializedName("tran_id")
            internal val tran_id: String? = "",

            @Expose
            @SerializedName("val_id")
            internal val val_id: String? = "",

            @Expose
            @SerializedName("verify_sign")
            internal val verify_sign: String? = "",


            @Expose
            @SerializedName("verify_key")
            internal val verify_key: String? = ""

    )




        data class ServerTaskPaymentPutRequest internal constructor(

            @Expose
            @SerializedName("Id")
            internal val TaskPaymentId: Long = 0,

                @Expose
                @SerializedName("CreationDate")
                internal val CreationDate: String?,

                @Expose
                @SerializedName("UpdatedDate")
                internal val UpdatedDate: String?,

                @Expose
                @SerializedName("VersionNumber")
                internal val VersionNumber: Int? = 0,

                @Expose
                @SerializedName("Status")
                internal val Status: Int = 0,

                @Expose
                @SerializedName("UserId")
                internal val UserId: Long = 0,

                @Expose
                @SerializedName("TaskId")
                internal val TaskId: Long,

                @Expose
                @SerializedName("PaymentType")
                internal val PaymentType: String?,

                @Expose
                @SerializedName("PaymentMethod")
                internal val PaymentMethod: String,

                @Expose
                @SerializedName("EmployeeID")
                internal val EmployeeID: Long?,

                @Expose
                @SerializedName("PayableAmount")
                internal val PayableAmount: Double?,

                @Expose
                @SerializedName("DueAmount")
                internal val DueAmount: Double?,

                @Expose
                @SerializedName("PaymentAmount")
                internal val PaymentAmount: Double?,

                @Expose
                @SerializedName("TaskBiddingId")
                internal val TaskBiddingId: Long?,

                @Expose
                @SerializedName("Description")
                internal val Description: String?

//            @Expose
//            @SerializedName("AcAccountNo")
//            var AcAccountNo: String,
//
//            @Expose
//            @SerializedName("AccountStatus")
//            var AccountStatus: String

        )


}