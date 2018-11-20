package com.example.redoyahmed.hmsapp.ui.main.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.MVPPresenter
import com.example.redoyahmed.hmsapp.ui.main.ineractor.MainMVPInteractor
import com.example.redoyahmed.hmsapp.ui.main.view.MainMVPView

interface MainMVPPresenter<V : MainMVPView, I : MainMVPInteractor> : MVPPresenter<V, I> {

    fun onDrawerOptionHomeClick() : Unit?
    fun onDrawerOptionAboutClick() : Unit?
    fun onDrawerOptionRateUsClick(): Unit?
    fun onDrawerOptionLogoutClick()
}