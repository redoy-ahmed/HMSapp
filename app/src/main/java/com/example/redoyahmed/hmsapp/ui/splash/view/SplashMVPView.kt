package com.example.redoyahmed.hmsapp.ui.splash.view

import com.example.redoyahmed.hmsapp.ui.base.view.MVPView

interface SplashMVPView : MVPView {
    fun showSuccessToast()
    fun showErrorToast()
    fun openMainActivity()
    fun openLoginSignUpActivity()
}