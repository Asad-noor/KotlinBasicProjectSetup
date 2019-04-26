package com.worldvisionsoft.kotlinbasicprojectsetup.ui.home

import com.worldvisionsoft.kotlinbasicprojectsetup.data.DataManager
import com.worldvisionsoft.kotlinbasicprojectsetup.ui.base.BaseViewModel

class HomeViewModel constructor(val dataManager: DataManager) : BaseViewModel<HomeNavigator>(dataManager) {

    fun performHome() {

    }

    fun onServerLoginClick() {
        getNavigator()?.home()
    }
}