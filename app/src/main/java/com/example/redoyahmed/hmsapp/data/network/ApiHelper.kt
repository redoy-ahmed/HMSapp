package com.example.redoyahmed.hmsapp.data.network

import com.androidnetworking.interfaces.OkHttpResponseListener
import io.reactivex.Observable
import java.io.File

interface ApiHelper {

    fun setAccessToken(token: String)

    //Start Area Authentication
    fun performServerLogin(request: SignInRequest.ServerLoginRequest): Observable<SignInResponse>
    fun performServerSignUp(request: SignUpRequest.ServerSignUpRequest): Observable<SignUpResponse>
    fun performChangePasswordApiCall(request: ChangePasswordRequest.PasswordChangeRequest): Observable<ChangePasswordResponse>
    fun performLogoutApiCall(): Observable<LogoutResponse>

    //Start Area Authentication
    fun getHomeInfoApiCall(): Observable<HomeInfoResponse>

    //Start Task Area
    fun getMyTaskDetailsApiCall(request: TaskRequest.ServerTaskRequest): Observable<TaskResponse>

    fun getBrowseTaskListApiCall(request: TaskRequest.ServerTaskRequest): Observable<TaskResponse>

    fun performPostTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse>
    fun performUpdateTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse>

    fun performPostTaskResponseTesting(request: TaskRequest.ServerTaskPostRequest, okHttpResponseListener: OkHttpResponseListener)

    fun updateTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse>


    fun performPostTaskDelete(taskId: Long): Observable<TaskResponse>
    fun saveTaskPictures(request: EntityPropertyRequest.ServerEntityPropertyPostRequest): Observable<MediaResponse>
    fun getTaskPictures(taskId: Long): Observable<MediaResponse>
    fun deleteTaskPictures(mediaId: Long): Observable<MediaResponse>

    fun getTaskByTaskIdApiCall(taskId: Long): Observable<TaskResponse>
    fun sendEmailAndNotificationTaskAlertsByTaskIdApiCall(taskId: Long): Observable<TaskResponse>


    //End Task Area


    //Start Task Bidding Area

    fun getTaskBiddingListApiCall(request: TaskBiddingRequest.ServerTaskBiddingRequest): Observable<TaskBiddingResponse>
    fun performPostTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse>
    fun performPutTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse>
    fun performWithdrawPutTaskBidding(taskBiddingId: Long): Observable<TaskBiddingResponse>

    fun performPutAcceptPaymentConfirmationTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse>
    fun sendEmailAndNotificationTaskBiddingAlertsByTaskBiddingIdApiCall(taskbiddingId: Long): Observable<TaskBiddingResponse>
    fun getTaskBiddingByTaskBiddingIdApiCall(taskBiddingId: Long): Observable<TaskBiddingResponse>
    //End Task Bidding Area

    //Start Task Payment Area

    fun getTaskPaymentsInfo(request: TaskPaymentsRequest.GetTaskPayments): Observable<TaskPaymentsResponse>
    fun performPostTaskPayment(request: TaskPaymentsRequest.ServerTaskPaymentPostRequest): Observable<TaskPaymentsResponse>
    fun performPutTaskPayment(request: TaskPaymentsRequest.ServerTaskPaymentPutRequest): Observable<TaskPaymentsResponse>
    fun performWithdrawPutTaskPayment(taskPaymentId: Long): Observable<TaskPaymentsResponse>

    fun performPostSSLvalidationTaskPayment(request: TaskPaymentsRequest.ServerTaskSSLPaymentPostRequest): Observable<TaskPaymentsResponse>
    fun getTaskPaymentsByTaskIDAndTaskBiddingID(request: TaskPaymentsRequest.GetTaskPaymentsByTaskIDAndTaskBiddingId): Observable<TaskPaymentsResponse>
    fun sendEmailAndNotificationTaskPaymentAlertsByTaskPaymentIdApiCall(taskPaymentId: Long): Observable<TaskPaymentsResponse>
    //End Task Payment Area

    fun getAllTaskAlert(request: TaskAlertRequest.GetAllTaskAlert): Observable<TaskAlertResponse>
    fun addNewTaskAlert(request: TaskAlertRequest.AddNewTaskAlert): Observable<TaskAlertResponse>
    fun updateTaskAlert(request: TaskAlertRequest.UpdateTaskAlert): Observable<TaskAlertResponse>
    fun deleteTaskAlert(Id: Long): Observable<TaskAlertResponse>

    fun updateUserProfile(request: ProfileInfoRequest.UpdateProfileInfoSkill): Observable<ProfileInfoResponse>


    //Start Area Notification Setting

    fun createNotificationSettings(request: NotificationSettingsRequest.CreateNotificationSettings): Observable<NotificationSettingsResponse>

    fun updateNotificationSettings(request: NotificationSettingsRequest.UpdateNotificationSettings): Observable<NotificationSettingsResponse>

    fun getNotificationSettings(request: NotificationSettingsRequest.GetNotificationSettings): Observable<NotificationSettingsResponse>

    fun sendTestPushNotificationToUser(userId: Long): Observable<NotificationListResponse>

    // End Area Notification Setting


    fun getUserReviewListApiCall(request: UserReviewListRequest.GetUserReviewList): Observable<UserReviewListResponse>

    fun addPaymentMethodInfo(request: PaymentMethodRequest.AddPaymentMethod): Observable<PaymentMethodResponse>

    fun updatePaymentMethodInfo(request: PaymentMethodRequest.UpdatePaymentMethod): Observable<PaymentMethodResponse>

    fun getPaymentMethodInfo(request: PaymentMethodRequest.GetPaymentMethod): Observable<PaymentMethodResponse>

