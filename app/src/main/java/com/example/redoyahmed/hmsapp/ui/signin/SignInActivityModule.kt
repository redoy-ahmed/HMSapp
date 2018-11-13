package com.example.redoyahmed.hmsapp.ui.signin

import com.example.redoyahmed.hmsapp.ui.signin.interactor.SignInInteractor
import com.example.redoyahmed.hmsapp.ui.signin.interactor.SignInMVPInteractor
import com.example.redoyahmed.hmsapp.ui.signin.presenter.SignInMVPPresenter
import com.example.redoyahmed.hmsapp.ui.signin.presenter.SignInPresenter
import com.example.redoyahmed.hmsapp.ui.signin.view.SignInMVPView
import dagger.Module
import dagger.Provides

@Module
class SignInActivityModule {

    @Provides
    internal fun provideSignInInteractor(interactor: SignInInteractor): SignInMVPInteractor = interactor

    @Provides
    internal fun provideSignInPresenter(presenter: SignInPresenter<SignInMVPView, SignInMVPInteractor>): SignInMVPPresenter<SignInMVPView, SignInMVPInteractor> = presenter
}