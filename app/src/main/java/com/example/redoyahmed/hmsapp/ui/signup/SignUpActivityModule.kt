package com.example.redoyahmed.hmsapp.ui.signup

import com.example.redoyahmed.hmsapp.ui.signup.interactor.SignUpInteractor
import com.example.redoyahmed.hmsapp.ui.signup.interactor.SignUpMVPInteractor
import com.example.redoyahmed.hmsapp.ui.signup.presenter.SignUpMVPPresenter
import com.example.redoyahmed.hmsapp.ui.signup.presenter.SignUpPresenter
import com.example.redoyahmed.hmsapp.ui.signup.view.SignUpMVPView
import dagger.Module
import dagger.Provides

@Module
class SignUpActivityModule {

    @Provides
    internal fun provideSignUpInteractor(interactor: SignUpInteractor): SignUpMVPInteractor = interactor

    @Provides
    internal fun provideSignUpPresenter(presenter: SignUpPresenter<SignUpMVPView, SignUpMVPInteractor>): SignUpMVPPresenter<SignUpMVPView, SignUpMVPInteractor> = presenter
}