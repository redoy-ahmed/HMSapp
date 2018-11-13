package com.example.redoyahmed.hmsapp.ui.rate.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.MVPPresenter
import com.example.redoyahmed.hmsapp.ui.rate.interactor.RateUsMVPInterator
import com.example.redoyahmed.hmsapp.ui.rate.view.RateUsDialogMVPView

interface RateUsMVPPresenter<V : RateUsDialogMVPView, I : RateUsMVPInterator> : MVPPresenter<V, I> {

    fun onLaterOptionClicked() : Unit?
    fun onSubmitOptionClicked() : Unit?
}