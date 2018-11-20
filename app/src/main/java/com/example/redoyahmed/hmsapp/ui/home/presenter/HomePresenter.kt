package com.example.redoyahmed.hmsapp.ui.home.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.BasePresenter
import com.example.redoyahmed.hmsapp.ui.home.interactor.HomeMVPInteractor
import com.example.redoyahmed.hmsapp.ui.home.view.HomeMVPView
import com.example.redoyahmed.hmsapp.util.AppConstants
import com.example.redoyahmed.hmsapp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class HomePresenter<V : HomeMVPView, I : HomeMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), HomeMVPPresenter<V, I> {

    override fun getHomeInfo() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.getHomeInfoApiCall()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ homeInfoResponse ->
                    getView()?.hideProgress()
                    if (homeInfoResponse.responseData?.home != null) {
                        getView()?.loadGeneralInfo(homeInfoResponse.responseData?.home!!)
                    }
                }, { err ->
                    getView()?.hideProgress()
                })
            )
        }
    }
}