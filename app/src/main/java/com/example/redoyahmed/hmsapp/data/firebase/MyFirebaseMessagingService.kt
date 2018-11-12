package com.example.redoyahmed.hmsapp.data.firebase

import android.annotation.SuppressLint
import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.media.RingtoneManager
import android.os.Build
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat
import android.support.v4.content.ContextCompat
import com.example.redoyahmed.hmsapp.R
import com.example.redoyahmed.hmsapp.data.network.Notifications
import com.example.redoyahmed.hmsapp.data.preferences.AppPreferenceHelper
import com.example.redoyahmed.hmsapp.util.AppConstants
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.google.gson.Gson
import org.json.JSONException


/*
class MyFirebaseMessagingService : FirebaseMessagingService() {

    internal var intent: Intent? = null
    var Notification_ID = 1
    var appPreferenceHelper: AppPreferenceHelper? = null

    override fun onNewToken(Token: String?) {
        super.onNewToken(Token)
        appPreferenceHelper = AppPreferenceHelper(applicationContext, AppConstants.PREF_NAME)
        appPreferenceHelper?.setFCMToken(Token)
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        send(remoteMessage)
        //testNotification(remoteMessage)
    }

    @SuppressLint("NewApi")
    private fun testNotification(remoteMessage: RemoteMessage?) {
        val gson = Gson()
        var notifications: Notifications? = null

        var title: String? = null
        var message: String? = null

        try {
            notifications = gson.fromJson(remoteMessage?.notification!!.body, Notifications::class.java)
        } catch (ex: Exception) {
        }

        if (notifications != null && notifications.EntityName == AppConstants.TestPushNotitification) {
            title = notifications.Message
            message = notifications.Description
        }

        val res = this.resources
        val context = this.applicationContext
        val notificationManager: NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val mBuilder = NotificationCompat.Builder(this, NotificationSettingsActivity.CHANNEL_ID)
                    .setSmallIcon(R.drawable.ic_stat_name)
                    .setAutoCancel(true)
                    .setContentTitle(title)
                    .setContentText(message)
            mBuilder.color = ContextCompat.getColor(context, R.color.colorPrimaryDark)

            with(NotificationManagerCompat.from(context)) {
                notify(100, mBuilder.build())
            }
        } else {
            val mNotification: Notification = Notification.Builder(this)
                    .setSmallIcon(R.drawable.ic_stat_name)
                    .setAutoCancel(true)
                    .setContentTitle(title)
                    .setColor(ContextCompat.getColor(context, R.color.colorPrimaryDark))
                    .setContentText(message).build()

            notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.notify(1000, mNotification)
        }
    }

    @Throws(JSONException::class)
    private fun send(remoteMessage: RemoteMessage?) {


        var title: String? = getString(R.string.app_name)
        var message: String? = null
        var notifications: Notifications? = null

        val NOTIFICATION_CHANNEL_ID = "com.shohokari.android.app"
        val inboxStyle = NotificationCompat.InboxStyle()
        val uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        val notificationManager = this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(NOTIFICATION_CHANNEL_ID, "My Notifications", NotificationManager.IMPORTANCE_DEFAULT)
            notificationChannel.description = "Channel description"
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.RED
            notificationChannel.vibrationPattern = longArrayOf(0, 1000, 500, 1000)
            notificationChannel.enableVibration(true)
            notificationManager.createNotificationChannel(notificationChannel)
        }

        val notificationBuilder = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)

        if (remoteMessage?.data != null) {
            notifications = Notifications()
            notifications?.Id = remoteMessage?.data?.get("Id")?.toLong()!!
            notifications?.IsRead = remoteMessage?.data?.get("IsRead")?.toBoolean()
            notifications?.PublishDateTime = remoteMessage?.data?.get("PublishDateTime")
            notifications?.ReadDateTime = remoteMessage?.data?.get("ReadDateTime")
            notifications?.EntityId = remoteMessage?.data?.get("EntityId")?.toLong()
            notifications?.EntityName = remoteMessage?.data?.get("EntityName")
            notifications?.EntityTitle = remoteMessage?.data?.get("EntityTitle")
            notifications?.EntityDescription = remoteMessage?.data?.get("EntityDescription")
            notifications?.EventName = remoteMessage?.data?.get("EventName")
            notifications?.InitiatorId = remoteMessage?.data?.get("InitiatorId")
            notifications?.InitiatorDisplayName = remoteMessage?.data?.get("InitiatorDisplayName")
            notifications?.InitiatorName = remoteMessage?.data?.get("InitiatorName")
            notifications?.InitiatorImageUrl = remoteMessage?.data?.get("InitiatorImageUrl")
            notifications?.Message = remoteMessage?.data?.get("Message")
            notifications?.WebUrl = remoteMessage?.data?.get("WebUrl")
            notifications?.Description = remoteMessage?.data?.get("Description")
            notifications?.NotificationEventId = remoteMessage?.data?.get("NotificationEventId")?.toInt()!!

        }

        //  if (remoteMessage!!.notification!!.body != null && remoteMessage.notification!!.tag != null && remoteMessage.notification!!.tag!!.isNotEmpty()) {
//            val gson = Gson()
//            //  var notifications: Notifications? = null
//
//            try {
//                notifications = gson.fromJson(remoteMessage.notification!!.tag, Notifications::class.java)
//            } catch (ex: Exception) {
//            }

        if (notifications != null && notifications.EntityId!! > 0) {
            if (notifications.EntityName == AppConstants.NOTIFICATION_NAME_Task) {
                intent = Intent(this, TaskDetailsActivity::class.java)
                intent!!.putExtra("PUSHNOTIFICATION_TASKID", notifications.EntityId!!)

            } else if (notifications.EntityName == AppConstants.NOTIFICATION_NAME_TaskBidding) {
                notifications.Description = getString(R.string.push_notification_make_offer, notifications.InitiatorName)
                intent = Intent(this, OfferConversationActivity::class.java)
                intent!!.putExtra("PUSHNOTIFICATION_TASKBIDDINGID", notifications.EntityId!!)

            } else if (notifications.EntityName == AppConstants.NOTIFICATION_NAME_TaskBiddingComment || notifications.EntityName == AppConstants.NOTIFICATION_NAME_TaskBiddingAdminComment) {
                notifications.Description = getString(R.string.push_notification_task_comment, notifications.InitiatorName)
                when {
                    notifications.NotificationEventId == 1011
                    -> {
                        if (AppConstants.APPLICATION_RUNNING_ACTIVITY_NAME == "ChatActivity") {
                            return
                        }
                        notifications.Description = getString(R.string.push_notification_private_message, notifications.InitiatorName)
                        intent = Intent(this, ChatActivity::class.java)
                        intent!!.putExtra("title", notifications.Message)
                        intent!!.putExtra("PUSHNOTIFICATION_TASKID", notifications.EntityId!!)
                    }
                    notifications.NotificationEventId == 1012
                    -> {
                        if (AppConstants.APPLICATION_RUNNING_ACTIVITY_NAME == "OfferConversationActivity") {
                            return
                        }
                        notifications.Description = getString(R.string.push_notification_offer_message, notifications.InitiatorName)
                        intent = Intent(this, OfferConversationActivity::class.java)
                        intent!!.putExtra("PUSHNOTIFICATION_TASKBIDDINGID", notifications.EntityId!!)

                    }
                    else -> {
                        intent = Intent(this, PublicChatActivity::class.java)
                        intent!!.putExtra("PUSHNOTIFICATION_TASKID", notifications.EntityId!!)
                    }
                }
            } else if (notifications.EntityName == AppConstants.NOTIFICATION_NAME_TaskBiddingRequestPayment) {
                notifications.Description = getString(R.string.push_notification_payment_request, notifications.InitiatorName)
                intent = Intent(this, TaskNotificationActivity::class.java)
                intent!!.putExtra("title", notifications.Message)
                intent!!.putExtra("body", notifications.Description)


            } else if (notifications.EntityName == AppConstants.NOTIFICATION_NAME_TaskBiddingAccepted) {
                notifications.Description = getString(R.string.push_notification_accept_offer, notifications.InitiatorName)
                intent = Intent(this, OfferConversationActivity::class.java)
                intent!!.putExtra("PUSHNOTIFICATION_TASKBIDDINGID", notifications.EntityId!!)

                intent!!.putExtra("title", notifications.Message)
                intent!!.putExtra("body", notifications.Description)
            } else if (notifications != null && notifications?.EntityName == AppConstants.NOTIFICATION_NAME_TaskPaymentConfirmation) {
                notifications.Description = getString(R.string.push_notification_payment_confirmation, notifications.InitiatorName) // "[Payment Confirmation] " + notifications.InitiatorName + " has been received payment for task"

                intent = Intent(this, TaskDetailsActivity::class.java)
                intent!!.putExtra("PUSHNOTIFICATION_TASKID", notifications.EntityId!!)

                intent!!.putExtra("title", notifications!!.Message)
                intent!!.putExtra("body", notifications.Description)

            } else if (notifications != null && notifications?.EntityName == AppConstants.NOTIFICATION_NAME_UserRating) {

                intent = Intent(this, TaskDetailsActivity::class.java)
                intent!!.putExtra("PUSHNOTIFICATION_TASKID", notifications.Description!!.toLong()!!)

                notifications.Description = getString(R.string.push_notification_user_review, notifications.InitiatorName)

//                    intent = Intent(this, TaskDetailsActivity::class.java)
//                    intent!!.putExtra("PUSHNOTIFICATION_TASKID", notifications.Description!!.toLong()!!)

                intent!!.putExtra("title", notifications!!.Message)
                intent!!.putExtra("body", notifications.Description)

            } else {
                intent = Intent(this, TaskNotificationActivity::class.java)
                intent!!.putExtra("title", notifications.Message)
                intent!!.putExtra("body", notifications.Description)
            }

            notificationBuilder.setContentTitle(title)
            // notificationBuilder.setContentTitle(notifications.Message)
            //notificationBuilder.setSubText(notifications.Description)
            notificationBuilder.setContentText(notifications.Description)

        } else if (notifications != null && notifications.EntityName == AppConstants.TestPushNotitification) {
            intent = Intent(this, TaskNotificationActivity::class.java)
            notificationBuilder.setContentTitle(title)
            //notificationBuilder.setContentTitle(notifications.Message)
            //notificationBuilder.setSubText(notifications.Description)
            notificationBuilder.setContentText(notifications.Description)

            intent!!.putExtra("title", notifications.Message)
            intent!!.putExtra("body", notifications.Description)

        } else {
            intent = Intent(this, TaskNotificationActivity::class.java)
            intent!!.putExtra("title", remoteMessage?.notification?.title)
            intent!!.putExtra("body", remoteMessage?.notification?.body)
            notificationBuilder.setContentTitle(title)
            //   notificationBuilder.setContentTitle(remoteMessage.notification!!.title)
            notificationBuilder.setContentText(remoteMessage?.notification?.body)
        }
//        } else {
//            intent = Intent(this, TaskNotificationActivity::class.java)
//            intent!!.putExtra("title", remoteMessage.notification!!.title)
//            notificationBuilder.setContentTitle(title)
//         //   notificationBuilder.setContentTitle(remoteMessage.notification!!.title)
//            notificationBuilder.setContentText(remoteMessage.notification!!.body)
//        }


        //    intent!!.putExtra("data", remoteMessage.notification!!.tag!!)

        //intent!!.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        intent!!.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)


        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)
        //notificationBuilder.setSmallIcon(R.mipmap.ic_launcher)

        notificationBuilder.setSmallIcon(R.drawable.ic_notification)
        notificationBuilder.setSound(uri)

        // notificationBuilder.setStyle(inboxStyle)
        notificationBuilder.setVibrate(longArrayOf(1000, 1000, 1000, 1000, 1000))
        notificationBuilder.setAutoCancel(false)
        notificationBuilder.setContentIntent(pendingIntent)
        notificationBuilder.color = ContextCompat.getColor(this, R.color.colorPrimaryDark)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notificationBuilder.priority = NotificationManager.IMPORTANCE_HIGH
        } else {
            notificationBuilder.priority = NotificationManager.IMPORTANCE_HIGH
        }

        notificationManager.notify(System.currentTimeMillis().toInt(), notificationBuilder.build())

        appPreferenceHelper = AppPreferenceHelper(applicationContext, AppConstants.PREF_NAME)
        appPreferenceHelper?.setUnreadNotificationCount(appPreferenceHelper!!.getUnreadNotificationCount() + 1)

//        if (notifications != null && notifications.Id > 0) {
//            title = notifications.Message
//            message = notifications.Description
//        } else {
//            title = remoteMessage.notification?.title
//            //message = remoteMessage.notification?.body
//            //message = notifications?.Description
//        }
//
//        showNotification(title!!, message!!)
    }

    @SuppressLint("NewApi")
    private fun showNotification(title: String, message: String) {

        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)
        val res = this.resources
        val context = this.applicationContext
        val notificationManager: NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val mBuilder = NotificationCompat.Builder(this, NotificationSettingsActivity.CHANNEL_ID)
                    .setSmallIcon(R.drawable.ic_stat_name)
                    .setAutoCancel(true)
                    .setContentTitle(title)
                    .setContentIntent(pendingIntent)
                    .setContentText(message)
                    .setVibrate(longArrayOf(1000, 1000, 1000, 1000, 1000))
            mBuilder.color = ContextCompat.getColor(context, R.color.colorPrimaryDark)

            with(NotificationManagerCompat.from(context)) {
                notify(Notification_ID, mBuilder.build())
            }
        } else {
            val mNotification: Notification = Notification.Builder(this)
                    .setSmallIcon(R.drawable.ic_stat_name)
                    .setAutoCancel(true)
                    .setContentTitle(title)
                    .setContentIntent(pendingIntent)
                    .setVibrate(longArrayOf(1000, 1000, 1000, 1000, 1000))
                    .setColor(ContextCompat.getColor(context, R.color.colorPrimaryDark))
                    .setContentText(message).build()

            notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.notify(Notification_ID, mNotification)
        }


        if (applicationInForeground()) {
            playNotificationSound(this)
        }
        Notification_ID++
    }

    fun showNotification(from: String, notification: String, intent: Intent) {

        val pendingIntent = PendingIntent.getActivity(this, Notification_ID, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        val NOTIFICATION_CHANNEL_ID = "com.trux24.android.app"
        val notificationManager = this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(NOTIFICATION_CHANNEL_ID, "My Notifications", NotificationManager.IMPORTANCE_DEFAULT)
            // Configure the notification channel.
            notificationChannel.description = "Channel description"
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.RED
            notificationChannel.vibrationPattern = longArrayOf(0, 1000, 500, 1000)
            notificationChannel.enableVibration(true)
            notificationManager.createNotificationChannel(notificationChannel)
        }

        val builder = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
        val mNotification = builder
                .setContentTitle(from)
                .setContentText(notification)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(this.resources, R.mipmap.ic_launcher))
                .build()

        notificationManager.notify(Notification_ID, mNotification)

        Notification_ID++
    }


    fun playNotificationSound(context: Context) {
        try {
            val notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            val r = RingtoneManager.getRingtone(context, notification)
            r.play()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun applicationInForeground(): Boolean {
        var isActivityFound = false
        try {
            val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            val services = activityManager!!.getRunningAppProcesses()


            if (services.get(0).processName
                            .equals(packageName, true)) {
                isActivityFound = true
            }
        } catch (ex: Exception) {

        }
        return isActivityFound
    }
}*/
