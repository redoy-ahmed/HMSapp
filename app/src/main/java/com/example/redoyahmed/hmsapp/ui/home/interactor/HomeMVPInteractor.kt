package com.example.redoyahmed.hmsapp.ui.home.interactor

import com.example.redoyahmed.hmsapp.data.network.HomeInfoResponse
import com.example.redoyahmed.hmsapp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

interface HomeMVPInteractor : MVPInteractor {

    fun getHomeInfoApiCall(): Observable<HomeInfoResponse>
}