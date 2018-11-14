package com.example.redoyahmed.hmsapp.ui.splash.interactor

import android.content.Context
import com.example.redoyahmed.hmsapp.data.network.ApiHelper
import com.example.redoyahmed.hmsapp.data.preferences.PreferenceHelper
import com.example.redoyahmed.hmsapp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

class SplashInteractor @Inject constructor(private val mContext: Context, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), SplashMVPInteractor{

    override fun isUserLoggedIn(): Boolean =
        preferenceHelper.let {
            return it.getCurrentUserLggedIn()
        }
}