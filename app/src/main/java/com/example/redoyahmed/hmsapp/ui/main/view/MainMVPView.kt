package com.example.redoyahmed.hmsapp.ui.main.view

import com.example.redoyahmed.hmsapp.ui.base.view.MVPView

interface MainMVPView : MVPView {

    fun inflateUserDetails(userDetails: Pair<String?, String?>)
    fun openLoginActivity()
    fun openHomeFragment()
    fun openAboutFragment()
    fun openRateUsDialog(): Unit?
    fun lockDrawer(): Unit?
    fun unlockDrawer(): Unit?
}