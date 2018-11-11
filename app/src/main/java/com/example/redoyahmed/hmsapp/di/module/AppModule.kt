package com.example.redoyahmed.hmsapp.di.module

import android.app.Application
import android.content.Context
import com.example.redoyahmed.hmsapp.util.SchedulerProvider
import com.shohokari.data.network.ApiHeader
import com.shohokari.data.network.ApiHelper
import com.shohokari.data.network.AppApiHelper
import com.shohokari.data.preferences.AppPreferenceHelper
import com.shohokari.data.preferences.PreferenceHelper
import com.shohokari.di.ApiKeyInfo
import com.shohokari.di.PreferenceInfo
import com.shohokari.util.AppConstants
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
    @PreferenceInfo
    internal fun provideprefFileName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    @Singleton
    internal fun provideProtectedApiHeader(@ApiKeyInfo apiKey: String, preferenceHelper: PreferenceHelper)
            : ApiHeader.ProtectedApiHeader = ApiHeader.ProtectedApiHeader(apiKey = apiKey,
            userId = preferenceHelper.getCurrentUserId(),
            accessToken = preferenceHelper.getAccessToken())

    @Provides
    @Singleton
    internal fun providePrivateApiHeader(@ApiKeyInfo apiKey: String, preferenceHelper: PreferenceHelper)
            : ApiHeader.PrivateApiHeader = ApiHeader.PrivateApiHeader(cookieKey = preferenceHelper.getAccessCookie())

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper = appApiHelper

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()
}