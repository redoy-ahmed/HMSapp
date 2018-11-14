package com.example.redoyahmed.hmsapp.ui.signin.interactor

import com.example.redoyahmed.hmsapp.data.network.SignInResponse
import com.example.redoyahmed.hmsapp.ui.base.interactor.MVPInteractor
import com.example.redoyahmed.hmsapp.util.AppConstants
import io.reactivex.Observable

interface SignInMVPInteractor : MVPInteractor {

    fun serverSignInApiCall(email: String, password: String): Observable<SignInResponse>
    fun updateUserInSharedPref(signInResponse: SignInResponse, loggedInMode: AppConstants.LoggedInMode)
}