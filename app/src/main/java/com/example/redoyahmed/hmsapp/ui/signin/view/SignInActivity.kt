package com.example.redoyahmed.hmsapp.ui.signin.view

import android.os.Bundle
import android.widget.Toast
import com.example.redoyahmed.hmsapp.R
import com.example.redoyahmed.hmsapp.data.preferences.AppPreferenceHelper
import com.example.redoyahmed.hmsapp.ui.base.view.BaseActivity
import com.example.redoyahmed.hmsapp.ui.signin.interactor.SignInMVPInteractor
import com.example.redoyahmed.hmsapp.ui.signin.presenter.SignInMVPPresenter
import com.example.redoyahmed.hmsapp.util.AppConstants
import com.example.redoyahmed.hmsapp.util.CommonUtil
import kotlinx.android.synthetic.main.activity_sign_in.*
import javax.inject.Inject

class SignInActivity : BaseActivity(), SignInMVPView {

    @Inject
    internal lateinit var presenter: SignInMVPPresenter<SignInMVPView, SignInMVPInteractor>

    lateinit var appPreferenceHelper: AppPreferenceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appPreferenceHelper = AppPreferenceHelper(this, AppConstants.PREF_NAME)
        setContentView(R.layout.activity_sign_in)
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
        }
    }

    override fun openMainActivity() {

        /*if (appPreferenceHelper.getCurrentUserFirstName() == "" || appPreferenceHelper.getCurrentLastName() == "" || appPreferenceHelper.getCurrentUserMobileNumber() == "") {
            val intent = Intent(this, CreateProfileActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        } else {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }*/
    }


    override fun showLogInErrors(erros: String) {
        //CommonUtil.showErrorDialog(this@LoginActivity, getString(R.string.login_failure), erros)
    }

    private fun setOnClickListeners() {
        login_button.setOnClickListener { presenter.onServerSignInClicked(sign_in_edit_text_widget_email.text.toString(), sign_in_edit_text_widget_password.text.toString()) }
        //sign_up_login_text_view_forgot_password_button.setOnClickListener { openForgotPasswordActivity() }
    }

    private fun openForgotPasswordActivity() {
        /*val onClickListener = View.OnClickListener {
            presenter.onForgotPasswordClicked(login_edit_text_widget_email.text.toString())
        }
        CommonUtil.showForgotPasswordDialog(this, applicationContext.getString(R.string.dialog_password_reset_title), "Send an email to " + login_edit_text_widget_email.text.toString() + " with instructions to reset your password?", onClickListener)*/
    }

    override fun setUpNavigation() {
        /*setSupportActionBar(toolbar)
        supportActionBar?.title = ""// getString(R.string.log_in)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_material)
        toolbar.setNavigationOnClickListener {
            finish()
        }*/
    }
}