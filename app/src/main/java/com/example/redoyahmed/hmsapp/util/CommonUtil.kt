package com.example.redoyahmed.hmsapp.util

import android.app.Activity
import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Context
import com.example.redoyahmed.hmsapp.R

object CommonUtil {

    private lateinit var pictureDialog: AlertDialog

    fun showLoadingDialog(context: Activity?): ProgressDialog {
        val progressDialog = ProgressDialog(context!!)
        progressDialog.setMessage(context.getString(R.string.please_wait))
        progressDialog.setCancelable(false)
        progressDialog.show()
        return progressDialog
    }

    fun showNoInternetConnectionDialog(context: Context?, title: String?, message: String?): AlertDialog {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_default_positive_button_label)) { dialog, _ ->
            dialog.dismiss()
        }
        return builder.create()
    }

    /*fun showSharingDialog(context: Activity?, task: Task) {
        val shareIntent = Intent()
        shareIntent.action = Intent.ACTION_SEND
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_URL + task.TaskTitleUrl)
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_URL + task.TaskTitleUrl)

        context?.startActivity(Intent.createChooser(shareIntent, context.getString(R.string.send_to)))
    }

    fun showProfileSharingDialog(context: Activity?, user: User) {
        val shareIntent = Intent()
        shareIntent.action = Intent.ACTION_SEND
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PUBLIC_URL + user.UserProfileUrl)
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PUBLIC_URL + user.UserProfileUrl)



        context?.startActivity(Intent.createChooser(shareIntent, context.getString(R.string.send_to)))
    }

    fun showShohokariAlertOkDialog(context: Activity?, title: String?, message: String?) {

        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_ok)) { dialog, which ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun showShohokariAlertDialog(context: Activity?, title: String?, message: String?, onClickListener: View.OnClickListener) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_default_positive_button_label)) { dialog, which ->
            onClickListener.onClick(null)
            dialog.dismiss()
        }
        builder.setNegativeButton(context?.resources?.getString(R.string.dialog_default_negative_button_label)) { dialog, which ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun showForgotPasswordDialog(context: Activity?, title: String?, message: String?, onClickListener: View.OnClickListener) {
        val mInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val dialogBuilder = AlertDialog.Builder(context)
        val dialogView = mInflater.inflate(R.layout.custom_dialog, null)
        dialogBuilder.setView(dialogView)

        dialogBuilder.setTitle(title)
        dialogBuilder.setMessage(message)
        dialogBuilder.setPositiveButton("OK") { dialog, whichButton ->
            onClickListener.onClick(dialogView)
        }
        dialogBuilder.setNegativeButton("CANCEL") { dialog, whichButton ->
        }
        val b = dialogBuilder.create()
        b.show()
    }

    fun showLogOutDialog(context: Context?, title: String?, message: String?, onClickListener: View.OnClickListener) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_default_positive_button_label)) { dialog, which ->
            onClickListener.onClick(null)
        }
        builder.setNegativeButton(context?.resources?.getString(R.string.dialog_default_negative_button_label)) { dialog, which ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun showEmailVerificationDialog(context: Context?, title: String?, message: String?, onClickListener: View.OnClickListener) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_email_verification_send_button_label)) { dialog, which ->
            onClickListener.onClick(null)
        }
        builder.setNegativeButton(context?.resources?.getString(R.string.dialog_email_verification_cancel_button_label)) { dialog, which ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun showExitDialog(context: Context?, title: String?, message: String?, onClickListener: View.OnClickListener) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_default_positive_button_label)) { dialog, which ->
            onClickListener.onClick(null)
        }
        builder.setNegativeButton(context?.resources?.getString(R.string.dialog_default_negative_button_label)) { dialog, which ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun showErrorDialog(activity: Activity?, title: String?, message: String?) {
        SweetAlertDialog(activity, SweetAlertDialog.ERROR_TYPE)
                .setTitleText(title)
                .setContentText(message)
                .show()
    }

    fun showCustomDialog(context: Context?, title: String?, message: String?, onClickListener: View.OnClickListener) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_default_positive_button_label)) { dialog, which ->
            onClickListener.onClick(null)
        }
        builder.setNegativeButton(context?.resources?.getString(R.string.dialog_default_negative_button_label)) { dialog, which ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun showCustomDialog(context: Context?, title: String?, message: String?) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_default_positive_button_label)) { dialog, which ->
            dialog.dismiss()
        }
//        builder.setNegativeButton(context?.resources?.getString(R.string.dialog_default_negative_button_label)) { dialog, which ->
//            dialog.dismiss()
//        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun showSuccessDialog(activity: Activity?, title: String?, message: String?) {
        SweetAlertDialog(activity, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText(title)
                .setContentText(message)
                .show()
    }

    fun showInfoDialog(activity: Activity?, title: String?, message: String?) {
        SweetAlertDialog(activity, SweetAlertDialog.NORMAL_TYPE)
                .setTitleText(title)
                .setContentText(message)
                .show()
    }

    fun showShohkariToastDialog(context: Activity?, string: String) {
        Toast.makeText(context, string, Toast.LENGTH_LONG)
    }

    fun showPictureDialog(context: Activity?, onClickListenerCamera: View.OnClickListener, onClickListenerGallery: View.OnClickListener) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        val inflater: LayoutInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val dialogLayout: View = inflater.inflate(R.layout.dialog_add_attachment, null)
        builder.setView(dialogLayout)
        builder.setCancelable(true)

        dialogLayout.dialog_add_attachment_camera_button.setOnClickListener {
            pictureDialog.dismiss()
            onClickListenerCamera.onClick(dialogLayout)
        }

        dialogLayout.dialog_add_attachment_gallery_button.setOnClickListener {

            pictureDialog.dismiss()
            onClickListenerGallery.onClick(dialogLayout)
        }

        pictureDialog = builder.create()
        pictureDialog.show()
    }

    fun showAppUpdateDialog(context: Activity?, title: String?, message: String?, onClickListener: View.OnClickListener) {
        val mInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val dialogBuilder = AlertDialog.Builder(context)
        val dialogView = mInflater.inflate(R.layout.custom_dialog, null)
        dialogBuilder.setView(dialogView)

        dialogBuilder.setTitle(title)
        dialogBuilder.setMessage(message)
        dialogBuilder.setPositiveButton(context.getString(R.string.dialog_version_deprecated_update_button)) { dialog, whichButton ->
            onClickListener.onClick(dialogView)
        }
        dialogBuilder.setNegativeButton(context.getString(R.string.dialog_version_deprecated_exit_button)) { dialog, whichButton ->
        }
        val b = dialogBuilder.create()
        b.show()
    }

    fun showAttachmentPopUpMenu(v: View, context: Activity, onClickListenerCamera: View.OnClickListener, onClickListenerGallery: View.OnClickListener) {
        val popup = PopupMenu(context, v)
        popup.inflate(R.menu.popup_attchement)
        popup.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.pop_up_menu_camera -> {
                    onClickListenerCamera.onClick(v)
                    true
                }
                R.id.pop_up_menu_gallery -> {
                    onClickListenerGallery.onClick(v)
                    true
                }
                else -> false
            }
        }
        popup.show()
    }

    fun showReportPopUpMenu(v: View, context: Activity, onClickListenerReport: View.OnClickListener) {
        val popup = PopupMenu(context, v)
        popup.inflate(R.menu.popup_report)
        popup.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.pop_up_menu_report -> {
                    onClickListenerReport.onClick(v)
                    true
                }
                else -> false
            }
        }
        popup.show()
    }

    fun showDownloadSuccessDialog(activity: Activity?, title: String?, message: String?): SweetAlertDialog {
        val dialog = SweetAlertDialog(activity, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText(title)
                .setContentText(message)
        return dialog
    }*/
}