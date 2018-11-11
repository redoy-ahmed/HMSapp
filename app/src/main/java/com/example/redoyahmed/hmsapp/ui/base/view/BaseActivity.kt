package com.example.redoyahmed.hmsapp.ui.base.view

import android.app.ProgressDialog
import android.content.BroadcastReceiver
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.redoyahmed.hmsapp.R
import com.example.redoyahmed.hmsapp.util.CommonUtil
import com.shohokari.util.NetworkChangeReceiver
import dagger.android.AndroidInjection

/**
 * Created by jyotidubey on 04/01/18.
 */
abstract class BaseActivity : AppCompatActivity(), MVPView, BaseFragment.CallBack, NetworkChangeReceiver.ConnectivityReceiverListener {

    private var progressDialog: ProgressDialog? = null
    private var receiver: BroadcastReceiver? = null
    private var dialog: android.app.AlertDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dialog = CommonUtil.showNoInternetConnectionDialog(this, getString(R.string.dialog_network_unavailable_title), getString(R.string.dialog_network_unavailable_message_retry))
        receiver = NetworkChangeReceiver()
        registerReceiver(receiver, IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION))
        performDI()
    }

    override fun onNetworkConnectionChanged(isConnected: Boolean) {
        if (!isConnected) {
            if (!dialog!!.isShowing) {
                dialog?.show()
            }
        } else {
            if (dialog!!.isShowing) {
                dialog?.dismiss()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        NetworkChangeReceiver.connectivityReceiverListener = this
    }

    override fun onStart() {
        super.onStart()
        setUpNavigation()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (dialog?.isShowing!!) {
            dialog?.dismiss()
        }
        unregisterReceiver(receiver)
    }

    override fun hideProgress() {
        progressDialog?.let { if (it.isShowing) it.cancel() }
    }

    override fun showProgress() {
        hideProgress()
        progressDialog = CommonUtil.showLoadingDialog(this)
    }

    private fun performDI() = AndroidInjection.inject(this)

    abstract fun setUpNavigation()
}