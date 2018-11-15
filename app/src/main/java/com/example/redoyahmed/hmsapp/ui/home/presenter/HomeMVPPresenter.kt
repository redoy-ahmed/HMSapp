package com.example.redoyahmed.hmsapp.ui.home.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.MVPPresenter
import com.example.redoyahmed.hmsapp.ui.home.interactor.HomeMVPInteractor
import com.example.redoyahmed.hmsapp.ui.home.view.HomeMVPView

interface HomeMVPPresenter<V : HomeMVPView, I : HomeMVPInteractor> : MVPPresenter<V, I> {

}