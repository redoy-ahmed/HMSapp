package com.example.redoyahmed.hmsapp.ui.signin.interactor

import com.example.redoyahmed.hmsapp.data.network.ApiHelper
import com.example.redoyahmed.hmsapp.data.network.SignInRequest
import com.example.redoyahmed.hmsapp.data.network.SignInResponse
import com.example.redoyahmed.hmsapp.data.preferences.PreferenceHelper
import com.example.redoyahmed.hmsapp.ui.base.interactor.BaseInteractor
import com.example.redoyahmed.hmsapp.util.AppConstants
import javax.inject.Inject

class SignInInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), SignInMVPInteractor {

    override fun serverSignInApiCall(email: String, password: String) =
        apiHelper.performServerLogin(SignInRequest.ServerLoginRequest(email = email, password = password))

    override fun updateUserInSharedPref(signInResponse: SignInResponse, loggedInMode: AppConstants.LoggedInMode) =
        preferenceHelper.let {
            it.setCurrentUserID(signInResponse.responseData?.user?.userId)
            it.setCurrentUserMobileNumber(signInResponse.responseData?.user?.Mobile)
            it.setCurrentUserName(signInResponse.responseData?.user?.Email)
            it.setCurrentUserPassword(signInResponse.responseData?.user?.Password)
            it.setCurrentUserAddress(signInResponse.responseData?.user?.Address)
            it.setCurrentUserGender(signInResponse.responseData?.user?.Gender)
            it.setCurrentUserAccessToken(signInResponse.responseData?.user?.Token)
        }
}


