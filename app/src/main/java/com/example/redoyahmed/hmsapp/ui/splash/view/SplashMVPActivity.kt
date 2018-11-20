package com.example.redoyahmed.hmsapp.ui.splash.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.redoyahmed.hmsapp.R
import com.example.redoyahmed.hmsapp.ui.base.view.BaseActivity
import com.example.redoyahmed.hmsapp.ui.main.view.MainActivity
import com.example.redoyahmed.hmsapp.ui.signin.view.SignInActivity
import com.example.redoyahmed.hmsapp.ui.splash.interactor.SplashMVPInteractor
import com.example.redoyahmed.hmsapp.ui.splash.presenter.SplashMVPPresenter
import com.example.redoyahmed.hmsapp.util.AppConstants
import javax.inject.Inject

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    @Inject
    lateinit var presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            presenter.onAttach(this)
        }, AppConstants.SPLASH_SCREEN_TIME_OUT.toLong())
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
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openSignInActivity() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun setUpNavigation() {
    }
}
