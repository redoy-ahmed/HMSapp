package com.example.redoyahmed.hmsapp.ui.signup.view

import android.os.Bundle
import android.widget.Toast
import com.example.redoyahmed.hmsapp.R
import com.example.redoyahmed.hmsapp.data.preferences.AppPreferenceHelper
import com.example.redoyahmed.hmsapp.ui.base.view.BaseActivity
import com.example.redoyahmed.hmsapp.ui.signup.interactor.SignUpMVPInteractor
import com.example.redoyahmed.hmsapp.ui.signup.presenter.SignUpMVPPresenter
import com.example.redoyahmed.hmsapp.util.AppConstants
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.app_bar_navigation.*
import javax.inject.Inject

class SignUpActivity : BaseActivity(), SignUpMVPView {

    @Inject
    internal lateinit var presenter: SignUpMVPPresenter<SignUpMVPView, SignUpMVPInteractor>

    private lateinit var email: String
    private lateinit var password: String
    private var phoneNumberString = ""
    lateinit var appPreferenceHelper: AppPreferenceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appPreferenceHelper = AppPreferenceHelper(this, AppConstants.PREF_NAME)
        setContentView(R.layout.activity_sign_up)
        presenter.onAttach(this)
        setOnClickListeners()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun showValidationMessage(errorCode: Int) {
        when (errorCode) {
            AppConstants.EMPTY_EMAIL_ERROR -> Toast.makeText(this, getString(R.string.empty_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.INVALID_EMAIL_ERROR -> Toast.makeText(this, getString(R.string.invalid_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_PASSWORD_ERROR -> Toast.makeText(this, getString(R.string.empty_password_error_message), Toast.LENGTH_LONG).show()
            AppConstants.LOGIN_FAILURE -> Toast.makeText(this, getString(R.string.login_failure), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_MOBILENUMBER_ERROR -> Toast.makeText(this, getString(R.string.empty_mobile_error_message), Toast.LENGTH_LONG).show()
            //AppConstants.SIGNUP_FAILURE_ALREADYACCOUNT -> CommonUtil.showShohokariAlertOkDialog(this, "Sign up Failed", getString(R.string.your_account_already_exists))
        }
    }

    override fun showServerMessage(message: String) {
        //CommonUtil.showShohokariAlertOkDialog(this, "Sign up Failed", message)

    }

    override fun openCreateProfileActivity() {

        /*if (phoneNumberString != null && phoneNumberString.length > 10) {

        }

        val intent = Intent(this, CreateProfileActivity::class.java)
        intent.putExtra("Email", sign_up_edit_text_widget_email.text.toString())
        intent.putExtra("Password", sign_up_edit_text_widget_password.text.toString())
        intent.putExtra("phoneNumberString", phoneNumberString)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()*/
    }

    private fun setOnClickListeners() {

        sign_up_button.setOnClickListener {
            email = username_edtext.text.toString()
            password = passwd_edtext.text.toString()
            presenter.onSignUpButtonClicked(email, password)
        }
    }

    override fun setUpNavigation() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.sign_up)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_material)
        toolbar.setNavigationOnClickListener {

            onBackPressed()
        }
    }
}