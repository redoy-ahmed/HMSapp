package com.example.redoyahmed.hmsapp.data.network


object ApiEndPoint {

    val ENDPOINT_SERVER_SHOHOKARI_BASE_URL = "https://10.0.2.2/"
    val ENDPOINT_SERVER_SHOHOKARI_BASE_API_URL = "https://shohokari.com/"
    val ENDPOINT_SERVER_SHOHOKARI_PUBLIC_URL = "https://shohokari.com/public-profile/"
    val ENDPOINT_SERVER_SHOHOKARI_TASK_URL = "https://shohokari.com/tasks/"

    //Start Area Authentication

    val ENDPOINT_SERVER_SHOHOKARI_LOGIN = "http://10.0.2.2:8080/api/login"
    val ENDPOINT_SERVER_SHOHOKARI_LOGOUT = "https://shohokari.com/api/authentication/logout"
    const val ENDPOINT_SERVER_SHOHOKARI_SIGN_UP = "https://shohokari.com/api/authentication/register"
    const val ENDPOINT_SERVER_SHOHOKARI_MOBILELOGINREGISTRATION = "https://shohokari.com/api/authentication/loginregistrationfacebookmobile"
    const val ENDPOINT_SERVER_SHOHOKARI_FACEBOOK_LINKEDIN_REGISTRATION_LOGIN = "https://shohokari.com/api/authentication/loginsocial"


    val ENDPOINT_SERVER_SHOHOKARI_MYTASKLIST = "https://shohokari.com/api/task/taskinformationbysearch/get"


    val ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_POST = "https://shohokari.com/api/taskalertkeyword/post"
    val ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_GET = "https://shohokari.com/api/taskalertkeyword/get"
    val ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_PUT = "https://shohokari.com/api/taskalertkeyword/put"
    val ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_DELETE = "https://shohokari.com/api/taskalertkeyword/delete"

    //End Task Keyword Area


    //Start  Task Area

    val ENDPOINT_SERVER_SHOHOKARI_TASK_POST = "https://shohokari.com/api/task/post"
    val ENDPOINT_SERVER_SHOHOKARI_TASK_UPDATE = "https://shohokari.com/api/task/put"

    val ENDPOINT_SERVER_SHOHOKARI_TASK_GET = "https://shohokari.com/api/task/get"

    val ENDPOINT_SERVER_SHOHOKARI_TASK_DELETE = "https://shohokari.com/api/task/delete"
    val ENDPOINT_SERVER_SHOHOKARI_TASK_IMAGE_POST = "https://shohokari.com/api/task/savepictures"
    val ENDPOINT_SERVER_SHOHOKARI_TASK_IMAGE_GET = "https://shohokari.com/api/task/getpictures"
    val ENDPOINT_SERVER_SHOHOKARI_TASK_IMAGE_DELETE = "https://shohokari.com/api/task/deletetaskimages"
    val ENDPOINT_SERVER_SHOHOKARI_TASK_SEND_EMAIL_NOTIFICATION_TASK_ALERTS = "https://shohokari.com/api/task/sendemailandnotification"


    //End Area Task

    // Task Bidding
    val ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_POST = "https://shohokari.com/api/taskbidding/post"
    val ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_PUT = "https://shohokari.com/api/taskbidding/put"
    val ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_DELETE = "https://shohokari.com/api/taskbidding/delete"
    val ENDPOINT_SERVER_SHOHOKARI_TASKBIDDINGLIST_GET = "https://shohokari.com/api/taskbidding/get"
    val ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_PUT_PAYMENT_CONFIRMATION = "https://shohokari.com/api/taskbidding/put/paymentconfirmation"
    val ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_SEND_EMAIL_NOTIFICATION_TASKBIDDING_ALERTS = "https://shohokari.com/api/taskbidding/sendemailandnotification"


    //End Task Bidding


    //Start Task Payment


