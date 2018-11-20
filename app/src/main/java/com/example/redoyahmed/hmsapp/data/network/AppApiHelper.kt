package com.example.redoyahmed.hmsapp.data.network

import com.androidnetworking.common.Priority
import com.androidnetworking.interfaces.OkHttpResponseListener
import com.google.gson.Gson
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Observable
import java.io.File
import javax.inject.Inject

class AppApiHelper @Inject constructor(private var apiHeader: ApiHeader) : ApiHelper {

    override fun setAccessToken(accessToken: String) {
        ApiHeader.PrivateApiHeader(accessToken = accessToken)
        this.apiHeader.privateApiHeader = ApiHeader.PrivateApiHeader(accessToken = accessToken)
    }

    //Start Area Authentication

    override fun performServerLogin(request: SignInRequest.ServerLoginRequest): Observable<SignInResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_HMS_LOGIN)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(SignInResponse::class.java)

    override fun performLogoutApiCall(): Observable<LogoutResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_LOGOUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(LogoutResponse::class.java)

    override fun performServerSignUp(request: SignUpRequest.ServerSignUpRequest): Observable<SignUpResponse> {

        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_SIGN_UP)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(SignUpResponse::class.java)
    }

    override fun getHomeInfoApiCall(): Observable<HomeInfoResponse> {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_HMS_HOME)
            .addHeaders(apiHeader.privateApiHeader)
            .build()
            .getObjectObservable(HomeInfoResponse::class.java)
    }

    //Start Task Area
    override fun getMyTaskDetailsApiCall(request: TaskRequest.ServerTaskRequest): Observable<TaskResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MYTASKLIST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(TaskResponse::class.java)


    override fun getBrowseTaskListApiCall(request: TaskRequest.ServerTaskRequest): Observable<TaskResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MYTASKLIST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(TaskResponse::class.java)

    override fun performPostTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse> {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_POST)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(TaskResponse::class.java)
    }

    override fun performUpdateTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse> {
        return Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_UPDATE)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(TaskResponse::class.java)
    }

    override fun performPostTaskResponseTesting(request: TaskRequest.ServerTaskPostRequest, okHttpResponseListener: OkHttpResponseListener) {

        Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MOBILELOGINREGISTRATION)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getAsOkHttpResponse(okHttpResponseListener)
    }


    override fun updateTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_UPDATE)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(TaskResponse::class.java)


    override fun performPostTaskDelete(taskId: Long): Observable<TaskResponse> =
            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_DELETE + "/" + taskId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(TaskResponse::class.java)


    override fun saveTaskPictures(request: EntityPropertyRequest.ServerEntityPropertyPostRequest): Observable<MediaResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_IMAGE_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(MediaResponse::class.java)


    override fun getTaskPictures(taskId: Long): Observable<MediaResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_IMAGE_GET + "/" + taskId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(MediaResponse::class.java)


    override fun deleteTaskPictures(mediaId: Long): Observable<MediaResponse> =
            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_IMAGE_DELETE + "/" + mediaId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(MediaResponse::class.java)


    override fun getTaskByTaskIdApiCall(taskId: Long): Observable<TaskResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_GET + "/" + taskId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(TaskResponse::class.java)

    override fun sendEmailAndNotificationTaskAlertsByTaskIdApiCall(taskId: Long): Observable<TaskResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_SEND_EMAIL_NOTIFICATION_TASK_ALERTS + "/" + taskId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(TaskResponse::class.java)
    //End Area Task


    //  Start Task Bidding Area

    override fun getTaskBiddingListApiCall(request: TaskBiddingRequest.ServerTaskBiddingRequest): Observable<TaskBiddingResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDINGLIST_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(TaskBiddingResponse::class.java)


    override fun performPostTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse> {

        var gson = Gson()
        var objectString = gson.toJson(request)
        print(objectString)

        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_POST)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(TaskBiddingResponse::class.java)
    }


    override fun performPutTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_PUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(TaskBiddingResponse::class.java)

    override fun performWithdrawPutTaskBidding(taskBiddingId: Long): Observable<TaskBiddingResponse> =
            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_DELETE + "/" + taskBiddingId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(TaskBiddingResponse::class.java)


    override fun performPutAcceptPaymentConfirmationTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_PUT_PAYMENT_CONFIRMATION)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(TaskBiddingResponse::class.java)


    override fun sendEmailAndNotificationTaskBiddingAlertsByTaskBiddingIdApiCall(taskBiddingId: Long): Observable<TaskBiddingResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_SEND_EMAIL_NOTIFICATION_TASKBIDDING_ALERTS + "/" + taskBiddingId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(TaskBiddingResponse::class.java)


    override fun getTaskBiddingByTaskBiddingIdApiCall(taskBiddingId: Long): Observable<TaskBiddingResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDINGLIST_GET + "/" + taskBiddingId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(TaskBiddingResponse::class.java)

    //End Task Bidding Area

    //Start TaskPayment Area

    override fun getTaskPaymentsInfo(request: TaskPaymentsRequest.GetTaskPayments): Observable<TaskPaymentsResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_PAYMENTS_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(TaskPaymentsResponse::class.java)


    override fun performPostTaskPayment(request: TaskPaymentsRequest.ServerTaskPaymentPostRequest): Observable<TaskPaymentsResponse> {

        var gson = Gson()
        var objectString = gson.toJson(request)
        print(objectString)

        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_POST)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(TaskPaymentsResponse::class.java)

    }


    override fun performPutTaskPayment(request: TaskPaymentsRequest.ServerTaskPaymentPutRequest): Observable<TaskPaymentsResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_PUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(TaskPaymentsResponse::class.java)

    override fun performWithdrawPutTaskPayment(taskPaymentId: Long): Observable<TaskPaymentsResponse> =
            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_DELETE + "/" + taskPaymentId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(TaskPaymentsResponse::class.java)

    override fun performPostSSLvalidationTaskPayment(request: TaskPaymentsRequest.ServerTaskSSLPaymentPostRequest): Observable<TaskPaymentsResponse> {


        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_POSTSSLVALIDATION)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(TaskPaymentsResponse::class.java)
    }

    override fun getTaskPaymentsByTaskIDAndTaskBiddingID(request: TaskPaymentsRequest.GetTaskPaymentsByTaskIDAndTaskBiddingId): Observable<TaskPaymentsResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_PAYMENTS_GET_TASK_PAYMENT_TASKID_TASKBIDDINGID)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(TaskPaymentsResponse::class.java)


    //    fun performPostTaskPayment(request: TaskPaymentsRequest.ServerTaskPaymentPostRequest): Observable<TaskPaymentsResponse>
