package com.example.redoyahmed.hmsapp.ui.rate

import com.example.redoyahmed.hmsapp.ui.rate.view.RateUsDialog
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class RateUsDialogFragmentProvider{

    @ContributesAndroidInjector(modules = [RateUsFragmentModule::class])
    internal abstract fun provideRateUsFragment() : RateUsDialog
}