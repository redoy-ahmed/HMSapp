package com.example.redoyahmed.hmsapp.ui.signup.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.MVPPresenter
import com.example.redoyahmed.hmsapp.ui.signup.interactor.SignUpMVPInteractor
import com.example.redoyahmed.hmsapp.ui.signup.view.SignUpMVPView


interface SignUpMVPPresenter<V : SignUpMVPView, I : SignUpMVPInteractor> : MVPPresenter<V, I> {

    fun onSignUpButtonClicked(email: String, password: String)
}