//    fun performPutTaskPayment(request: TaskPaymentsRequest.ServerTaskPaymentPostRequest): Observable<TaskPaymentsResponse>
//    fun performWithdrawPutTaskPayment(taskPaymentId: Long): Observable<TaskPaymentsResponse>
    override fun sendEmailAndNotificationTaskPaymentAlertsByTaskPaymentIdApiCall(taskPaymentId: Long): Observable<TaskPaymentsResponse> =
            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_PAYMENTS_SEND_EMAIL_NOTIFICATION_TASKPAYMENT_ALERTS + "/" + taskPaymentId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(TaskPaymentsResponse::class.java)


    //End TaskPayment Area

    override fun getAllTaskAlert(request: TaskAlertRequest.GetAllTaskAlert): Observable<TaskAlertResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(TaskAlertResponse::class.java)


    override fun addNewTaskAlert(request: TaskAlertRequest.AddNewTaskAlert): Observable<TaskAlertResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(TaskAlertResponse::class.java)

    override fun updateTaskAlert(request: TaskAlertRequest.UpdateTaskAlert): Observable<TaskAlertResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_PUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(TaskAlertResponse::class.java)

    override fun deleteTaskAlert(Id: Long): Observable<TaskAlertResponse> =
            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_DELETE + "/" + Id)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(TaskAlertResponse::class.java)


    override fun updateUserProfile(request: ProfileInfoRequest.UpdateProfileInfoSkill): Observable<ProfileInfoResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_SKILLS_PUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(ProfileInfoResponse::class.java)


    //Start Area Notification Setting
    override fun createNotificationSettings(request: NotificationSettingsRequest.CreateNotificationSettings): Observable<NotificationSettingsResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_SETTINGS_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(NotificationSettingsResponse::class.java)

    override fun updateNotificationSettings(request: NotificationSettingsRequest.UpdateNotificationSettings): Observable<NotificationSettingsResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_SETTINGS_PUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(NotificationSettingsResponse::class.java)

    override fun getNotificationSettings(request: NotificationSettingsRequest.GetNotificationSettings): Observable<NotificationSettingsResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_SETTINGS_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(NotificationSettingsResponse::class.java)


    override fun sendTestPushNotificationToUser(userId: Long): Observable<NotificationListResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_SEND_TEST_NOTIFICATION_GET + "/" + userId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(NotificationListResponse::class.java)


    //sendtestpushnotificationtouser

    // End Area Notification Setting


    override fun getUserReviewListApiCall(request: UserReviewListRequest.GetUserReviewList): Observable<UserReviewListResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_REVIEW_LIST_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(UserReviewListResponse::class.java)

    override fun addPaymentMethodInfo(request: PaymentMethodRequest.AddPaymentMethod): Observable<PaymentMethodResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PAYMENT_METHOD_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(PaymentMethodResponse::class.java)

    override fun updatePaymentMethodInfo(request: PaymentMethodRequest.UpdatePaymentMethod): Observable<PaymentMethodResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PAYMENT_METHOD_PUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(PaymentMethodResponse::class.java)

    override fun getPaymentMethodInfo(request: PaymentMethodRequest.GetPaymentMethod): Observable<PaymentMethodResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PAYMENT_METHOD_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(PaymentMethodResponse::class.java)

    override fun addBillingAddressInfo(request: BillingAddressRequest.AddBillingAddress): Observable<BillingAddressResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_BILLING_ADDRESS_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(BillingAddressResponse::class.java)

    override fun updateBillingAddressInfo(request: BillingAddressRequest.UpdateBillingAddress): Observable<BillingAddressResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_BILLING_ADDRESS_PUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(BillingAddressResponse::class.java)

    override fun getBillingAddressInfo(request: BillingAddressRequest.GetBillingAddress): Observable<BillingAddressResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_BILLING_ADDRESS_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(BillingAddressResponse::class.java)


    // Start Time Line Area
    override fun getTimeLinePostsListApiCall(request: TimeLinePostsRequest.ServerTimeLineRequest): Observable<TimeLinePostsResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(TimeLinePostsResponse::class.java)


    override fun performPostTimeLinePost(request: TimeLinePostsRequest.ServerTimeLinePostRequest): Observable<TimeLinePostsResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(TimeLinePostsResponse::class.java)

    override fun performTimeLineCommentPost(request: TimeLinePostsRequest.ServerTimeLineCommentPostRequest): Observable<TimeLinePostsResponse> {

        var gson = Gson()
        var objectString = gson.toJson(request)
        print(objectString)

        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_COMMENTS_POST)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(TimeLinePostsResponse::class.java)

    }


    override fun getCommentssListApiCall(request: UserCommentRequest.ServerUserCommentRequest): Observable<UserCommentResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_COMMENTS_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(UserCommentResponse::class.java)


    override fun getSendEmailAndNotificationTimeLineApiCall(timelinePostId: Long): Observable<TimeLinePostsResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_SENDEMAIL_NOTIFICATION_GET + "/" + timelinePostId)
                    .addHeaders(apiHeader.privateApiHeader)
                    //.addQueryParameter(request)
                    .build()
                    .getObjectObservable(TimeLinePostsResponse::class.java)

    override fun getSendEmailAndNotificationCommentApiCall(CommentId: Long): Observable<UserCommentResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_COMMENTS_SENDEMAIL_NOTIFICATION_GET + "/" + CommentId)
                    .addHeaders(apiHeader.privateApiHeader)
                    //.addQueryParameter(request)
                    .build()
                    .getObjectObservable(UserCommentResponse::class.java)


    //End Time Line Area


    override fun uplaodPicturesApiCall(request: MediaRequest.ServerMediaPostRequest, file: File): Observable<MediaResponse> =
            Rx2AndroidNetworking.upload(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MEDIA_UPLOADPICTURES)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addMultipartFile("CoverFile", file)
                    .setPriority(Priority.HIGH)
                    .build()
                    .getObjectObservable(MediaResponse::class.java)


    override fun uplaodFileApiCall(request: MediaRequest.ServerMediaPostRequest, file: File): Observable<MediaResponse> = Rx2AndroidNetworking.upload(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MEDIA_UPLOADFILES)
            .addHeaders(apiHeader.privateApiHeader)
            .addMultipartFile("CoverFile", file)
            .setPriority(Priority.HIGH)
            .build()
            .getObjectObservable(MediaResponse::class.java)


    override fun performChangePasswordApiCall(request: ChangePasswordRequest.PasswordChangeRequest): Observable<ChangePasswordResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_CHANGE_PASSWORD_PUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(ChangePasswordResponse::class.java)

    override fun getNotificationListApiCall(request: NotificationListRequest.GetNotificationListRequest): Observable<NotificationListResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_LIST_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(NotificationListResponse::class.java)

    override fun saveUserProfileInfoGeneralApiCall(request: ProfileInfoRequest.UpdateProfileInfoGeneral): Observable<ProfileInfoResponse> {

        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROFILE_SAVE)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .setPriority(Priority.HIGH)
                .build()
                .getObjectObservable(ProfileInfoResponse::class.java)
    }

    override fun updateUserProfileInfoGeneralApiCall(request: ProfileInfoRequest.UpdateProfileInfoGeneral): Observable<ProfileInfoResponse> {

        return Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROFILE_UPDATE)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .setPriority(Priority.HIGH)
                .build()
                .getObjectObservable(ProfileInfoResponse::class.java)
    }


    override fun updateUserProfileSkillApiCall(request: ProfileInfoRequest.UpdateProfileInfoSkill): Observable<ProfileInfoResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROFILE_UPDATE)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(ProfileInfoResponse::class.java)

