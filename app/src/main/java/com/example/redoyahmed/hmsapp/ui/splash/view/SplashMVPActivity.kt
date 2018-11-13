package com.example.redoyahmed.hmsapp.ui.splash.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.redoyahmed.hmsapp.R
import com.example.redoyahmed.hmsapp.ui.base.view.BaseActivity
import com.example.redoyahmed.hmsapp.ui.signin.view.SignInActivity
import com.example.redoyahmed.hmsapp.ui.splash.interactor.SplashMVPInteractor
import com.example.redoyahmed.hmsapp.ui.splash.presenter.SplashMVPPresenter
import javax.inject.Inject

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    @Inject
    lateinit var presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>

    private val SPLASH_TIME_OUT = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

    override fun openSignInActivity() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun setUpNavigation() {
    }
}
