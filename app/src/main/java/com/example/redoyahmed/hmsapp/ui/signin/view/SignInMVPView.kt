package com.example.redoyahmed.hmsapp.ui.signin.view

import com.example.redoyahmed.hmsapp.ui.base.view.MVPView

interface SignInMVPView : MVPView {

    fun showValidationMessage(errorCode: Int)
    fun openMainActivity()
    fun showLogInErrors(erros: String)
}