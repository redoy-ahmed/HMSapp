package com.shohokari.util


/**
 * Created by jyotidubey on 05/01/18.
 */
object AppConstants {

    internal val APP_DB_NAME = "mindorks_mvp.db"
    internal val PREF_NAME = "mindorks_pref"
    internal val SEED_DATABASE_QUESTIONS = "seed/questions.json"
    internal val SEED_DATABASE_OPTIONS = "seed/options.json"
    internal val DEVICE_TYPE = "Android"
    internal val BROSWER_NAME = "AndroidApp"
    internal val VERSION_NO = "1.1"


    internal val LANGUGAE_BANGLA = "bn"
    internal val LANGUGAE_ENGLISH = "en"


    internal val TASK_PAYMENT_METHOD_CASH = "Cash"
    internal val TASK_PAYMENT_METHOD_CARD = "Bank"

    internal val TASK_PAYMENT_METHOD_BANK = "Bank"
    internal val TASK_PAYMENT_METHOD_CREDIT_CARD = "Card"

    internal val TASK_PAYMENT_METHOD_BIKASH = "Bikash"
    internal val TASK_PAYMENT_METHOD_ROCKET = "Rocket"

    internal val BIKASH_NUMBER_LENGTH = 11
    internal val ROCKET_NUMBER_LENGTH = 12


    internal var STATUS_VERIFIED = "VERIFIED"
    internal var STATUS_UNVERIFIED = "UNVERIFIED"
    // Error Code
    internal val EMPTY_EMAIL_ERROR = 1001
    internal val INVALID_EMAIL_ERROR = 1002
    internal val EMPTY_PASSWORD_ERROR = 1003
    internal val LOGIN_FAILURE = 1004
    internal val SIGNUP_FAILURE_ALREADYACCOUNT = 1005


    internal val NULL_INDEX = -1L

    internal val EMPTY_FIRST_NAME_ERROR = 5001
    internal val EMPTY_LAST_NAME_ERROR = 5002
    internal val EMPTY_MOBILE_NUMBER_ERROR = 5004
    internal val EMPTY_ADDRESS_ERROR = 5003
    internal val EMPTY_DATE_OF_BIRTH_ERROR = 5005


    internal val TASK_TITLE_EMPTY = 1005
    internal val TASK_DESCRIPTION_EMPTY = 1006
    internal val TASK_LOCATION_EMPTY = 1007
    internal val TASK_DUE_DATE_EMPTY = 1008
    internal val TASK_PRICE_EMPTY = 1009
    internal val TASK_INVALID_HOUR_EMPTY = 1009
    internal val TASK_INVALID_HOUR_RATE_EMPTY = 1010
    internal val TASK_SHOHOKARI_EMPTY = 1011


    internal val REGISTRATION_FAILURE = 1014

    //Make Offer
    internal val TASK_MAKE_OFFER_SUCCESS = 1012
    internal val TASK_MAKE_OFFER_EROR = 1013

    internal val EMPTY_MOBILENUMBER_ERROR = 1014
    internal val EMPTY_REFERENCEID_ERROR = 1015

    //Task Alert
    internal val EMPTY_TASK_ALERT_KEYWORD_ERROR = 1016
    internal val EMPTY_TASK_ALERT_LOCATION_ERROR = 1017
    internal val ERROR_SUBMITTED_UNSUCCESSFULLY = 1018
    internal val SUCCESS_SUBMITTED_SUCCESSFULLY = 1019

    internal val SUCCESS = 1020
    internal val FAILED = 1021


    // Task Status
    internal val TASK_STATUS_DRAFT = 903
    internal val TASK_STATUS_ACTIVE = 101
    internal val TASK_STATUS_ACCEPTED = 102
    internal val TASK_STATUS_PAYMENTED = 103
    internal val TASK_STATUS_CANCELLED = 104
    internal val TASK_STATUS_DELETED = 105
    internal val TASK_STATUS_ALL = 901
    internal val TASK_STATUS_PENDINGTASK = 902
    internal val STATUS_ALL_PRIVATEMESSAGE = 904

    // Question and reply
    internal const val QUESTION_EMPTY = 2000
    internal const val QUESTION_REPLY_EMPTY = 2001


    internal val STATUS_PAYMENT_METHOD_CASH: String = "CASH"
    internal val STATUS_PAYMENT_METHOD_FUNDED: String = "FUNDED"
    internal val STATUS_PAYMENT_METHOD_FUNDED_REQUESTPAYMENT: String = "FUNDED_REQUESTPAYMENT"
    internal val STATUS_PAYMENT_METHOD_FUNDED_RELEASEPAYMENT: String = "FUNDED_RELEASEPAYMENT"

    internal val STATUS_TASK_BIDDING_REQUEST_PAYMENT: String = "REQUESTPAYMENT"
    internal val STATUS_TASK_BIDDING_RECEIVED_PAYMENT: String = "RECEIVEDPAYMENT"

    internal val RESOULUTION_TYPE_TASK: String = "Task"
    internal val RESOULUTION_TYPE_USER: String = "User"
    internal val RESOULUTION_TYPE_COMMENT: String = "Comment"
    internal val RESOULUTION_TYPE_OTHER: String = "Other"

