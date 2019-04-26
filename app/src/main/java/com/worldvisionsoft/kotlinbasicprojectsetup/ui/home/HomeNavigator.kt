package com.worldvisionsoft.kotlinbasicprojectsetup.ui.home

/**
 * Created by amitshekhar on 08/07/17.
 */

interface HomeNavigator {

    fun home()

    fun handleError(throwable: Throwable)

    fun openMainActivity()
}
