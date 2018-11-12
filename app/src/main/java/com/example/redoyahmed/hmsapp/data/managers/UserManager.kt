package com.example.redoyahmed.hmsapp.data.managers

import com.example.redoyahmed.hmsapp.data.network.Media
import com.example.redoyahmed.hmsapp.data.network.Skill
import com.example.redoyahmed.hmsapp.data.network.User
import javax.inject.Singleton


@Singleton
internal object UserManager {

    internal var user: User? = null
    internal var profileUser: User? = null
    internal var skillListUser: Skill? = null
    internal var portfolioList: ArrayList<Media>? = null
}