package com.example.redoyahmed.hmsapp.ui.base.interactor

import com.example.redoyahmed.hmsapp.data.network.ApiHelper
import com.example.redoyahmed.hmsapp.data.preferences.PreferenceHelper
import com.example.redoyahmed.hmsapp.util.AppConstants

open class BaseInteractor() : MVPInteractor {

    protected lateinit var preferenceHelper: PreferenceHelper
    protected lateinit var apiHelper: ApiHelper

    constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : this() {
        this.preferenceHelper = preferenceHelper
        this.apiHelper = apiHelper

    }

    override fun performUserLogout() = preferenceHelper.let {
        it.setCurrentUserID(null)
        it.setCurrentUserAccessToken(null)
        it.setCurrentUserName(null)
    }
}