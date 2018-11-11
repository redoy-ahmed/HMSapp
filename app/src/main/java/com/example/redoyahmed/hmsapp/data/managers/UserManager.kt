package com.shohokari.data.managers

import com.shohokari.data.network.Media
import com.shohokari.data.network.Skill
import com.shohokari.data.network.User
import javax.inject.Singleton

/**
 * Created by AITL-01 on 4/18/2018.
 */

@Singleton
internal object UserManager {

    internal var user: User? = null
    internal var profileUser: User? = null
    internal var skillListUser: Skill? = null

    internal var portfolioList: ArrayList<Media>? = null




}