package com.example.redoyahmed.hmsapp.ui.splash.presenter

import com.example.redoyahmed.hmsapp.ui.splash.interactor.SplashMVPInteractor
import com.example.redoyahmed.hmsapp.ui.base.presenter.MVPPresenter
import com.example.redoyahmed.hmsapp.ui.splash.view.SplashMVPView

/**
 * Created by jyotidubey on 04/01/18.
 */
interface SplashMVPPresenter<V : SplashMVPView, I : SplashMVPInteractor> : MVPPresenter<V,I>