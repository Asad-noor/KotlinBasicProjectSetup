package com.worldvisionsoft.kotlinbasicprojectsetup.ui.base

import android.arch.lifecycle.ViewModel
import com.worldvisionsoft.kotlinbasicprojectsetup.data.DataManager
import java.lang.ref.WeakReference

abstract class BaseViewModel<N> constructor(private val dataManager: DataManager,
                                            private val navigator: WeakReference<N>): ViewModel() {

    fun getDataManager(): DataManager = dataManager

    fun getNavigator(): WeakReference<N> = navigator
}