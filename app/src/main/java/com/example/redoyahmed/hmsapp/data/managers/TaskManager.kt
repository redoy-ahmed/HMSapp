package com.shohokari.data.managers

import com.shohokari.data.network.*
import javax.inject.Singleton

/**
 * Created by AITL-01 on 4/18/2018.
 */

@Singleton
internal object TaskManager {
    internal var task: Task? = null
    internal var taskBidding: Taskbidding? = null
    internal var searchFilter: SearchFilter? = null

    internal var taskAlertKeyword: TaskAlertKeyword? = null

    internal var mediaList: ArrayList<Media>? = null
    internal var taskBiddingList: ArrayList<Taskbidding>? = null
    internal var taskList: ArrayList<Task>? = null

    var timeLinePosts: TimeLinePosts? = null


    internal var IsTaskRefresh: Boolean? = false
    internal var IsBrowseTaskRefresh: Boolean? = false
}