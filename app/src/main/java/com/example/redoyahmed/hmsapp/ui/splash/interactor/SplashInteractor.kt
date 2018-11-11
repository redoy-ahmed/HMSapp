package com.example.redoyahmed.hmsapp.ui.splash.interactor

import android.content.Context
import com.example.redoyahmed.hmsapp.ui.base.interactor.BaseInteractor
import com.shohokari.data.network.ApiHelper
import com.shohokari.data.preferences.PreferenceHelper
import javax.inject.Inject

class SplashInteractor @Inject constructor(private val mContext: Context, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), SplashMVPInteractor