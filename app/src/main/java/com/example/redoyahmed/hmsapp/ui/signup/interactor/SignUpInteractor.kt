package com.example.redoyahmed.hmsapp.ui.signup.interactor

import com.example.redoyahmed.hmsapp.data.network.ApiHelper
import com.example.redoyahmed.hmsapp.data.network.SignUpRequest
import com.example.redoyahmed.hmsapp.data.preferences.PreferenceHelper
import com.example.redoyahmed.hmsapp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

class SignUpInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper),
    SignUpMVPInteractor {

    override fun doServerSignUpApiCall(email: String, password: String) =
            apiHelper.performServerSignUp(SignUpRequest.ServerSignUpRequest(email, password, password, "", "", "True", 0, "", "", "", "", "", "", "", ""))

    override fun updateUserInSharedPref(UserId: Long, email: String, password: String) =
            preferenceHelper.let {
                it.setCurrentUserId(UserId)
                it.setCurrentUserEmail(email)
                it.setCurrentUserPassword(password)
            }
}