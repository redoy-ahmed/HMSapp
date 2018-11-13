package com.example.redoyahmed.hmsapp.ui.about

import com.example.redoyahmed.hmsapp.ui.about.view.AboutFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AboutFragmentProvider {

    @ContributesAndroidInjector
    internal abstract fun provideAboutFragment(): AboutFragment
}