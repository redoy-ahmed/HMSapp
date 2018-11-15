package com.example.redoyahmed.hmsapp.ui.signup.presenter

import com.example.redoyahmed.hmsapp.ui.base.presenter.BasePresenter
import com.example.redoyahmed.hmsapp.ui.signup.interactor.SignUpMVPInteractor
import com.example.redoyahmed.hmsapp.ui.signup.view.SignUpMVPView
import com.example.redoyahmed.hmsapp.util.AppConstants
import com.example.redoyahmed.hmsapp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SignUpPresenter<V : SignUpMVPView, I : SignUpMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), SignUpMVPPresenter<V, I> {

    override fun onSignUpButtonClicked(email: String, password: String) {
        when {
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            password.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                getView()?.showProgress()
                interactor?.let {
                    compositeDisposable.add(it.doServerSignUpApiCall(email, password)
                            .compose(schedulerProvider.ioToMainObservableScheduler())
                            .subscribe({ signUpResponse ->
                                getView()?.hideProgress()

                                if (signUpResponse.Success) {
                                    it.updateUserInSharedPref(signUpResponse.responseData!!.user!!.userId!!, email, password)
                                    getView()?.openCreateProfileActivity()
                                } else {
                                    val builder = StringBuilder()
                                    if (signUpResponse.ErrorMessages!!.messages != null) {
                                        for (s in signUpResponse.Messages!!.messages!!) {
                                            builder.append(s)
                                        }
                                    }
                                    getView()?.showServerMessage("Registration failed" + builder.toString())
                                }

                            }, { err ->
                                println(err)
                                getView()?.hideProgress()
                            }))
                }

            }
        }
    }
}