    internal val GALLERY = 1
    internal val CAMERA = 2
    internal val PERMISSION_REQUEST_CODE = 200


    internal fun getSatus(status: Int): String {
        when (status) {
            1 -> return "Receipt"

            2 -> return "Payment"

            3 -> return "POST"

            4 -> return "PURCHASE ORDER"

            101 -> return "ACTIVE"

            102 -> return "ASSIGNED"

            103 -> return "PAID"

            104 -> return "CANCELLED"
            105 -> return "DELETED"

            901 -> return "ALLTASK"
            902 -> return "PENDINGTASK"
            903 -> return "DRAFT"
            904 -> return "PRIVATEMESSAGE"


            201 -> return "REQUESTPAYMENT"
            202 -> return "RECEIVEDPAYMENT"
            203 -> return "FUNDED"
            204 -> return "CASH"
            205 -> return "FUNDED_REQUESTPAYMENT"
            206 -> return "FUNDED_RELEASEPAYMENT"


            905 -> return "VERIFIED"
            906 -> return "UNVERIFIED"

            else ->

                return ""
        }
    }



    internal fun getSatus(status: String): Int {
        when (status) {
            "Receipt" -> return 1

            "Payment" -> return 2

            "POST" -> return 3

            "PURCHASE ORDER" -> return 4

            "ACTIVE" -> return 101

            "ASSIGNED" -> return 102

            "PAID" -> return 103

            "CANCELLED" -> return 104
            "DELETED" -> return 105

            "ALLTASK" -> return 901
            "PENDINGTASK" -> return 902
            "DRAFT" -> return 903
            "PRIVATEMESSAGE" -> return 904


            "REQUESTPAYMENT" -> return 201
            "RECEIVEDPAYMENT" -> return 202
            "FUNDED" -> return 203
            "CASH" -> return 204
            "FUNDED_REQUESTPAYMENT" -> return 205
            "FUNDED_RELEASEPAYMENT" -> return 206


            "VERIFIED" -> return 905
            "UNVERIFIED" -> return 906


            else ->
                return 1
        }
    }

    enum class LoggedInMode constructor(val type: Int) {
        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3)
    }


    //Notification Entity

    internal val NOTIFICATION_NAME_SEED_DATABASE_QUESTIONS = "seed/questions.json"
    internal val NOTIFICATION_NAME_SEED_TIMELINEPOST = "TimelinePost"
    internal val NOTIFICATION_NAME_TIMELINEPOSTCOMMENT = "Comment"
    internal val NOTIFICATION_NAME_MATCHFORACTIONPOST = "MatchForActionPost"
    internal val NOTIFICATION_NAME_MatchForActionPostJoin = "MatchForActionPostJoin"
    internal val NOTIFICATION_NAME_MatchForActionComment = "MatchForActionComment"
    internal val NOTIFICATION_NAME_Meetup = "Meetup"
    internal val NOTIFICATION_NAME_MeetupJoin = "MeetupJoin"
    internal val NOTIFICATION_NAME_MeetupComment = "MeetupComment"
    internal val NOTIFICATION_NAME_EventCalendar = "EventCalendar"
    internal val NOTIFICATION_NAME_EventCalendarJoin = "EventCalendarJoin"
    internal val NOTIFICATION_NAME_EventCalenderComment = "EventCalenderComment"
    internal val NOTIFICATION_NAME_Venture = "Venture"
    internal val NOTIFICATION_NAME_VentureJoin = "VentureJoin"
    internal val NOTIFICATION_NAME_VentureComment = "VentureComment"
    internal val NOTIFICATION_NAME_Comment = "Comment"
    internal val NOTIFICATION_NAME_UserLocationChange = "UserLocationChange"
    internal val NOTIFICATION_NAME_Task = "Task"
    internal val NOTIFICATION_NAME_TaskCompleted = "TaskCompleted"
    internal val NOTIFICATION_NAME_TaskBidding = "TaskBidding"
    internal val NOTIFICATION_NAME_TaskBiddingAccepted = "TaskBiddingAccepted"
    internal val NOTIFICATION_NAME_TaskBiddingRequestPayment = "TaskBiddingRequestPayment"
    internal val NOTIFICATION_NAME_TaskBiddingReceivedPayment = "TaskBiddingReceivedPayment"
    internal val NOTIFICATION_NAME_TaskBiddingComment = "TaskBiddingComment"
    internal val NOTIFICATION_NAME_TaskBiddingAdminComment = "TaskBiddingAdminComment"
    internal val NOTIFICATION_NAME_TaskPayment = "TaskPayment"
    internal val NOTIFICATION_NAME_TaskPaymentConfirmation = "TaskPaymentConfirmation"
    internal val NOTIFICATION_NAME_UserRating = "UserRating"
    internal val NOTIFICATION_NAME_User = "User"
    internal val NOTIFICATION_NAME_IpProperties = "IpProperties"
    internal val NOTIFICATION_NAME_TimeLinePostsDeleted = "TimeLinePostsDeleted"
    internal val NOTIFICATION_NAME_UserPromotion = "UserPromotion"

    internal val TestPushNotitification = "TestPushNotitification"


    //Running Activity Name for Private chats

    internal var APPLICATION_RUNNING_ACTIVITY_NAME = ""
}
