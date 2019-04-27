package com.worldvisionsoft.kotlinbasicprojectsetup.ui.home

import com.worldvisionsoft.kotlinbasicprojectsetup.data.DataManager
import com.worldvisionsoft.kotlinbasicprojectsetup.ui.base.BaseViewModel

class HomeViewModel constructor(dataManager: DataManager) : BaseViewModel<HomeNavigator>(dataManager) {

    // 2. Then this method is called from the view class
    fun performHome() {
        getDataManager().login("is it ok?")
    }

    // 1. This method is called from xml view Button and then redirect to view class where home is overridden
    fun onServerLoginClick() {
        getNavigator()?.home()
    }
}