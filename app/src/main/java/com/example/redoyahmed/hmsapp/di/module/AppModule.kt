package com.example.redoyahmed.hmsapp.di.module

import android.app.Application
import android.content.Context
import com.example.redoyahmed.hmsapp.BuildConfig
import com.example.redoyahmed.hmsapp.data.network.ApiHeader
import com.example.redoyahmed.hmsapp.data.network.ApiHelper
import com.example.redoyahmed.hmsapp.data.network.AppApiHelper
import com.example.redoyahmed.hmsapp.data.preferences.AppPreferenceHelper
import com.example.redoyahmed.hmsapp.data.preferences.PreferenceHelper
import com.example.redoyahmed.hmsapp.di.ApiKeyInfo
import com.example.redoyahmed.hmsapp.di.PreferenceInfo
import com.example.redoyahmed.hmsapp.util.AppConstants
import com.example.redoyahmed.hmsapp.util.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @ApiKeyInfo
    internal fun provideApiKey(): String = BuildConfig.API_KEY

    @Provides
    @PreferenceInfo
    internal fun provideprefFileName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    @Singleton
    internal fun providePrivateApiHeader(preferenceHelper: PreferenceHelper): ApiHeader.PrivateApiHeader = ApiHeader.PrivateApiHeader(accessToken = preferenceHelper.getCurrentUserAccessToken())

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper = appApiHelper

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()
}