package com.example.redoyahmed.hmsapp.di.builder

import com.shohokari.ui.support.view.SupportActivity
import com.shohokari.ui.allreviews.AllReviewsActivityModule
import com.shohokari.ui.allreviews.view.AllReviewsActivity
import com.shohokari.ui.bankaccount.AddBankAccountActivityModule
import com.shohokari.ui.bankaccount.view.AddBankAccountActivity
import com.shohokari.ui.billingaddress.AddBillingAddressActivityModule
import com.shohokari.ui.billingaddress.view.AddBillingAddressActivity
import com.shohokari.ui.browsetask.BrowseTaskFragmentProvider
import com.shohokari.ui.browsetaskfilter.BrowseTasksFilterActivityModule
import com.shohokari.ui.browsetaskfilter.view.BrowseTasksFilterActivity
import com.shohokari.ui.changepassword.ChangePasswordActivityModule
import com.shohokari.ui.changepassword.view.ChangePasswordActivity
import com.shohokari.ui.chat.ChatActivityModule
import com.shohokari.ui.chat.view.ChatActivity
import com.shohokari.ui.comments.CommentsActivityModule
import com.shohokari.ui.comments.view.CommentsActivity
import com.shohokari.ui.confirmoffer.ConfirmOfferActivityModule
import com.shohokari.ui.confirmoffer.view.ConfirmOfferActivity
import com.shohokari.ui.contactus.ContactUsActivityModule
import com.shohokari.ui.contactus.view.ContactUsActivity
import com.shohokari.ui.createprofile.CreateProfileActivityModule
import com.shohokari.ui.createprofile.view.CreateProfileActivity
import com.shohokari.ui.creditcard.AddCreditCardActivityModule
import com.shohokari.ui.creditcard.view.AddCreditCardActivity
import com.shohokari.ui.dashboard.DashboardActivityModule
import com.shohokari.ui.dashboard.dashboardnotifications.DashboardNotificationsFragmentProvider
import com.shohokari.ui.dashboard.dashboardstats.DashboardStatsFragmentProvider
import com.shohokari.ui.dashboard.view.DashboardActivity
import com.shohokari.ui.fullscreenimage.FullscreenImageActivityModule
import com.shohokari.ui.fullscreenimage.view.FullscreenImageActivity
import com.shohokari.ui.fundedpayment.FundedPaymentActivityModule
import com.shohokari.ui.fundedpayment.view.FundedPaymentActivity
import com.shohokari.ui.help.HelpActivityModule
import com.shohokari.ui.help.view.HelpActivity
import com.shohokari.ui.introduction.IntroductionActivityModule
import com.shohokari.ui.introduction.view.IntroductionActivity
import com.shohokari.ui.leavereview.LeaveReviewActivityModule
import com.shohokari.ui.leavereview.view.LeaveReviewActivity
import com.shohokari.ui.login.LoginActivityModule
import com.shohokari.ui.login.view.LoginActivity
import com.shohokari.ui.main.MainActivityModule
import com.shohokari.ui.main.view.MainActivity
import com.shohokari.ui.makeoffer.MakeOfferActivityModule
import com.shohokari.ui.makeoffer.view.MakeOfferActivity
import com.shohokari.ui.message.MessageFragmentProvider
import com.shohokari.ui.mobilepayment.MobilePaymentActivityModule
import com.shohokari.ui.mobilepayment.view.MobilePaymentActivity
import com.shohokari.ui.mobileverification.MobileVerificationActivityModule
import com.shohokari.ui.mobileverification.view.MobileVerificationActivity
import com.shohokari.ui.more.MoreFragmentProvider
import com.shohokari.ui.mytask.MyTaskFragmentProvider
import com.shohokari.ui.mytasklist.MyTaskListFragmentProvider
import com.shohokari.ui.offer.OfferConversationActivityModule
import com.shohokari.ui.offer.view.OfferConversationActivity
import com.shohokari.ui.offeracceptedconfirmation.OfferAcceptedConfirmationActivityModule
import com.shohokari.ui.offeracceptedconfirmation.view.OfferAcceptedConfirmationActivity
import com.shohokari.ui.onboarding.OnBoardingActivityModule
import com.shohokari.ui.onboarding.view.OnBoardingActivity
import com.shohokari.ui.payment.paymenthistory.PaymentHistoryActivityModule
import com.shohokari.ui.payment.paymenthistory.earned.PaymentsEarnedFragmentProvider
import com.shohokari.ui.payment.paymenthistory.outgoing.PaymentsOutgoingFragmentProvider
import com.shohokari.ui.payment.paymenthistory.view.PaymentHistoryActivity
import com.shohokari.ui.payment.paymentmethods.makepayments.MakePaymentsFragmentProvider
import com.shohokari.ui.payment.paymentmethods.receivepayments.ReceivePaymentsFragmentProvider
import com.shohokari.ui.payment.paymentsettings.PaymentSettingsActivityModule
import com.shohokari.ui.payment.paymentsettings.view.PaymentSettingsActivity
import com.shohokari.ui.profile.editprofile.EditUserProfileActivityModule
import com.shohokari.ui.profile.editprofile.view.EditUserProfileActivity
import com.shohokari.ui.profile.editskill.EditUserSkillActivityModule
import com.shohokari.ui.profile.editskill.view.EditUserSkillActivity
import com.shohokari.ui.profile.userportfulioitems.UserPortfulioItemsFragmentProvider
import com.shohokari.ui.profile.userprofile.UserProfileActivityModule
import com.shohokari.ui.profile.userprofile.view.UserProfileActivity
import com.shohokari.ui.promotion.AddShohokariCardActivityModule
import com.shohokari.ui.promotion.view.AddShohokariCardActivity
import com.shohokari.ui.publicchat.PublicChatActivityModule
import com.shohokari.ui.publicchat.view.PublicChatActivity
import com.shohokari.ui.rate.RateUsDialogFragmentProvider
import com.shohokari.ui.receivedpayment.ReceivedPaymentActivityModule
import com.shohokari.ui.receivedpayment.view.ReceivedPaymentActivity
import com.shohokari.ui.releasepayment.ReleasePaymentActivityModule
import com.shohokari.ui.releasepayment.view.ReleasePaymentActivity
import com.shohokari.ui.reporttask.ReportTaskActivityModule
import com.shohokari.ui.reporttask.view.ReportTaskActivity
import com.shohokari.ui.requestpayment.RequestPaymentActivityModule
import com.shohokari.ui.requestpayment.view.RequestPaymentActivity
import com.shohokari.ui.notification.NotificationSettingsActivityModule
import com.shohokari.ui.notification.details.NotificationSettingsDetailsActivityModule
import com.shohokari.ui.notification.details.view.NotificationSettingsDetailsActivity
import com.shohokari.ui.notification.view.NotificationSettingsActivity
import com.shohokari.ui.settingshome.SettingsActivityModule
import com.shohokari.ui.settingshome.view.SettingsActivity
import com.shohokari.ui.signinsignupwithmobile.SignInSignUpWithMobileActivityModule
import com.shohokari.ui.signinsignupwithmobile.view.SignInSignUpWithMobileActivity
import com.shohokari.ui.signup.SignUpActivityModule
import com.shohokari.ui.signup.view.SignUpActivity
import com.shohokari.ui.splash.SplashActivityModule
import com.shohokari.ui.splash.view.SplashMVPActivity
import com.shohokari.ui.support.SupportActivityModule
import com.shohokari.ui.task.TaskFragmentProvider
import com.shohokari.ui.taskalert.taskalertall.AlertTaskActivityModule
import com.shohokari.ui.taskalert.taskalertall.view.AlertTaskActivity
import com.shohokari.ui.taskalert.taskalertnew.AlertTaskDetailsActivityModule
import com.shohokari.ui.taskalert.taskalertnew.view.AlertTaskDetailsActivity
import com.shohokari.ui.taskattachment.TaskAttachmentActivityModule
import com.shohokari.ui.taskattachment.view.TaskAttachmentActivity
import com.shohokari.ui.taskdetails.TaskDetailsActivityModule
import com.shohokari.ui.taskdetails.view.TaskDetailsActivity
import com.shohokari.ui.tasklocation.TaskLocationActivityModule
import com.shohokari.ui.tasklocation.view.TaskLocationActivity
import com.shohokari.ui.tasknotification.TaskNotificationActivityModule
import com.shohokari.ui.tasknotification.view.TaskNotificationActivity
import com.shohokari.ui.taskpost.TaskPostActivityModule
import com.shohokari.ui.taskpost.taskpostbudget.TaskPostBudgetFragmentProvider
import com.shohokari.ui.taskpost.taskpostdetails.TaskPostDetailsFragmentProvider
import com.shohokari.ui.taskpost.taskpostduedate.TaskPostDueDateFragmentProvider
import com.shohokari.ui.taskpost.view.TaskPostActivity
import com.shohokari.ui.taskpostcompleted.TaskPostCompletedActivityModule
import com.shohokari.ui.taskpostcompleted.view.TaskPostCompletedActivity
import com.shohokari.ui.termsandconditions.TermsAndConditionsActivityModule
import com.shohokari.ui.termsandconditions.view.TermsAndConditionsActivity
import com.shohokari.ui.usernotificationlist.UserNotificationListActivityModule
import com.shohokari.ui.usernotificationlist.view.UserNotificationListActivity
import com.shohokari.ui.userreview.UserReviewListActivityModule
import com.shohokari.ui.userreview.view.UserReviewListActivity
import com.shohokari.ui.viewoffers.ViewOffersActivityModule
import com.shohokari.ui.viewoffers.view.ViewOffersActivity

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jyotidubey on 05/01/18.
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(SplashActivityModule::class)])
    abstract fun bindSplashActivity(): SplashMVPActivity

    @ContributesAndroidInjector(modules = [(MainActivityModule::class), (RateUsDialogFragmentProvider::class), (TaskFragmentProvider::class), (BrowseTaskFragmentProvider::class), (MyTaskFragmentProvider::class), (MessageFragmentProvider::class), (MoreFragmentProvider::class), (MyTaskListFragmentProvider::class)])
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [(LoginActivityModule::class)])
    abstract fun bindLoginActivity(): LoginActivity

    @ContributesAndroidInjector(modules = [(TaskPostActivityModule::class), (TaskPostBudgetFragmentProvider::class), (TaskPostDetailsFragmentProvider::class), (TaskPostDueDateFragmentProvider::class)])
    abstract fun bindTaskPostActivity(): TaskPostActivity

    @ContributesAndroidInjector(modules = [(TaskDetailsActivityModule::class)])
    abstract fun bindTaskDetailsActivity(): TaskDetailsActivity


    @ContributesAndroidInjector(modules = [(AlertTaskActivityModule::class)])
    abstract fun bindAlertTaskActivity(): AlertTaskActivity

    @ContributesAndroidInjector(modules = [(AlertTaskDetailsActivityModule::class)])
    abstract fun bindAlertTaskDetailsActivity(): AlertTaskDetailsActivity


    @ContributesAndroidInjector(modules = [(UserProfileActivityModule::class), UserPortfulioItemsFragmentProvider::class])
    abstract fun bindUserProfileActivity(): UserProfileActivity

    @ContributesAndroidInjector(modules = [(EditUserProfileActivityModule::class)])
    abstract fun bindEditUserProfileActivity(): EditUserProfileActivity


    @ContributesAndroidInjector(modules = [(EditUserSkillActivityModule::class)])
    abstract fun bindEditUserSkillActivity(): EditUserSkillActivity

    @ContributesAndroidInjector(modules = [(NotificationSettingsActivityModule::class)])
    abstract fun bindNotificationSettingsActivity(): NotificationSettingsActivity

    @ContributesAndroidInjector(modules = [(NotificationSettingsDetailsActivityModule::class)])
    abstract fun bindNotificationSettingsDetailsActivity(): NotificationSettingsDetailsActivity

    @ContributesAndroidInjector(modules = [(UserReviewListActivityModule::class)])
    abstract fun bindNotificationUserReviewListActivity(): UserReviewListActivity

    @ContributesAndroidInjector(modules = [(PaymentSettingsActivityModule::class), (MakePaymentsFragmentProvider::class), (ReceivePaymentsFragmentProvider::class)])
    abstract fun bindPaymentSettingsActivity(): PaymentSettingsActivity

    @ContributesAndroidInjector(modules = [(AddBankAccountActivityModule::class)])
    abstract fun bindAddBankAccountActivity(): AddBankAccountActivity

    @ContributesAndroidInjector(modules = [(AddCreditCardActivityModule::class)])
    abstract fun bindAddCreditCardActivity(): AddCreditCardActivity

    @ContributesAndroidInjector(modules = [(AddShohokariCardActivityModule::class)])
    abstract fun bindAddShohokariCardActivity(): AddShohokariCardActivity

    @ContributesAndroidInjector(modules = [(AddBillingAddressActivityModule::class)])
    abstract fun bindAddBillingAddressActivity(): AddBillingAddressActivity

    @ContributesAndroidInjector(modules = [(PaymentHistoryActivityModule::class), (PaymentsEarnedFragmentProvider::class), (PaymentsOutgoingFragmentProvider::class)])
    abstract fun bindPaymentHistoryActivity(): PaymentHistoryActivity


    @ContributesAndroidInjector(modules = [(MakeOfferActivityModule::class)])
    abstract fun bindMakeOfferActivity(): MakeOfferActivity

    @ContributesAndroidInjector(modules = [(ChatActivityModule::class)])
    abstract fun bindChatActivity(): ChatActivity

    @ContributesAndroidInjector(modules = [(IntroductionActivityModule::class)])
    abstract fun bindIntroductionActivity(): IntroductionActivity


    @ContributesAndroidInjector(modules = [(SignUpActivityModule::class)])
    abstract fun bindSignUpActivity(): SignUpActivity

    @ContributesAndroidInjector(modules = [(CreateProfileActivityModule::class)])
    abstract fun bindCreateProfileActivity(): CreateProfileActivity

    @ContributesAndroidInjector(modules = [(OnBoardingActivityModule::class)])
    abstract fun bindOnBoardingActivity(): OnBoardingActivity

    @ContributesAndroidInjector(modules = [(SettingsActivityModule::class)])
    abstract fun bindSettingsActivity(): SettingsActivity

    @ContributesAndroidInjector(modules = [(ChangePasswordActivityModule::class)])
    abstract fun bindChangePasswordActivity(): ChangePasswordActivity

    @ContributesAndroidInjector(modules = [(UserNotificationListActivityModule::class)])
    abstract fun bindUserNotificationListActivity(): UserNotificationListActivity

    @ContributesAndroidInjector(modules = [(MobileVerificationActivityModule::class)])
    abstract fun bindMobileVerificationActivityActivity(): MobileVerificationActivity

    @ContributesAndroidInjector(modules = [(ReportTaskActivityModule::class)])
    abstract fun bindReportTaskActivity(): ReportTaskActivity


    @ContributesAndroidInjector(modules = [(TaskAttachmentActivityModule::class)])
    abstract fun bindTaskAttachmentActivity(): TaskAttachmentActivity

    @ContributesAndroidInjector(modules = [(DashboardActivityModule::class), (DashboardStatsFragmentProvider::class), (DashboardNotificationsFragmentProvider::class)])
    abstract fun bindDashboardActivityActivity(): DashboardActivity


    @ContributesAndroidInjector(modules = [(BrowseTasksFilterActivityModule::class)])
    abstract fun bindBrowseTaskFilterActivity(): BrowseTasksFilterActivity


    @ContributesAndroidInjector(modules = [(SignInSignUpWithMobileActivityModule::class)])
    abstract fun bindSignInSignUpWithMobileActivity(): SignInSignUpWithMobileActivity

    @ContributesAndroidInjector(modules = [(ViewOffersActivityModule::class)])
    abstract fun bindViewOffersActivity(): ViewOffersActivity

    @ContributesAndroidInjector(modules = [(OfferAcceptedConfirmationActivityModule::class)])
    abstract fun bindOfferAcceptedConfirmationActivity(): OfferAcceptedConfirmationActivity


    @ContributesAndroidInjector(modules = [(ReleasePaymentActivityModule::class)])
    abstract fun bindReleasePaymentActivity(): ReleasePaymentActivity

    @ContributesAndroidInjector(modules = [(LeaveReviewActivityModule::class)])
    abstract fun bindLeaveReviewActivity(): LeaveReviewActivity

    @ContributesAndroidInjector(modules = [(PublicChatActivityModule::class)])
    abstract fun bindPublicChatActivity(): PublicChatActivity

    @ContributesAndroidInjector(modules = [(CommentsActivityModule::class)])
    abstract fun bindCommentsActivity(): CommentsActivity

    @ContributesAndroidInjector(modules = [(OfferConversationActivityModule::class)])
    abstract fun bindOfferConversationActivity(): OfferConversationActivity

    @ContributesAndroidInjector(modules = [(TaskLocationActivityModule::class)])
    abstract fun bindTaskLocationActivity(): TaskLocationActivity

    @ContributesAndroidInjector(modules = [(AllReviewsActivityModule::class)])
    abstract fun bindAllReviewsActivity(): AllReviewsActivity

    @ContributesAndroidInjector(modules = [(ConfirmOfferActivityModule::class)])
    abstract fun bindConfirmOfferActivity(): ConfirmOfferActivity

    @ContributesAndroidInjector(modules = [(FundedPaymentActivityModule::class)])
    abstract fun bindFundedPaymentActivity(): FundedPaymentActivity

    @ContributesAndroidInjector(modules = [(ReceivedPaymentActivityModule::class)])
    abstract fun bindReceivedPaymentActivity(): ReceivedPaymentActivity

    @ContributesAndroidInjector(modules = [(TaskPostCompletedActivityModule::class)])
    abstract fun bindTaskPostCompletedActivity(): TaskPostCompletedActivity

    @ContributesAndroidInjector(modules = [(RequestPaymentActivityModule::class)])
    abstract fun bindRequestPaymentActivity(): RequestPaymentActivity

    @ContributesAndroidInjector(modules = [(TaskNotificationActivityModule::class)])
    abstract fun bindTaskNotificationActivity(): TaskNotificationActivity

    @ContributesAndroidInjector(modules = [(HelpActivityModule::class)])
    abstract fun bindHelpActivity(): HelpActivity

    @ContributesAndroidInjector(modules = [(TermsAndConditionsActivityModule::class)])
    abstract fun bindTermsAndConditionsActivity(): TermsAndConditionsActivity

    @ContributesAndroidInjector(modules = [(SupportActivityModule::class)])
    abstract fun bindSupportActivity(): SupportActivity

    @ContributesAndroidInjector(modules = [(ContactUsActivityModule::class)])
    abstract fun bindContactUsActivity(): ContactUsActivity

    @ContributesAndroidInjector(modules = [(MobilePaymentActivityModule::class)])
    abstract fun bindMobilePaymentActivity(): MobilePaymentActivity

    @ContributesAndroidInjector(modules = [(FullscreenImageActivityModule::class)])
    abstract fun bindFullscreenImageActivity(): FullscreenImageActivity

}