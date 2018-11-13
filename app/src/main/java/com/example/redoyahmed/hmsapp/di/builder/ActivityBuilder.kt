package com.example.redoyahmed.hmsapp.di.builder

import com.example.redoyahmed.hmsapp.ui.signin.SignInActivityModule
import com.example.redoyahmed.hmsapp.ui.signin.view.SignInActivity
import com.example.redoyahmed.hmsapp.ui.signup.SignUpActivityModule
import com.example.redoyahmed.hmsapp.ui.signup.view.SignUpActivity
import com.example.redoyahmed.hmsapp.ui.splash.SplashActivityModule
import com.example.redoyahmed.hmsapp.ui.splash.view.SplashMVPActivity

import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(SplashActivityModule::class)])
    abstract fun bindSplashActivity(): SplashMVPActivity

    @ContributesAndroidInjector(modules = [(SignInActivityModule::class)])
    abstract fun bindSignInActivity(): SignInActivity

    @ContributesAndroidInjector(modules = [(SignUpActivityModule::class)])
    abstract fun bindSignUpActivity(): SignUpActivity

    /*@ContributesAndroidInjector(modules = [(MainActivityModule::class), (RateUsDialogFragmentProvider::class), (TaskFragmentProvider::class), (BrowseTaskFragmentProvider::class), (MyTaskFragmentProvider::class), (MessageFragmentProvider::class), (MoreFragmentProvider::class), (MyTaskListFragmentProvider::class)])
    abstract fun bindMainActivity(): MainActivity

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
    abstract fun bindFullscreenImageActivity(): FullscreenImageActivity*/

}