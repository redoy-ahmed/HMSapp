package com.example.redoyahmed.hmsapp.ui.main.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.BasePresenter
import com.example.redoyahmed.hmsapp.ui.main.ineractor.MainMVPInteractor
import com.example.redoyahmed.hmsapp.ui.main.view.MainMVPView
import com.example.redoyahmed.hmsapp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class MainPresenter<V : MainMVPView, I : MainMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), MainMVPPresenter<V, I> {

    override fun onDrawerOptionRateUsClick() = getView()?.openRateUsDialog()

    override fun onDrawerOptionAboutClick() = getView()?.openAboutFragment()

    override fun onDrawerOptionLogoutClick() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(
                it.makeLogoutApiCall()
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe({
                        interactor?.performUserLogout()
                        getView()?.let {
                            it.hideProgress()
                            it.openLoginActivity()
                        }
                    }, { err -> println(err) }))
        }

    }
}