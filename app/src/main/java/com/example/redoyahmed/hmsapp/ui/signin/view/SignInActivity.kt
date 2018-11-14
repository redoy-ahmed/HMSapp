package com.example.redoyahmed.hmsapp.ui.signin.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.redoyahmed.hmsapp.R
import com.example.redoyahmed.hmsapp.data.preferences.AppPreferenceHelper
import com.example.redoyahmed.hmsapp.ui.base.view.BaseActivity
import com.example.redoyahmed.hmsapp.ui.main.view.MainActivity
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
            AppConstants.SIGNIN_FAILURE -> Toast.makeText(this, getString(R.string.sign_in_failure), Toast.LENGTH_LONG).show()
        }
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }

    override fun showLogInErrors(erros: String) {
        CommonUtil.showErrorDialog(this@SignInActivity, getString(R.string.sign_in_failure), erros)
    }

    private fun setOnClickListeners() {
        sign_in_button.setOnClickListener { presenter.onServerSignInClicked(sign_in_edit_text_widget_email.text.toString(), sign_in_edit_text_widget_password.text.toString()) }
        forgot_password_text_view.setOnClickListener { openForgotPasswordActivity() }
    }

    private fun openForgotPasswordActivity() {
        /*val onClickListener = View.OnClickListener {
            presenter.onForgotPasswordClicked(login_edit_text_widget_email.text.toString())
        }
        CommonUtil.showForgotPasswordDialog(this, applicationContext.getString(R.string.dialog_password_reset_title), "Send an email to " + login_edit_text_widget_email.text.toString() + " with instructions to reset your password?", onClickListener)*/
    }

    override fun setUpNavigation() {

    }
}