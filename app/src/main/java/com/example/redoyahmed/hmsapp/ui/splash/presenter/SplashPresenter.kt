package com.example.redoyahmed.hmsapp.ui.splash.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.BasePresenter
import com.example.redoyahmed.hmsapp.ui.splash.interactor.SplashMVPInteractor
import com.example.redoyahmed.hmsapp.ui.splash.view.SplashMVPView
import com.example.redoyahmed.hmsapp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SplashPresenter<V : SplashMVPView, I : SplashMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), SplashMVPPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)
        decideActivityToOpen()
    }

    private fun decideActivityToOpen() = getView()?.let {
        if (isUserLoggedIn())
            it.openMainActivity()
        else
            it.openSignInActivity()
    }

    private fun isUserLoggedIn(): Boolean {
        interactor?.let { return it.isUserLoggedIn() }
        return false
    }
}