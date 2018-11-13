package com.example.redoyahmed.hmsapp.ui.signin.presenter

import com.example.redoyahmed.hmsapp.data.network.LoginResponse
import com.example.redoyahmed.hmsapp.ui.base.presenter.BasePresenter
import com.example.redoyahmed.hmsapp.ui.signin.interactor.SignInMVPInteractor
import com.example.redoyahmed.hmsapp.ui.signin.view.SignInMVPView
import com.example.redoyahmed.hmsapp.util.AppConstants
import com.example.redoyahmed.hmsapp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SignInPresenter<V : SignInMVPView, I : SignInMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), SignInMVPPresenter<V, I> {

    override fun onServerSignInClicked(email: String, password: String) {
        when {
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            password.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                getView()?.showProgress()
                interactor?.let {
                    compositeDisposable.add(it.serverSignInApiCall(email, password)
                        .compose(schedulerProvider.ioToMainObservableScheduler())
                        .subscribe({ loginResponse ->
                            getView()?.hideProgress()
                            if (loginResponse.responseData?.user != null && loginResponse.responseData?.user!!.Id > 0) {
                                updateUserInSharedPref(loginResponse = loginResponse, loggedInMode = AppConstants.LoggedInMode.LOGGED_IN_MODE_SERVER)
                                getView()?.openMainActivity()
                            } else {
                                getView()?.showLogInErrors(AppConstants.LOGIN_FAILURE.toString())
                            }

                        }, { err ->
                            getView()?.hideProgress()
                        }))
                }

            }
        }
    }

    private fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) = interactor?.updateUserInSharedPref(loginResponse, loggedInMode)
}