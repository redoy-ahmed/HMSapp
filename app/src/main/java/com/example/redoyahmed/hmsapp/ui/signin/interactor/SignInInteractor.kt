package com.example.redoyahmed.hmsapp.ui.signin.interactor

import com.example.redoyahmed.hmsapp.data.network.ApiHelper
import com.example.redoyahmed.hmsapp.data.network.LoginRequest
import com.example.redoyahmed.hmsapp.data.network.LoginResponse
import com.example.redoyahmed.hmsapp.data.preferences.PreferenceHelper
import com.example.redoyahmed.hmsapp.ui.base.interactor.BaseInteractor
import com.example.redoyahmed.hmsapp.util.AppConstants
import javax.inject.Inject

class SignInInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), SignInMVPInteractor {

    override fun serverSignInApiCall(email: String, password: String) =
        apiHelper.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))

    override fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) =

        preferenceHelper.let {
            it.setCurrentUserId(loginResponse.responseData?.user?.Id)
            it.setAccessToken(loginResponse.accessToken)
            it.setCurrentUserLoggedInMode(loggedInMode)
            it.setCurrentUserFirstName(loginResponse.responseData?.user?.FirstName)
            it.setCurrentUserLastName(loginResponse.responseData?.user?.LastName)
            it.setCurrentUserName(loginResponse.responseData?.user?.Name)
            it.setCurrentUserEmail(loginResponse.responseData?.user?.Email)
            it.setCurrentUserProfileImageURL(loginResponse.responseData?.user?.ProfileImageUrl)
            it.setCurrentUserProfileImageID(loginResponse.responseData?.user?.ProfileImageId!!)
            it.setCurrentUserCoverImageURL(loginResponse.responseData?.user?.CoverImageUrl)
            it.setCurrentUserCoverImageID(loginResponse.responseData?.user?.CoverImageId!!)
            it.setCurrentUserStanfordWorkplaceURL(loginResponse.responseData?.user?.StanfordWorkplaceURL)
            it.setCurrentUserHeadline(loginResponse.responseData?.user?.Headline)
            it.setCurrentUserBriefBio(loginResponse.responseData?.user?.BriefBio)
            it.setCurrentUserReferenceID(loginResponse.responseData?.user?.ReferenceId)
            it.setCurrentUserReferenceType(loginResponse.responseData?.user?.ReferenceType)
            it.setCurrentUserCohort(loginResponse.responseData?.user?.Cohort)
            it.setCurrentUserCommunityID(loginResponse.responseData?.user?.CommunityId)
            it.setCurrentUserMobileNumber(loginResponse.responseData?.user?.MobileNumber)
            it.setCurrentUserIsMobileNumberVerified(loginResponse.responseData!!.user?.IsMobileNumberVerified!!)
            it.setCurrentUserDateofBirth(loginResponse.responseData?.user?.DateofBirth)
            it.setCurrentUserProfileURL(loginResponse.responseData?.user?.UserProfileUrl)
            it.setCurrentUserAddress(loginResponse.responseData?.user?.Address)
            it.setCurrentUserBillingAddress("")
            it.setCurrentUserBankAccount(loginResponse.responseData?.user?.BankVerifiedStatus!!)
            it.setCurrentUserJoinedDate(loginResponse.responseData?.user?.DateCreatedLocal)
            it.setLatitude(loginResponse.responseData?.user?.Latitude)
            it.setLongitude(loginResponse.responseData?.user?.Longitude)
            it.setUnreadNotificationCount(loginResponse.responseData?.user?.UnreadNotificationCount)
            it.setCurrentUserIsEmailVerified(loginResponse.responseData?.user?.IsEmailVerified!!)
            it.setCurrentUserNIDNumber(loginResponse.responseData?.user?.NationalIDVerifiedStatus!!)
        }
}


