package com.example.redoyahmed.hmsapp.ui.rate

import com.example.redoyahmed.hmsapp.ui.rate.interactor.RateUsInteractor
import com.example.redoyahmed.hmsapp.ui.rate.interactor.RateUsMVPInterator
import com.example.redoyahmed.hmsapp.ui.rate.presenter.RateUsMVPPresenter
import com.example.redoyahmed.hmsapp.ui.rate.presenter.RateUsPresenter
import com.example.redoyahmed.hmsapp.ui.rate.view.RateUsDialogMVPView
import dagger.Module
import dagger.Provides

@Module
class RateUsFragmentModule {

    @Provides
    internal fun provideRateUsInteractor(interactor: RateUsInteractor): RateUsMVPInterator = interactor

    @Provides
    internal fun provideRateUsPresenter(presenter: RateUsPresenter<RateUsDialogMVPView, RateUsMVPInterator>): RateUsMVPPresenter<RateUsDialogMVPView, RateUsMVPInterator> = presenter
}