package com.worldvisionsoft.kotlinbasicprojectsetup.ui.base

import androidx.lifecycle.ViewModel
import com.worldvisionsoft.kotlinbasicprojectsetup.data.DataManager
import java.lang.ref.WeakReference

abstract class BaseViewModel<N> constructor(private val dataManager: DataManager): ViewModel() {

    private var mNavigator: WeakReference<N>? = null

    fun getDataManager(): DataManager = dataManager

    fun getNavigator(): N? {
        return mNavigator?.get()
    }

    fun setNavigator(navigator: N) {
        this.mNavigator = WeakReference(navigator)
    }
}