package com.example.redoyahmed.hmsapp.data.preferences

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.example.redoyahmed.hmsapp.data.network.ApiHeader
import com.example.redoyahmed.hmsapp.di.PreferenceInfo
import com.example.redoyahmed.hmsapp.util.AppConstants
import javax.inject.Inject

class AppPreferenceHelper @Inject constructor(context: Context,
                                              @PreferenceInfo private val prefFileName: String) : PreferenceHelper {
    companion object {
        private val PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE"
        private val PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID"
        private val PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"
        private val PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME"
        private val PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL"
        private val PREF_KEY_CURRENT_USER_EMAIL_VERIFIED = "PREF_KEY_CURRENT_USER_EMAIL_VERIFIED"
        private val PREF_KEY_ACCESS_COOKIE = "PREF_KEY_ACCESS_COOKIE"

        private val PREF_KEY_CURRENT_USER_PASSWORD = "PREF_KEY_CURRENT_USER_PASSWORD"
        private val PREF_KEY_CURRENT_USER_REGION = "PREF_KEY_CURRENT_USER_REGION"
     //   private val PREF_KEY_CURRENT_USER_HOME = "PREF_KEY_CURRENT_USER_HOME"
        private val PREF_KEY_CURRENT_USER_IS_POST_TASK = "PREF_KEY_CURRENT_USER_IS_POST_TASK"
        private val PREF_KEY_CURRENT_USER_IS_COMPLETE_TASK = "PREF_KEY_CURRENT_USER_IS_COMPLETE_TASK"


        private val PREF_KEY_FIRST_NAME = "PREF_KEY_FIRST_NAME"
        private val PREF_KEY_LAST_NAME = "PREF_KEY_LAST_NAME"
        private val PREF_KEY_BRIEF_BIO = "PREF_KEY_BRIEF_BIO"
        private val PREF_KEY_HEADLINE = "PREF_KEY_HEADLINE"
        private val PREF_KEY_MOBILE_NUMBER = "PREF_KEY_MOBILE_NUMBER"
        private val PREF_KEY_IS_MOBILE_NUMBER_VERIFIED = "PREF_KEY_IS_MOBILE_NUMBER_VERIFIED"
        private val PREF_KEY_DATE_OF_BIRTH = "PREF_KEY_DATE_OF_BIRTH"
        private val PREF_KEY_ADDRESS = "PREF_KEY_ADDRESS"
        private val PREF_KEY_NID_NUMBER = "PREF_KEY_NID_NUMBER"
        private val PREF_KEY_IS_NID_NUMBER_VERIFIED = "PREF_KEY_IS_NID_NUMBER_VERIFIED"

        private val PREF_KEY_BILLING_ADDRESS = "PREF_KEY_BILLING_ADDRESS"
        private val PREF_KEY_BANK_ACCOUNT = "PREF_KEY_BANK_ACCOUNT"

        private val PREF_KEY_IS_TRANSACTIONAL_EMAIL = "PREF_KEY_IS_TRANSACTIONAL_EMAIL"
        private val PREF_KEY_IS_TRANSACTIONAL_NOTIFICATION = "PREF_KEY_IS_TRANSACTIONAL_NOTIFICATION"
        private val PREF_KEY_IS_TRANSACTIONAL_SMS = "PREF_KEY_IS_TRANSACTIONAL_SMS"


        private val PREF_KEY_PROFILE_IMAGE_URL = "PREF_KEY_PROFILE_IMAGE_URL"
        private val PREF_KEY_PROFILE_IMAGE_ID = "PREF_KEY_PROFILE_IMAGE_ID"
        private val PREF_KEY_COVER_IMAGE_URL = "PREF_KEY_COVER_IMAGE_URL"
        private val PREF_KEY_COVER_IMAGE_ID = "PREF_KEY_COVER_IMAGE_ID"
        private val PREF_KEY_STANFORD_WORKPLACE_URL = "PREF_KEY_STANFORD_WORKPLACE_URL"
        private val PREF_KEY_REFERENCE_ID = "PREF_KEY_REFERENCE_ID"
        private val PREF_KEY_REFERENCE_TYPE = "PREF_KEY_REFERENCE_TYPE"
        private val PREF_KEY_REMARKS = "PREF_KEY_REMARKS"
        private val PREF_KEY_LOCATIONS = "PREF_KEY_LOCATIONS"
        private val PREF_KEY_COHORT = "PREF_KEY_COHORT"
        private val PREF_KEY_COMMUNITY_ID = "PREF_KEY_COMMUNITY_ID"
        private val PREF_KEY_USER_PROFILE_URL = "PREF_KEY_USER_PROFILE_URL"
        private val PREF_KEY_FCMTOKEN = "FCM_TOKEN"
        private val PREF_KEY_USER_DATE_JOINED = "PREF_KEY_USER_DATE_JOINED"


        private val PREF_KEY_SETTING_AUDIO = "PREF_KEY_SETTING_AUDIO"

        private val PREF_KEY_APPLICATION_LOCALE = "PREF_KEY_APPLICATION_LOCALE"

        private val PREF_KEY_BROWSE_TASK_FILTER_IS_PERSON = "PREF_KEY_BROWSE_TASK_FILTER_IS_PERSON"
        private val PREF_KEY_BROWSE_TASK_FILTER_IS_REMOTE = "PREF_KEY_BROWSE_TASK_FILTER_IS_REMOTE"
        private val PREF_KEY_BROWSE_TASK_FILTER_IS_ALL = "PREF_KEY_BROWSE_TASK_FILTER_IS_ALL"
        private val PREF_KEY_BROWSE_TASK_FILTER_IS_DISTANCE = "PREF_KEY_BROWSE_TASK_FILTER_IS_DISTANCE"
        private val PREF_KEY_BROWSE_TASK_FILTER_FROM_PRICE = "PREF_KEY_BROWSE_TASK_FILTER_FROM_PRICE"
        private val PREF_KEY_BROWSE_TASK_FILTER_TO_PRICE = "PREF_KEY_BROWSE_TASK_FILTER_TO_PRICE"

        private val PREF_KEY_USER_ADDRESS_LATITUDE = "PREF_KEY_USER_ADDRESS_LATITUDE"
        private val PREF_KEY_USER_ADDRESS_LONGITUDE = "PREF_KEY_USER_ADDRESS_LONGITUDE"

        private val PREF_KEY_USER_UNREAD_NOTIFICATION = "PREF_KEY_USER_UNREAD_NOTIFICATION"


    }

    private val mPrefs: SharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    override fun getCurrentUserLoggedInMode() = mPrefs.getInt(PREF_KEY_USER_LOGGED_IN_MODE, AppConstants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.type)

    override fun getCurrentUserName(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_NAME, "")

    override fun setCurrentUserName(userName: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_NAME, userName) }

    override fun getCurrentUserEmail(): String? = mPrefs.getString(PREF_KEY_CURRENT_USER_EMAIL, "")

    override fun setCurrentUserEmail(email: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_EMAIL, email) }

    override fun setCurrentUserIsEmailVerified(IsUserEmailVerified: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_CURRENT_USER_EMAIL_VERIFIED, IsUserEmailVerified) }

    override fun getCurrentUserIsEmailVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_CURRENT_USER_EMAIL_VERIFIED, false)

    override fun getAccessToken(): String? = mPrefs.getString(PREF_KEY_ACCESS_TOKEN, "")

    override fun setAccessToken(accessToken: String?) = mPrefs.edit { putString(PREF_KEY_ACCESS_TOKEN, accessToken) }

    override fun getCurrentUserId(): Long? {
        val userId = mPrefs.getLong(PREF_KEY_CURRENT_USER_ID, AppConstants.NULL_INDEX)
        return when (userId) {
            AppConstants.NULL_INDEX -> null
            else -> userId
        }
    }

    override fun setCurrentUserId(userId: Long?) {
        val id = userId ?: AppConstants.NULL_INDEX
        mPrefs.edit { putLong(PREF_KEY_CURRENT_USER_ID, id) }
    }

    override fun setCurrentUserLoggedInMode(mode: AppConstants.LoggedInMode) {
        mPrefs.edit { putInt(PREF_KEY_USER_LOGGED_IN_MODE, mode.type) }
    }

    override fun setAccessCookie(cookieToken: String?) {
        ApiHeader.PrivateApiHeader(cookieKey = cookieToken)
        mPrefs.edit { putString(PREF_KEY_ACCESS_COOKIE, cookieToken) }
        //ApiHeader.PrivateApiHeader = ApiHeader.PrivateApiHeader(cookieKey = cookieToken)
    }

    override fun getAccessCookie(): String = mPrefs.getString(PREF_KEY_ACCESS_COOKIE, "")


    override fun setCurrentUserFirstName(FirstName: String?) = mPrefs.edit { putString(PREF_KEY_FIRST_NAME, FirstName) }

    override fun getCurrentUserFirstName(): String = mPrefs.getString(PREF_KEY_FIRST_NAME, "")

    override fun setCurrentUserLastName(LastName: String?) = mPrefs.edit { putString(PREF_KEY_LAST_NAME, LastName) }

    override fun getCurrentLastName(): String = mPrefs.getString(PREF_KEY_LAST_NAME, "")

    override fun setCurrentUserBriefBio(BriefBio: String?) = mPrefs.edit { putString(PREF_KEY_BRIEF_BIO, BriefBio) }

    override fun getCurrentUserBriefBio(): String = mPrefs.getString(PREF_KEY_BRIEF_BIO, "")

    override fun setCurrentUserHeadline(Headline: String?) = mPrefs.edit { putString(PREF_KEY_HEADLINE, Headline) }

    override fun getCurrentUserHeadline(): String = mPrefs.getString(PREF_KEY_HEADLINE, "")

    override fun setCurrentUserMobileNumber(MobileNumber: String?) = mPrefs.edit { putString(PREF_KEY_MOBILE_NUMBER, MobileNumber) }

    override fun getCurrentUserMobileNumber(): String = mPrefs.getString(PREF_KEY_MOBILE_NUMBER, "")

    override fun setCurrentUserIsMobileNumberVerified(IsMobileNumberVerified: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_MOBILE_NUMBER_VERIFIED, IsMobileNumberVerified) }

    override fun getCurrentUserIsMobileNumberVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_MOBILE_NUMBER_VERIFIED, false)

    override fun setCurrentUserNIDNumber(NIDNumber: Int) = mPrefs.edit { putInt(PREF_KEY_NID_NUMBER, NIDNumber) }

    override fun getCurrentUserNIDNumber(): Int = mPrefs.getInt(PREF_KEY_NID_NUMBER, 0)

    override fun setCurrentUserIsNIDNumberVerified(IsNIDNumberVerified: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_NID_NUMBER_VERIFIED, IsNIDNumberVerified) }

    override fun getCurrentUserIsNIDNumberVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_NID_NUMBER_VERIFIED, false)

    override fun setCurrentUserDateofBirth(DateofBirth: String?) = mPrefs.edit { putString(PREF_KEY_DATE_OF_BIRTH, DateofBirth) }

    override fun getCurrentDateofBirth(): String = mPrefs.getString(PREF_KEY_DATE_OF_BIRTH, "")


    override fun setCurrentUserAddress(Address: String?) = mPrefs.edit { putString(PREF_KEY_ADDRESS, Address) }

    override fun getCurrentUserAddress(): String = mPrefs.getString(PREF_KEY_ADDRESS, "")

    override fun setCurrentUserBillingAddress(BillingAddress: String?) = mPrefs.edit { putString(PREF_KEY_BILLING_ADDRESS, BillingAddress) }

    override fun getCurrentUserBillingAddress(): String = mPrefs.getString(PREF_KEY_BILLING_ADDRESS, "")

    override fun setCurrentUserBankAccount(BankAccount: Int) = mPrefs.edit { putInt(PREF_KEY_BANK_ACCOUNT, BankAccount) }

    override fun getCurrentUserBankAccount(): Int = mPrefs.getInt(PREF_KEY_BANK_ACCOUNT, 0)

    override fun setCurrentUserIsTransactionalEmail(IsTransactionalEmail: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_TRANSACTIONAL_EMAIL, IsTransactionalEmail) }

    override fun getCurrentIsTransactionalEmail(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_TRANSACTIONAL_EMAIL, false)

    override fun setCurrentUserIsTransactionalSMS(IsTransactionalSMS: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_TRANSACTIONAL_SMS, IsTransactionalSMS) }

    override fun getCurrentIsTransactionalSMS(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_TRANSACTIONAL_SMS, false)

    override fun setCurrentUserIsTransactionalNotification(IsTransactionalNotification: Boolean) = mPrefs.edit { putBoolean(AppPreferenceHelper.PREF_KEY_IS_TRANSACTIONAL_NOTIFICATION, IsTransactionalNotification) }

    override fun getCurrentIsTransactionalNotification(): Boolean = mPrefs.getBoolean(AppPreferenceHelper.PREF_KEY_IS_TRANSACTIONAL_NOTIFICATION, false)

    override fun setCurrentUserPassword(password: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_PASSWORD, password) }

    override fun getCurrentUserPassword(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_PASSWORD, "")

    override fun setCurrentUserRegion(region: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_REGION, region) }

    override fun getCurrentUserRegion(): String? = mPrefs.getString(PREF_KEY_CURRENT_USER_REGION, "")

    override fun setCurrentUserIsPostTask(postTask: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_CURRENT_USER_IS_POST_TASK, postTask) }

    override fun getCurrentUserIsPostTask(): Boolean = mPrefs.getBoolean(PREF_KEY_CURRENT_USER_IS_POST_TASK, false)

    override fun setCurrentUserIsCompleteTask(completeTask: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_CURRENT_USER_IS_COMPLETE_TASK, completeTask) }

    override fun getCurrentUserIsCompleteTask(): Boolean = mPrefs.getBoolean(PREF_KEY_CURRENT_USER_IS_COMPLETE_TASK, false)


    override fun getCurrentUserLastName(): String = mPrefs.getString(PREF_KEY_LAST_NAME, "")


    override fun setCurrentUserProfileImageURL(ProfileImageUrl: String?) = mPrefs.edit { putString(PREF_KEY_PROFILE_IMAGE_URL, ProfileImageUrl) }

    override fun getCurrentUserProfileImageURL(): String = mPrefs.getString(PREF_KEY_PROFILE_IMAGE_URL, "")

    override fun getCurrentUserProfileImageID(): Int = mPrefs.getInt(PREF_KEY_PROFILE_IMAGE_ID, 0)

    override fun setCurrentUserProfileImageID(ProfileImageId: Int) = mPrefs.edit { putInt(PREF_KEY_PROFILE_IMAGE_ID, ProfileImageId) }

    override fun getCurrentUserCoverImageURL(): String = mPrefs.getString(PREF_KEY_COVER_IMAGE_URL, "")

    override fun setCurrentUserCoverImageURL(CoverImageUrl: String?) = mPrefs.edit { putString(PREF_KEY_COVER_IMAGE_URL, CoverImageUrl) }

    override fun getCurrentUserCoverImageID(): Int = mPrefs.getInt(PREF_KEY_COVER_IMAGE_ID, 0)

    override fun setCurrentUserCoverImageID(CoverImageId: Int) = mPrefs.edit { putInt(PREF_KEY_COVER_IMAGE_ID, CoverImageId) }

    override fun getCurrentUserStanfordWorkplaceURL(): String = mPrefs.getString(PREF_KEY_STANFORD_WORKPLACE_URL, "")

    override fun setCurrentUserStanfordWorkplaceURL(StanfordWorkplaceURL: String?) = mPrefs.edit { putString(PREF_KEY_STANFORD_WORKPLACE_URL, StanfordWorkplaceURL) }

    override fun getCurrentUserReferenceID(): String = mPrefs.getString(PREF_KEY_REFERENCE_ID, "")

    override fun setCurrentUserReferenceID(ReferenceId: String?) = mPrefs.edit { putString(PREF_KEY_REFERENCE_ID, ReferenceId) }

    override fun getCurrentUserReferenceType(): String = mPrefs.getString(PREF_KEY_REFERENCE_TYPE, "")

    override fun setCurrentUserReferenceType(ReferenceType: String?) = mPrefs.edit { putString(PREF_KEY_REFERENCE_TYPE, ReferenceType) }

    override fun getCurrentUserRemarks(): String = mPrefs.getString(PREF_KEY_REMARKS, "")

    override fun setCurrentUserRemarks(Remarks: String?) = mPrefs.edit { putString(PREF_KEY_REMARKS, Remarks) }

    //override fun getCurrentUserLocations(): String = mPrefs.getString(PREF_KEY_LOCATIONS, "")

    // override fun setCurrentUserLocations(Locations: String?) = mPrefs.edit { putString(PREF_KEY_LOCATIONS, Locations) }

    override fun getCurrentUserCohort(): String = mPrefs.getString(PREF_KEY_COHORT, "")

    override fun setCurrentUserCohort(Cohort: String?) = mPrefs.edit { putString(PREF_KEY_COHORT, Cohort) }

    override fun getCurrentUserCommunityID(): String = mPrefs.getString(PREF_KEY_COMMUNITY_ID, "")

    override fun setCurrentUserCommunityID(CommunityId: String?) = mPrefs.edit { putString(PREF_KEY_COMMUNITY_ID, CommunityId) }

    override fun getCurrentUserProfileURL(): String = mPrefs.getString(PREF_KEY_USER_PROFILE_URL, "")

    override fun setCurrentUserProfileURL(ProfileUrl: String?) = mPrefs.edit { putString(PREF_KEY_USER_PROFILE_URL, ProfileUrl) }


    override fun getFCMTOKEN(): String = mPrefs.getString(PREF_KEY_FCMTOKEN, "")

    override fun setFCMToken(token: String?) = mPrefs.edit { putString(PREF_KEY_FCMTOKEN, token) }

    override fun getCurrentUserJoinedDate(): String = mPrefs.getString(PREF_KEY_USER_DATE_JOINED, "")

    override fun setCurrentUserJoinedDate(DateCreatedLocal: String?) = mPrefs.edit { putString(PREF_KEY_USER_DATE_JOINED, DateCreatedLocal) }


    override fun getSettingAudioPlay(): Boolean = mPrefs.getBoolean(PREF_KEY_SETTING_AUDIO, true)

    override fun setSettingAudioPlay(IsAudioPlay: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_SETTING_AUDIO, IsAudioPlay) }


    override fun getApplicationLanguage(): String = mPrefs.getString(PREF_KEY_APPLICATION_LOCALE, "bn")

    override fun setApplicationLanguage(local: String) = mPrefs.edit { putString(PREF_KEY_APPLICATION_LOCALE, local) }


    override fun getBrowseTaskFilterIsPerson(): Boolean = mPrefs.getBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_PERSON, false)

    override fun setBrowseTaskFilterIsPerson(IsPerson: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_PERSON, IsPerson) }

    override fun getBrowseTaskFilterIsRemote(): Boolean = mPrefs.getBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_REMOTE, false)

    override fun setBrowseTaskFilterIsRemote(IsRemote: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_REMOTE, IsRemote) }

    override fun getBrowseTaskFilterIsAll(): Boolean = mPrefs.getBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_ALL, true)

    override fun setBrowseTaskFilterIsAll(IsAll: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_ALL, IsAll) }

    override fun getBrowseTaskFilterDistance(): String = mPrefs.getString(PREF_KEY_BROWSE_TASK_FILTER_IS_DISTANCE, "1000")

    override fun setBrowseTaskFilterDistance(Distance: String) = mPrefs.edit { putString(PREF_KEY_BROWSE_TASK_FILTER_IS_DISTANCE, Distance) }

    override fun getBrowseTaskFilterFromPrice(): String = mPrefs.getString(PREF_KEY_BROWSE_TASK_FILTER_FROM_PRICE, "1")

    override fun setBrowseTaskFilterFromPrice(FromPrice: String) = mPrefs.edit { putString(PREF_KEY_BROWSE_TASK_FILTER_FROM_PRICE, FromPrice) }

    override fun getBrowseTaskFilterToPrice(): String = mPrefs.getString(PREF_KEY_BROWSE_TASK_FILTER_TO_PRICE, "100000")

    override fun setBrowseTaskFilterToPrice(ToPrice: String) = mPrefs.edit { putString(PREF_KEY_BROWSE_TASK_FILTER_TO_PRICE, ToPrice) }


    override fun getLatitude(): String = mPrefs.getString(PREF_KEY_USER_ADDRESS_LATITUDE, "")
    override fun setLatitude(Latitude: String?) = mPrefs.edit { putString(PREF_KEY_USER_ADDRESS_LATITUDE, Latitude) }
    override fun setLongitude(Longitude: String?) = mPrefs.edit { putString(PREF_KEY_USER_ADDRESS_LONGITUDE, Longitude) }
    override fun getLongitude(): String = mPrefs.getString(PREF_KEY_USER_ADDRESS_LONGITUDE, "")

    override fun setUnreadNotificationCount(UnreadNotificationCount: Int?) = mPrefs.edit {
        if (UnreadNotificationCount != null) {
            putInt(PREF_KEY_USER_UNREAD_NOTIFICATION, UnreadNotificationCount)
        }
    }

    override fun getUnreadNotificationCount(): Int = mPrefs.getInt(PREF_KEY_USER_UNREAD_NOTIFICATION, 0)

}