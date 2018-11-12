package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class NotificationSettingsRequest {

    data class CreateNotificationSettings internal constructor(
            @Expose
            @SerializedName("UserId")
            var UserId: Long? = null,

            @Expose
            @SerializedName("IsTransactionalEmail")
            var IsTransactionalEmail: Boolean? = false,

            @Expose
            @SerializedName("IsTransactionalNotification")
            var IsTransactionalNotification: Boolean? = false,

            @Expose
            @SerializedName("IsTransactionalSMS")
            var IsTransactionalSMS: Boolean? = false,

            @Expose
            @SerializedName("IsTaskUpdateEmail")
            var IsTaskUpdateEmail: Boolean? = false,

            @Expose
            @SerializedName("IsTaskUpdateNotification")
            var IsTaskUpdateNotification: Boolean? = false,

            @Expose
            @SerializedName("IsTaskUpdateSMS")
            var IsTaskUpdateSMS: Boolean? = false,

            @Expose
            @SerializedName("IsTaskReminderEmail")
            var IsTaskReminderEmail: Boolean? = false,

            @Expose
            @SerializedName("IsTaskReminderNotification")
            var IsTaskReminderNotification: Boolean? = false,

            @Expose
            @SerializedName("IsTaskReminderSMS")
            var IsTaskReminderSMS: Boolean? = false,

            @Expose
            @SerializedName("IsShohokariAlertEmail")
            var IsShohokariAlertEmail: Boolean? = false,

            @Expose
            @SerializedName("IsShohokariAlertNotification")
            var IsShohokariAlertNotification: Boolean? = false,

            @Expose
            @SerializedName("IsUpdateAndNewsLetterEmail")
            var IsUpdateAndNewsLetterEmail: Boolean? = false,

            @Expose
            @SerializedName("IsUpdateAndNewsLetterNotification")
            var IsUpdateAndNewsLetterNotification: Boolean? = false,

            @Expose
            @SerializedName("IsHelpFullEmail")
            var IsHelpFullEmail: Boolean? = false,

            @Expose
            @SerializedName("IsHelpFullNotification")
            var IsHelpFullNotification: Boolean? = false,

            @Expose
            @SerializedName("IsTaskRecomendationEmail")
            var IsTaskRecomendationEmail: Boolean? = false,

            @Expose
            @SerializedName("IsTaskRecomendationNotification")
            var IsTaskRecomendationNotification: Boolean? = false,

            @Expose
            @SerializedName("ActivationCode")
            var ActivationCode: String? = null)


    data class UpdateNotificationSettings internal constructor(
            @Expose
            @SerializedName("UserId")
            var UserId: Long? = null,

            @Expose
            @SerializedName("IsTransactionalEmail")
            var IsTransactionalEmail: Boolean? = false,

            @Expose
            @SerializedName("IsTransactionalNotification")
            var IsTransactionalNotification: Boolean? = false,

            @Expose
            @SerializedName("IsTransactionalSMS")
            var IsTransactionalSMS: Boolean? = false,

            @Expose
            @SerializedName("IsTaskUpdateEmail")
            var IsTaskUpdateEmail: Boolean? = false,

            @Expose
            @SerializedName("IsTaskUpdateNotification")
            var IsTaskUpdateNotification: Boolean? = false,

            @Expose
            @SerializedName("IsTaskUpdateSMS")
            var IsTaskUpdateSMS: Boolean? = false,

            @Expose
            @SerializedName("IsTaskReminderEmail")
            var IsTaskReminderEmail: Boolean? = false,

            @Expose
            @SerializedName("IsTaskReminderNotification")
            var IsTaskReminderNotification: Boolean? = false,

            @Expose
            @SerializedName("IsTaskReminderSMS")
            var IsTaskReminderSMS: Boolean? = false,

            @Expose
            @SerializedName("IsShohokariAlertEmail")
            var IsShohokariAlertEmail: Boolean? = false,

            @Expose
            @SerializedName("IsShohokariAlertNotification")
            var IsShohokariAlertNotification: Boolean? = false,

            @Expose
            @SerializedName("IsUpdateAndNewsLetterEmail")
            var IsUpdateAndNewsLetterEmail: Boolean? = false,

            @Expose
            @SerializedName("IsUpdateAndNewsLetterNotification")
            var IsUpdateAndNewsLetterNotification: Boolean? = false,

            @Expose
            @SerializedName("IsHelpFullEmail")
            var IsHelpFullEmail: Boolean? = false,

            @Expose
            @SerializedName("IsHelpFullNotification")
            var IsHelpFullNotification: Boolean? = false,

            @Expose
            @SerializedName("IsTaskRecomendationEmail")
            var IsTaskRecomendationEmail: Boolean? = false,

            @Expose
            @SerializedName("IsTaskRecomendationNotification")
            var IsTaskRecomendationNotification: Boolean? = false,

            @Expose
            @SerializedName("ActivationCode")
            var ActivationCode: String? = null)

    data class GetNotificationSettings internal constructor(@Expose
                                                            @SerializedName("UserId")
                                                            var UserId: Long? = null

    )
}