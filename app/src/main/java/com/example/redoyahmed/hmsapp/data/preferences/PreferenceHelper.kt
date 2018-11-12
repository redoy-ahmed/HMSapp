package com.example.redoyahmed.hmsapp.data.preferences

import com.example.redoyahmed.hmsapp.util.AppConstants

interface PreferenceHelper {

    fun getCurrentUserLoggedInMode(): Int

    fun setCurrentUserLoggedInMode(mode: AppConstants.LoggedInMode)

    fun getCurrentUserId(): Long?

    fun setCurrentUserId(userId: Long?)

    fun getCurrentUserName(): String

    fun setCurrentUserName(userName: String?)

    fun getCurrentUserEmail(): String?

    fun setCurrentUserEmail(email: String?)

    fun setCurrentUserIsEmailVerified(IsEmailVerified: Boolean)

    fun getCurrentUserIsEmailVerified(): Boolean

    fun setCurrentUserPassword(password: String?)

    fun getCurrentUserPassword(): String?

    fun setCurrentUserRegion(region: String?)

    fun getCurrentUserRegion(): String?

    fun setCurrentUserIsPostTask(postTask: Boolean)

    fun getCurrentUserIsPostTask(): Boolean

    fun setCurrentUserIsCompleteTask(compleeteTask: Boolean)

    fun getCurrentUserIsCompleteTask(): Boolean

//    fun setCurrentUserHome(home: String?)
//
//    fun getCurrentUserHome(): String?

    fun getAccessToken(): String?

    fun setAccessToken(accessToken: String?)


    fun getAccessCookie(): String?
    fun setAccessCookie(cookieToken: String?)



    fun setCurrentUserFirstName(FirstName: String?)

    fun getCurrentUserFirstName(): String

    fun setCurrentUserLastName(LastName: String?)

    fun getCurrentLastName(): String

    fun setCurrentUserBriefBio(BriefBio: String?)

    fun getCurrentUserBriefBio(): String

    fun setCurrentUserHeadline(Headline: String?)

    fun getCurrentUserHeadline(): String

    fun setCurrentUserMobileNumber(MobileNumber: String?)

    fun getCurrentUserMobileNumber(): String

    fun setCurrentUserIsMobileNumberVerified(IsMobileNumberVerified: Boolean)

    fun getCurrentUserIsMobileNumberVerified(): Boolean

    fun setCurrentUserNIDNumber(NIDNumber: Int)

    fun getCurrentUserNIDNumber(): Int

    fun setCurrentUserIsNIDNumberVerified(IsNIDNumberVerified: Boolean)

    fun getCurrentUserIsNIDNumberVerified(): Boolean

    fun setCurrentUserDateofBirth(DateofBirth: String?)

    fun getCurrentDateofBirth(): String

    fun setCurrentUserAddress(Address: String?)

    fun getCurrentUserAddress(): String

    fun setCurrentUserBillingAddress(BillingAddress: String?)

    fun getCurrentUserBillingAddress(): String

    fun setCurrentUserBankAccount(BankAccount: Int)

    fun getCurrentUserBankAccount(): Int

    fun setCurrentUserIsTransactionalEmail(IsTransactionalEmail: Boolean)

    fun getCurrentIsTransactionalEmail(): Boolean

    fun setCurrentUserIsTransactionalSMS(IsTransactionalSMS: Boolean)

    fun getCurrentIsTransactionalSMS(): Boolean

    fun setCurrentUserIsTransactionalNotification(IsTransactionalNotification: Boolean)

    fun getCurrentIsTransactionalNotification(): Boolean





    fun getCurrentUserLastName(): String




    fun getCurrentUserProfileImageURL(): String

    fun setCurrentUserProfileImageURL(ProfileImageUrl: String?)

    fun getCurrentUserProfileImageID(): Int

    fun setCurrentUserProfileImageID(ProfileImageId: Int)

    fun getCurrentUserCoverImageURL(): String

    fun setCurrentUserCoverImageURL(CoverImageUrl: String?)

    fun getCurrentUserCoverImageID(): Int

    fun setCurrentUserCoverImageID(CoverImageId: Int)

    fun getCurrentUserStanfordWorkplaceURL(): String

    fun setCurrentUserStanfordWorkplaceURL(StanfordWorkplaceURL: String?)

    fun getCurrentUserReferenceID(): String

    fun setCurrentUserReferenceID(ReferenceId: String?)

    fun getCurrentUserReferenceType(): String

    fun setCurrentUserReferenceType(ReferenceType: String?)

    fun getCurrentUserRemarks(): String

    fun setCurrentUserRemarks(Remarks: String?)

//    fun getCurrentUserLocations(): String
//
//    fun setCurrentUserLocations(Locations: String?)

    fun getCurrentUserCohort(): String

    fun setCurrentUserCohort(Cohort: String?)

    fun getCurrentUserCommunityID(): String

    fun setCurrentUserCommunityID(CommunityId: String?)

    fun getCurrentUserProfileURL(): String

    fun setCurrentUserProfileURL(ProfileUrl: String?)


    fun getFCMTOKEN(): String

    fun setFCMToken(token: String?)

    fun getCurrentUserJoinedDate(): String
    fun setCurrentUserJoinedDate(DateCreatedLocal: String?)



    fun getSettingAudioPlay(): Boolean
    fun setSettingAudioPlay(IsAudioPlay:Boolean)


    fun getApplicationLanguage(): String
    fun setApplicationLanguage(local:String)

    fun getBrowseTaskFilterIsPerson(): Boolean
    fun setBrowseTaskFilterIsPerson(IsPerson:Boolean)

    fun getBrowseTaskFilterIsRemote(): Boolean
    fun setBrowseTaskFilterIsRemote(IsRemote:Boolean)

    fun getBrowseTaskFilterIsAll(): Boolean
    fun setBrowseTaskFilterIsAll(IsAll:Boolean)

    fun getBrowseTaskFilterDistance(): String
    fun setBrowseTaskFilterDistance(Distance:String)

    fun getBrowseTaskFilterFromPrice(): String
    fun setBrowseTaskFilterFromPrice(FromPrice:String)

    fun getBrowseTaskFilterToPrice(): String
    fun setBrowseTaskFilterToPrice(ToPrice:String)

    fun getLatitude(): String
    fun setLatitude(Latitude: String?)
    fun setLongitude(Longitude:String?)
    fun getLongitude(): String


    fun setUnreadNotificationCount(UnreadNotificationCount:Int?)
    fun getUnreadNotificationCount(): Int

}