//    override fun performReportTaskApiCall(request: ReportTaskRequest.ReportTaskRequest): Observable<ReportTaskResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_CHANGE_PASSWORD_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(ReportTaskResponse::class.java)


    override fun performTaskAttachmentApiCall(request: TaskAttachmentRequest.PasswordChangeRequest): Observable<TaskAttachmentResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_CHANGE_PASSWORD_PUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(TaskAttachmentResponse::class.java)


    override fun getDashboardSummaryInfoApiCall(request: DashboardSummaryRequest.GetDashboardSummaryRequest): Observable<DashboardSummaryResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_DASHBOARD_SUMMARY_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(DashboardSummaryResponse::class.java)

    override fun getDashboardTaskSummaryInfoApiCall(request: DashboardSummaryRequest.GetDashboardSummaryRequest): Observable<DashboardTaskSummaryResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_DASHBOARD_TASK_SUMMARY_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(DashboardTaskSummaryResponse::class.java)


    override fun getUserSkillListApiCall(request: UserSkillListRequest.GetUserSkillListRequest): Observable<AboutResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_SKILLS_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(AboutResponse::class.java)

//    override fun updateUserProfileSkill(request: UserSkillListRequest.UpdateUsersSkillListRequest): Observable<AboutResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_SKILLS_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(AboutResponse::class.java)

    override fun addUserProfileSkill(request: UserSkillListRequest.AddUsersSkillListRequest): Observable<AboutResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_SKILLS_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(AboutResponse::class.java)


    // Start User Rating Area

    override fun performPostUserRating(request: UserRatingRequest.ServerUserRatingPostRequest): Observable<UserRatingResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_RATING_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(UserRatingResponse::class.java)


    override fun sendEmailAndNotificationUserRatingByUserRatingIdApiCall(userRatingId: Long): Observable<UserRatingResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_RATING_SEND_EMAIL_NOTIFICATION_GET + "/" + userRatingId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(UserRatingResponse::class.java)
    //End User Rating Area


    // Start Area User Badges
    override fun getUserBadgeListApiCall(request: UserBadgeListRequest.GetUserBadgeListRequest): Observable<UserBadgeListResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_BADGES_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(UserBadgeListResponse::class.java)


    override fun performPostUserBadgeApiCall(request: UserBadgeListRequest.GetUserBadgeRequest): Observable<UserBadgeResponse> {


        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_BADGES_POST)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(UserBadgeResponse::class.java)

    }

    override fun performPostUserNIDApiCall(request: UserBadgeListRequest.PostUserBadgeRequest): Observable<UserBadgeResponse> {

        var gson = Gson()
        var objectString = gson.toJson(request)
        print(objectString)

        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_BADGES_POST)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(UserBadgeResponse::class.java)
    }


