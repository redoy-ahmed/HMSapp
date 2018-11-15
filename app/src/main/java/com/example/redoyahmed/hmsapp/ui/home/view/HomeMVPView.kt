package com.example.redoyahmed.hmsapp.ui.home.view

import com.example.redoyahmed.hmsapp.ui.base.view.MVPView

interface HomeMVPView : MVPView {

    fun showValidationMessage(errorCode: Int)
    fun showDashboardDataToView(category : String)
}