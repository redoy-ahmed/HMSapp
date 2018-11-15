package com.example.redoyahmed.hmsapp.ui.home

import com.example.redoyahmed.hmsapp.ui.home.interactor.HomeInteractor
import com.example.redoyahmed.hmsapp.ui.home.interactor.HomeMVPInteractor
import com.example.redoyahmed.hmsapp.ui.home.presenter.HomeMVPPresenter
import com.example.redoyahmed.hmsapp.ui.home.presenter.HomePresenter
import com.example.redoyahmed.hmsapp.ui.home.view.HomeMVPView
import dagger.Module
import dagger.Provides

@Module
class HomeFragmentModule {

    @Provides
    internal fun provideHomeInteractor(interactor: HomeInteractor): HomeMVPInteractor = interactor

    @Provides
    internal fun provideHomePresenter(presenter: HomePresenter<HomeMVPView, HomeMVPInteractor>): HomeMVPPresenter<HomeMVPView, HomeMVPInteractor> = presenter
}