package com.example.redoyahmed.hmsapp.ui.home.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.BasePresenter
import com.example.redoyahmed.hmsapp.ui.home.interactor.HomeMVPInteractor
import com.example.redoyahmed.hmsapp.ui.home.view.HomeMVPView
import com.example.redoyahmed.hmsapp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class HomePresenter<V : HomeMVPView, I : HomeMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), HomeMVPPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)
        view?.loadGeneralInfo(category = "")
    }
}