    fun addBillingAddressInfo(request: BillingAddressRequest.AddBillingAddress): Observable<BillingAddressResponse>

    fun updateBillingAddressInfo(request: BillingAddressRequest.UpdateBillingAddress): Observable<BillingAddressResponse>

    fun getBillingAddressInfo(request: BillingAddressRequest.GetBillingAddress): Observable<BillingAddressResponse>


    /// Time Line
    fun getTimeLinePostsListApiCall(request: TimeLinePostsRequest.ServerTimeLineRequest): Observable<TimeLinePostsResponse>

    fun performPostTimeLinePost(request: TimeLinePostsRequest.ServerTimeLinePostRequest): Observable<TimeLinePostsResponse>
    fun performTimeLineCommentPost(request: TimeLinePostsRequest.ServerTimeLineCommentPostRequest): Observable<TimeLinePostsResponse>
    fun getCommentssListApiCall(request: UserCommentRequest.ServerUserCommentRequest): Observable<UserCommentResponse>
    fun getSendEmailAndNotificationTimeLineApiCall(timelinePostId : Long): Observable<TimeLinePostsResponse>

    fun getSendEmailAndNotificationCommentApiCall(CommentId : Long): Observable<UserCommentResponse>

    //Uplaoding Images
    fun uplaodPicturesApiCall(request: MediaRequest.ServerMediaPostRequest, file: File): Observable<MediaResponse>

    fun uplaodFileApiCall(request: MediaRequest.ServerMediaPostRequest, file: File): Observable<MediaResponse>


    fun getNotificationListApiCall(request: NotificationListRequest.GetNotificationListRequest): Observable<NotificationListResponse>

    //Start User Profile Area
    fun saveUserProfileInfoGeneralApiCall(request: ProfileInfoRequest.UpdateProfileInfoGeneral): Observable<ProfileInfoResponse>

    fun updateUserProfileInfoGeneralApiCall(request: ProfileInfoRequest.UpdateProfileInfoGeneral): Observable<ProfileInfoResponse>

    //End User Profile Area


    fun updateUserProfileSkillApiCall(request: ProfileInfoRequest.UpdateProfileInfoSkill): Observable<ProfileInfoResponse>

    fun performTaskAttachmentApiCall(request: TaskAttachmentRequest.PasswordChangeRequest): Observable<TaskAttachmentResponse>

    fun getDashboardSummaryInfoApiCall(request: DashboardSummaryRequest.GetDashboardSummaryRequest): Observable<DashboardSummaryResponse>
    fun getDashboardTaskSummaryInfoApiCall(request: DashboardSummaryRequest.GetDashboardSummaryRequest): Observable<DashboardTaskSummaryResponse>

    fun getUserSkillListApiCall(request: UserSkillListRequest.GetUserSkillListRequest): Observable<AboutResponse>
    fun addUserProfileSkill(request: UserSkillListRequest.AddUsersSkillListRequest): Observable<AboutResponse>
    //fun updateUserProfileSkill(request: UserSkillListRequest.UpdateUsersSkillListRequest): Observable<AboutResponse>

    // Start User Rating Area

    fun performPostUserRating(request: UserRatingRequest.ServerUserRatingPostRequest): Observable<UserRatingResponse>
    fun sendEmailAndNotificationUserRatingByUserRatingIdApiCall(userRatingId: Long): Observable<UserRatingResponse>

    //End User Rating Area


    // Start Badges Area

    fun getUserBadgeListApiCall(request: UserBadgeListRequest.GetUserBadgeListRequest): Observable<UserBadgeListResponse>
    fun performPostUserBadgeApiCall(request: UserBadgeListRequest.GetUserBadgeRequest): Observable<UserBadgeResponse>
    fun performPostUserNIDApiCall(request: UserBadgeListRequest.PostUserBadgeRequest): Observable<UserBadgeResponse>

    //End Badges Area

    //Start Area User Portfulio
    fun getUserPortfulioListApiCall(request: UserPortfulioListRequest.GetUserPortfulioListRequest): Observable<UserPortfulioListResponse>

    fun performUserPortfulioListApiCall(request: UserPortfulioListRequest.ServerUserPortfulioPostRequest): Observable<UserPortfulioListResponse>
    //End Area

    fun performUserEmailVerificationApiCall(request: UserBadgeListRequest.GetUserBadgeRequest): Observable<UserBadgeResponse>

    fun performForgotPasswordApiCall(request: ForgotPasswordRequest.ServerForgotPasswordRequest): Observable<ForgotPasswordResponse>

    fun performPostFCMDeviceInfoApiCall(request: FCMDeviceInfoRequest.ServerFCMDeviceInfoRequest): Observable<FCMDeviceInfoResponse>

    fun postUserPromotionCodeApiCall(request: UserPromotionRequest.PostUserPromotionRequest): Observable<UserPromotionResponse>

    fun getUserPromotionCodeApiCall(request: UserPromotionRequest.GetUserPromotionRequest): Observable<UserPromotionResponse>

    fun performReportTaskApiCall(request: ReportTaskRequest.ReportTaskRequestCall): Observable<ReportTaskResponse>

    fun saveProfilePictureApiCall(request: EntityPropertyRequest.ServerEntityPropertyPostRequest): Observable<EntityPropertyResponse>

    fun getPublicProfileInfoApiCall(UserId: Long): Observable<ProfileInfoResponse>

    fun performPutMarkReadNotificationApiCall1(Ids: List<Long>): Observable<NotificationListResponse>

    fun getTaskReviewById(TaskId: Long): Observable<UserReviewListResponse>
}