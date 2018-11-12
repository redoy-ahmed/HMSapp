package com.example.redoyahmed.hmsapp.ui.splash


import com.example.redoyahmed.hmsapp.ui.splash.interactor.SplashInteractor
import com.example.redoyahmed.hmsapp.ui.splash.interactor.SplashMVPInteractor
import com.example.redoyahmed.hmsapp.ui.splash.presenter.SplashMVPPresenter
import com.example.redoyahmed.hmsapp.ui.splash.presenter.SplashPresenter
import com.example.redoyahmed.hmsapp.ui.splash.view.SplashMVPView
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