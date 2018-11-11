package com.example.redoyahmed.hmsapp.ui.base.presenter

import com.example.redoyahmed.hmsapp.ui.base.interactor.MVPInteractor
import com.example.redoyahmed.hmsapp.ui.base.view.MVPView

interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

    fun onDetachView()
}