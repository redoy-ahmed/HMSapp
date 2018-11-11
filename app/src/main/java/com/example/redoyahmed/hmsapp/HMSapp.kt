package com.example.redoyahmed.hmsapp

import android.app.Activity
import android.app.Application
import android.support.multidex.MultiDex
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject
import com.example.redoyahmed.hmsapp.di.component.DaggerAppComponent


class HMSapp : Application(), HasActivityInjector {

    @Inject
    internal lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector() = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this)

        /*val fabric = Fabric.Builder(this).kits(Crashlytics()).debuggable(true).build()
        Fabric.with(fabric)
        AccountKit.initialize(this, null)

        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/typeface_300.otf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )

        FacebookSdk.sdkInitialize(this)
        AppEventsLogger.activateApp(this)*/
        MultiDex.install(this)
    }
}