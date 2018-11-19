package com.example.redoyahmed.hmsapp.ui.home.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.redoyahmed.hmsapp.R
import com.example.redoyahmed.hmsapp.data.preferences.AppPreferenceHelper
import com.example.redoyahmed.hmsapp.ui.base.view.BaseFragment
import com.example.redoyahmed.hmsapp.ui.home.interactor.HomeMVPInteractor
import com.example.redoyahmed.hmsapp.ui.home.presenter.HomeMVPPresenter
import com.example.redoyahmed.hmsapp.util.AppConstants
import javax.inject.Inject

class HomeFragment : BaseFragment(), HomeMVPView {

    @Inject
    internal lateinit var presenter: HomeMVPPresenter<HomeMVPView, HomeMVPInteractor>

    lateinit var appPreferenceHelper: AppPreferenceHelper

    companion object {

        internal val TAG = "HomeFragment"

        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        appPreferenceHelper = AppPreferenceHelper(context!!, AppConstants.PREF_NAME)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter.onAttach(this)
        setHasOptionsMenu(true)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun setUp() {
        activity?.title = getString(R.string.navigation_drawer_home_label)
    }

    override fun onDestroyView() {
        presenter.onDetach()
        super.onDestroyView()
    }

    override fun showValidationMessage(errorCode: Int) {

    }

    override fun loadGeneralInfo(category: String) {

    }
}