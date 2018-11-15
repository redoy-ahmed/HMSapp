package com.example.redoyahmed.hmsapp.ui.home

import com.example.redoyahmed.hmsapp.ui.home.view.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class HomeFragmentProvider {

    @ContributesAndroidInjector(modules = [(HomeFragmentModule::class)])
    internal abstract fun provideHomeFragmentFactory(): HomeFragment
}