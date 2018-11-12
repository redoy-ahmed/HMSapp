package com.example.redoyahmed.hmsapp.ui.splash.view

import android.os.Bundle
import android.os.Handler
import com.example.redoyahmed.hmsapp.R
import com.example.redoyahmed.hmsapp.ui.base.view.BaseActivity
import com.example.redoyahmed.hmsapp.ui.splash.interactor.SplashMVPInteractor
import com.example.redoyahmed.hmsapp.ui.splash.presenter.SplashMVPPresenter
import javax.inject.Inject

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    @Inject
    lateinit var presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>

    private val SPLASH_TIME_OUT = 3000

    //lateinit var appPreferenceHelper: AppPreferenceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*appPreferenceHelper = AppPreferenceHelper(this, AppConstants.PREF_NAME)
        LocaleHelper.setLocale(this, appPreferenceHelper.getApplicationLanguage())*/

        setContentView(R.layout.activity_splash)


        Handler().postDelayed({
            presenter.onAttach(this)
        }, SPLASH_TIME_OUT.toLong())
    }


    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun showSuccessToast() {
    }

    override fun showErrorToast() {
    }

    override fun openMainActivity() {

        /*var CurrentUserFirstName = appPreferenceHelper.getCurrentUserFirstName()

        if (appPreferenceHelper.getCurrentUserFirstName().isNullOrEmpty() || appPreferenceHelper.getCurrentLastName().isNullOrEmpty() || appPreferenceHelper.getCurrentUserMobileNumber().isNullOrEmpty()) {
            val intent = Intent(this, CreateProfileActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        } else {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }*/
    }

    override fun openLoginSignUpActivity() {
        /*val intent = Intent(this, IntroductionActivity::class.java)
        startActivity(intent)
        finish()*/
    }

    override fun setUpNavigation() {
    }


    //Start Audio Area

//    override fun onResume() {
//        super.onResume()
//        mMediaPlayer = MediaPlayer.create(applicationContext, R.raw.welcome_shohokari)
//        if(appPreferenceHelper != null && appPreferenceHelper.getSettingAudioPlay()) {
//            mMediaPlayer.start()
//        }
//    }
//
//    override fun onPause() {
//        super.onPause()
//        mMediaPlayer.release()
//    }

    //End Audio Area
}
