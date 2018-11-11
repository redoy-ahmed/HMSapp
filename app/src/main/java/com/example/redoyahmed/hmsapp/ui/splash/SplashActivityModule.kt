package com.shohokari.ui.splash

import com.shohokari.ui.splash.interactor.SplashInteractor
import com.shohokari.ui.splash.interactor.SplashMVPInteractor
import com.shohokari.ui.splash.presenter.SplashMVPPresenter
import com.shohokari.ui.splash.presenter.SplashPresenter
import com.shohokari.ui.splash.view.SplashMVPView
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashInteractor(splashInteractor: SplashInteractor): SplashMVPInteractor = splashInteractor

    @Provides
    internal fun provideSplashPresenter(splashPresenter: SplashPresenter<SplashMVPView, SplashMVPInteractor>)
            : SplashMVPPresenter<SplashMVPView, SplashMVPInteractor> = splashPresenter
}