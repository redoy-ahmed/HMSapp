package com.example.redoyahmed.hmsapp.data.preferences

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.example.redoyahmed.hmsapp.data.network.ApiHeader
import com.example.redoyahmed.hmsapp.di.PreferenceInfo
import com.example.redoyahmed.hmsapp.util.AppConstants
import javax.inject.Inject

class AppPreferenceHelper @Inject constructor(context: Context, @PreferenceInfo private val prefFileName: String) : PreferenceHelper {

    companion object {
        private val PREF_KEY_CURRENT_USER_LOGGED_IN_MODE = "PREF_KEY_CURRENT_USER_LOGGED_IN_MODE"
        private val PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID"
        private val PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_NAME"
        private val PREF_KEY_CURRENT_USER_MOBILE_NUMBER = "PREF_KEY_CURRENT_USER_MOBILE_NUMBER"
        private val PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME"
        private val PREF_KEY_CURRENT_USER_PASSWORD = "PREF_KEY_CURRENT_USER_PASSWORD"
        private val PREF_KEY_CURRENT_USER_ADDRESS = "PREF_KEY_CURRENT_USER_ADDRESS"
        private val PREF_KEY_CURRENT_USER_GENDER = "PREF_KEY_CURRENT_USER_GENDER"
        private val PREF_KEY_CURRENT_USER_ACCESS_TOKEN = "PREF_KEY_CURRENT_USER_ACCESS_TOKEN"
        private val PREF_KEY_IS_CURRENT_USER_LOGGED_IN = "PREF_KEY_IS_CURRENT_USER_LOGGED_IN"
    }

    private val mPrefs: SharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    override fun getCurrentUserID(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_ID, "")

    override fun setCurrentUserID(Id: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_ID, Id) }

    override fun getCurrentUserEmail(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_EMAIL, "")

    override fun setCurrentUserEmail(email: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_EMAIL, email) }

    override fun getCurrentUserMobileNumber(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_MOBILE_NUMBER, "")

    override fun setCurrentUserMobileNumber(mobile: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_MOBILE_NUMBER, mobile) }

    override fun getCurrentUserName(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_NAME, "")

    override fun setCurrentUserName(userName: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_NAME, userName) }

    override fun getCurrentUserPassword(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_PASSWORD, "")

    override fun setCurrentUserPassword(password: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_PASSWORD, password) }

    override fun getCurrentUserAddress(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_ADDRESS, "")

    override fun setCurrentUserAddress(address: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_ADDRESS, address) }

    override fun getCurrentUserGender(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_GENDER, "")

    override fun setCurrentUserGender(gender: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_GENDER, gender) }

    override fun getCurrentUserAccessToken(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_ACCESS_TOKEN, "")

    override fun setCurrentUserAccessToken(token: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_ACCESS_TOKEN, token) }

    override fun getCurrentUserLggedIn(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_CURRENT_USER_LOGGED_IN, false)

    override fun setCurrentUserLggedIn(loggedIn: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_CURRENT_USER_LOGGED_IN, loggedIn) }
}