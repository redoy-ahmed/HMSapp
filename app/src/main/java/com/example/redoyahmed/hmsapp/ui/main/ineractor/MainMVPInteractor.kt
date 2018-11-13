package com.example.redoyahmed.hmsapp.ui.main.ineractor

import com.example.redoyahmed.hmsapp.data.network.LogoutResponse
import com.example.redoyahmed.hmsapp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

interface MainMVPInteractor : MVPInteractor {

    fun getUserDetails() : Pair<String?,String?>
    fun makeLogoutApiCall() : Observable<LogoutResponse>
}