    val ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_POST = "https://shohokari.com/api/taskpayment/post"
    val ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_PUT = "https://shohokari.com/api/taskpayment/put"
    val ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_POSTSSLVALIDATION = "https://shohokari.com/api/taskpayment/post/postsslmobileappvalidation"
    val ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_DELETE = "https://shohokari.com/api/taskpayment/delete"
    const val ENDPOINT_SERVER_SHOHOKARI_TASK_PAYMENTS_GET = "https://shohokari.com/api/taskpayment/get"
    const val ENDPOINT_SERVER_SHOHOKARI_TASK_PAYMENTS_GET_TASK_PAYMENT_TASKID_TASKBIDDINGID = "https://shohokari.com/api/taskpayment/get/gettaskpaymentbytaskidandtaskbiddingid"
    const val ENDPOINT_SERVER_SHOHOKARI_TASK_PAYMENTS_SEND_EMAIL_NOTIFICATION_TASKPAYMENT_ALERTS = "https://shohokari.com/api/taskpayment/sendemailandnotification"

    //End Task Payment

    // Time Line
    val ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_GET = "https://shohokari.com/api/timeline/gettimelinebyapp"
    val ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_POST = "https://shohokari.com/api/timeline/post"
    val ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_COMMENTS_POST = "https://shohokari.com/api/comments/post"
    val ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_COMMENTS_GET = "https://shohokari.com//api/comments/get"

    val ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_SENDEMAIL_NOTIFICATION_GET = "https://shohokari.com/api/timeline/sendemailandnotification"


    val ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_COMMENTS_SENDEMAIL_NOTIFICATION_GET = "https://shohokari.com//api/comments/sendemailandnotification"


    //Media POST
    val ENDPOINT_SERVER_SHOHOKARI_MEDIA_UPLOADPICTURES = "https://shohokari.com/api/media/uploadpictures"
    val ENDPOINT_SERVER_SHOHOKARI_MEDIA_UPLOADFILES = "https://shohokari.com/api/media/uploadfiles"


    const val ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_SETTINGS_POST = "https://shohokari.com/api/usernotificationsetting/post"
    const val ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_SETTINGS_PUT = "https://shohokari.com/api/usernotificationsetting/put"
    const val ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_SETTINGS_GET = "https://shohokari.com/api/usernotificationsetting/get"

    const val ENDPOINT_SERVER_SHOHOKARI_USER_REVIEW_LIST_GET = "https://shohokari.com/api/userrating/get"

    const val ENDPOINT_SERVER_SHOHOKARI_PAYMENT_METHOD_POST = "https://shohokari.com/api/paymentmethod/post"
    const val ENDPOINT_SERVER_SHOHOKARI_PAYMENT_METHOD_PUT = "https://shohokari.com/api/paymentmethod/put"
    const val ENDPOINT_SERVER_SHOHOKARI_PAYMENT_METHOD_GET = "https://shohokari.com/api/paymentmethod/get"

    const val ENDPOINT_SERVER_SHOHOKARI_BILLING_ADDRESS_POST = "https://shohokari.com/api/billingaddress/post"
    const val ENDPOINT_SERVER_SHOHOKARI_BILLING_ADDRESS_PUT = "https://shohokari.com/api/billingaddress/put"
    const val ENDPOINT_SERVER_SHOHOKARI_BILLING_ADDRESS_GET = "https://shohokari.com/api/billingaddress/get"


    //  const val ENDPOINT_SERVER_SHOHOKARI_SIGN_UP ="http://localhost:59082/api/authentication/register"


    //Start Area User
    const val ENDPOINT_SERVER_SHOHOKARI_USER_PROFILE_UPDATE = "https://shohokari.com/api/users/put"
    const val ENDPOINT_SERVER_SHOHOKARI_USER_PROFILE_SAVE = "https://shohokari.com/api/users/post/updateuserbasicprofile"

    // End Area USER


    const val ENDPOINT_SERVER_SHOHOKARI_CHANGE_PASSWORD_PUT = "https://shohokari.com/api/users/put/change-password"

