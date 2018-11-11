package com.shohokari.data.models

import com.shohokari.R.string.snack_bar_permission_camera_only_denied_text
import com.shohokari.R.string.snack_bar_permission_storage_denied_text
import com.shohokari.R.string.snack_bar_permission_microphone_denied_text
import com.shohokari.R.string.snack_bar_permission_camera_denied_text
import com.shohokari.R.string.snack_bar_permission_location_denied_text

import com.shohokari.R

/**
 * Created by AITL-01 on 5/21/2018.
 */

enum class Permission private constructor(val requestCode: Int, val permissionsArray: Array<String>, val deniedMessageResId: Int) {
    LOCATION(200, arrayOf<String>("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), R.string.snack_bar_permission_location_denied_text),
    CAMERA(201, arrayOf<String>("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"), R.string.snack_bar_permission_camera_denied_text),
    MICROPHONE(202, arrayOf<String>("android.permission.RECORD_AUDIO"), R.string.snack_bar_permission_microphone_denied_text),
    STORAGE(203, arrayOf<String>("android.permission.WRITE_EXTERNAL_STORAGE"), R.string.snack_bar_permission_storage_denied_text),
    CAMERA_ONLY(204, arrayOf<String>("android.permission.CAMERA"), R.string.snack_bar_permission_camera_only_denied_text)
}
