package com.example.redoyahmed.hmsapp.ui.signup.view

import com.example.redoyahmed.hmsapp.ui.base.view.MVPView

interface SignUpMVPView : MVPView {

    fun showValidationMessage(errorCode: Int)
    fun showServerMessage(message: String)
    fun openCreateProfileActivity()
}