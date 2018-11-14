package com.example.redoyahmed.hmsapp.data.preferences

interface PreferenceHelper {

    fun getCurrentUserID(): String

    fun setCurrentUserID(Id: String?)

    fun getCurrentUserEmail(): String

    fun setCurrentUserEmail(Id: String?)

    fun getCurrentUserMobileNumber(): String

    fun setCurrentUserMobileNumber(mobile: String?)

    fun getCurrentUserName(): String

    fun setCurrentUserName(userName: String?)

    fun getCurrentUserPassword(): String

    fun setCurrentUserPassword(password: String?)

    fun getCurrentUserAddress(): String

    fun setCurrentUserAddress(address: String?)

    fun getCurrentUserGender(): String

    fun setCurrentUserGender(gender: String?)

    fun getCurrentUserAccessToken(): String

    fun setCurrentUserAccessToken(token: String?)

    fun getCurrentUserLggedIn(): Boolean

    fun setCurrentUserLggedIn(loggedIn: Boolean)
}