// End Area User Badges

    //Start Area User Portfullio


    override fun getUserPortfulioListApiCall(request: UserPortfulioListRequest.GetUserPortfulioListRequest): Observable<UserPortfulioListResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PORTFULIO_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(UserPortfulioListResponse::class.java)


    override fun performUserPortfulioListApiCall(request: UserPortfulioListRequest.ServerUserPortfulioPostRequest): Observable<UserPortfulioListResponse> {

//        var gson = Gson()
//        var objectString = gson.toJson(request)
//        print(objectString)

        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PORTFULIO_POST)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(UserPortfulioListResponse::class.java)
    }


    //End Area User Portfulio

    override fun performUserEmailVerificationApiCall(request: UserBadgeListRequest.GetUserBadgeRequest): Observable<UserBadgeResponse> {


        var gson = Gson()
        var objectString = gson.toJson(request)
        print(objectString)

        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_EMAIL_VERIFICATION_POST)
                .addHeaders(apiHeader.privateApiHeader)
                .addBodyParameter(request)
                .build()
                .getObjectObservable(UserBadgeResponse::class.java)
    }


    override fun performForgotPasswordApiCall(request: ForgotPasswordRequest.ServerForgotPasswordRequest): Observable<ForgotPasswordResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_FORGOT_PASSWORD_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(ForgotPasswordResponse::class.java)


    override fun performPostFCMDeviceInfoApiCall(request: FCMDeviceInfoRequest.ServerFCMDeviceInfoRequest): Observable<FCMDeviceInfoResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_REFRESHED_TOKEN_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(FCMDeviceInfoResponse::class.java)


    override fun getUserPromotionCodeApiCall(request: UserPromotionRequest.GetUserPromotionRequest): Observable<UserPromotionResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROMOTION_CODE_GET)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addQueryParameter(request)
                    .build()
                    .getObjectObservable(UserPromotionResponse::class.java)

    override fun postUserPromotionCodeApiCall(request: UserPromotionRequest.PostUserPromotionRequest): Observable<UserPromotionResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROMOTION_CODE_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(UserPromotionResponse::class.java)

    override fun performReportTaskApiCall(request: ReportTaskRequest.ReportTaskRequestCall): Observable<ReportTaskResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_REPORT_TASK_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(ReportTaskResponse::class.java)

    override fun saveProfilePictureApiCall(request: EntityPropertyRequest.ServerEntityPropertyPostRequest): Observable<EntityPropertyResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PROFILE_PICTURE_POST)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(EntityPropertyResponse::class.java)

    override fun getPublicProfileInfoApiCall(UserId: Long): Observable<ProfileInfoResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PUBLIC_PROFILE_INFO_GET + UserId + "/basic")
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(ProfileInfoResponse::class.java)


    override fun performPutMarkReadNotificationApiCall1(Ids: List<Long>): Observable<NotificationListResponse> =
            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_MARKED_READ_PUT)
                    .addHeaders(apiHeader.privateApiHeader)
                    .addBodyParameter(Ids)
                    .build()
                    .getObjectObservable(NotificationListResponse::class.java)


    override fun getTaskReviewById(TaskId: Long): Observable<UserReviewListResponse> =
            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_REVIEW_GET + "/" + TaskId)
                    .addHeaders(apiHeader.privateApiHeader)
                    .build()
                    .getObjectObservable(UserReviewListResponse::class.java)

}