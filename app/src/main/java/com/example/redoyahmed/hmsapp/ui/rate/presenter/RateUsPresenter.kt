package com.example.redoyahmed.hmsapp.ui.rate.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.BasePresenter
import com.example.redoyahmed.hmsapp.ui.rate.interactor.RateUsMVPInterator
import com.example.redoyahmed.hmsapp.ui.rate.view.RateUsDialogMVPView
import com.example.redoyahmed.hmsapp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class RateUsPresenter<V : RateUsDialogMVPView, I : RateUsMVPInterator> @Inject internal constructor(interator: I, schedulerProvider: SchedulerProvider, compositeDisposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interator, schedulerProvider = schedulerProvider, compositeDisposable = compositeDisposable), RateUsMVPPresenter<V, I> {

    override fun onLaterOptionClicked() = getView()?.let { it.dismissDialog() }

    override fun onSubmitOptionClicked() = interactor?.let {
        it.submitRating()
        getView()?.let {
            it.showRatingSubmissionSuccessMessage()
            it.dismissDialog()
        }
    }
}