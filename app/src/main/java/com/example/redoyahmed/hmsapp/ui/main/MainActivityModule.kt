package com.example.redoyahmed.hmsapp.ui.main

import com.example.redoyahmed.hmsapp.ui.main.ineractor.MainInteractor
import com.example.redoyahmed.hmsapp.ui.main.ineractor.MainMVPInteractor
import com.example.redoyahmed.hmsapp.ui.main.presenter.MainMVPPresenter
import com.example.redoyahmed.hmsapp.ui.main.presenter.MainPresenter
import com.example.redoyahmed.hmsapp.ui.main.view.MainMVPView
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    internal fun provideMainInteractor(mainInteractor: MainInteractor): MainMVPInteractor = mainInteractor

    @Provides
    internal fun provideMainPresenter(mainPresenter: MainPresenter<MainMVPView, MainMVPInteractor>): MainMVPPresenter<MainMVPView, MainMVPInteractor> = mainPresenter
}