    const val ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_LIST_GET = "https://shohokari.com/api/notifications/get"
    const val ENDPOINT_SERVER_SHOHOKARI_SEND_TEST_NOTIFICATION_GET = "https://shohokari.com//api/notifications/sendtestpushnotificationtouser/"


    const val ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_MARKED_READ_PUT = "https://shohokari.com//api/notifications/put/"


    const val ENDPOINT_SERVER_SHOHOKARI_DASHBOARD_SUMMARY_GET = "https://shohokari.com/api/userrating/getuserratingsummarydata"
    const val ENDPOINT_SERVER_SHOHOKARI_DASHBOARD_TASK_SUMMARY_GET = "http://shohokari.com/api/task/gettasksummaryuserdata"


    const val ENDPOINT_SERVER_SHOHOKARI_USER_SKILLS_GET = "https://shohokari.com/api/about/get"
    const val ENDPOINT_SERVER_SHOHOKARI_USER_SKILLS_POST = "https://shohokari.com/api/about/post/mobileapp"
    const val ENDPOINT_SERVER_SHOHOKARI_USER_SKILLS_PUT = "https://shohokari.com/api/about/put"


    //Start Area User Rating
    val ENDPOINT_SERVER_SHOHOKARI_USER_RATING_POST = "https://shohokari.com/api/userrating/post"
    val ENDPOINT_SERVER_SHOHOKARI_USER_RATING_SEND_EMAIL_NOTIFICATION_GET = "https://shohokari.com/api/userrating/sendemailandnotification"

    //End User Rating


    const val ENDPOINT_SERVER_SHOHOKARI_USER_BADGES_GET = "https://shohokari.com/api/userbadge/get"
    const val ENDPOINT_SERVER_SHOHOKARI_USER_BADGES_POST = "https://shohokari.com/api/userbadge/post"
    const val ENDPOINT_SERVER_SHOHOKARI_USER_BADGES_PUT = ""

    const val ENDPOINT_SERVER_SHOHOKARI_USER_EMAIL_VERIFICATION_POST = "https://shohokari.com/api/userbadge/postemailbadge"

    const val ENDPOINT_SERVER_SHOHOKARI_USER_PORTFULIO_GET = "https://shohokari.com/api/userportfulio/get"
    const val ENDPOINT_SERVER_SHOHOKARI_USER_PORTFULIO_POST = "https://shohokari.com/api/userportfulio/post/mobileapp"
    const val ENDPOINT_SERVER_SHOHOKARI_USER_PORTFULIO_PUT = ""

    const val ENDPOINT_SERVER_SHOHOKARI_FORGOT_PASSWORD_POST = "https://shohokari.com/api/authentication/forgotpassword"

    const val ENDPOINT_SERVER_SHOHOKARI_USER_PROMOTION_GET = "https://shohokari.com/api/userpromotion/get"
    const val ENDPOINT_SERVER_SHOHOKARI_USER_PROMOTION_POST = "https://shohokari.com/api/userpromotion/post"

    const val ENDPOINT_SERVER_SHOHOKARI_USER_REFRESHED_TOKEN_POST = "https://shohokari.com/api/fcmdeviceinfo/post"

    const val ENDPOINT_SERVER_SHOHOKARI_USER_PROMOTION_CODE_POST = "https://shohokari.com/api/userpromotion/post/acceptuserpromotion"
    const val ENDPOINT_SERVER_SHOHOKARI_USER_PROMOTION_CODE_GET = "https://shohokari.com/api/userpromotion/get"

    const val ENDPOINT_SERVER_SHOHOKARI_REPORT_TASK_POST = "https://shohokari.com/api/resolution/post"

    const val ENDPOINT_SERVER_SHOHOKARI_PROFILE_PICTURE_POST = "https://shohokari.com/api/entityproperty/post"

    const val ENDPOINT_SERVER_SHOHOKARI_PUBLIC_PROFILE_INFO_GET = "https://shohokari.com/api/users/get/"

    const val ENDPOINT_SERVER_SHOHOKARI_TASK_REVIEW_GET = "https://shohokari.com/api/userrating/getuserratingbytaskId"
}