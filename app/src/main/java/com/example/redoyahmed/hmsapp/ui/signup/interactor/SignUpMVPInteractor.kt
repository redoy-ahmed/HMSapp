package com.example.redoyahmed.hmsapp.ui.signup.interactor


import com.example.redoyahmed.hmsapp.data.network.SignUpResponse
import com.example.redoyahmed.hmsapp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

interface SignUpMVPInteractor : MVPInteractor {

    fun doServerSignUpApiCall(email: String, password: String): Observable<SignUpResponse>

    fun updateUserInSharedPref(UserId: Long, email: String, password: String)
}