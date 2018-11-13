package com.example.redoyahmed.hmsapp.ui.signin.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.MVPPresenter
import com.example.redoyahmed.hmsapp.ui.signin.interactor.SignInMVPInteractor
import com.example.redoyahmed.hmsapp.ui.signin.view.SignInMVPView

interface SignInMVPPresenter<V : SignInMVPView, I : SignInMVPInteractor> : MVPPresenter<V, I> {

    fun onServerSignInClicked(email: String, password: String)
}