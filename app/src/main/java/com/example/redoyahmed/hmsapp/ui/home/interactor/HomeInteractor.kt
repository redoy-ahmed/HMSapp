package com.example.redoyahmed.hmsapp.ui.home.interactor

import com.example.redoyahmed.hmsapp.data.network.ApiHelper
import com.example.redoyahmed.hmsapp.data.preferences.PreferenceHelper
import com.example.redoyahmed.hmsapp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

class HomeInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), HomeMVPInteractor {


}