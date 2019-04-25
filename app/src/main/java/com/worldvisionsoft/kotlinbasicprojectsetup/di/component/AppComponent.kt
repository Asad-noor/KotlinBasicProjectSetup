package com.worldvisionsoft.kotlinbasicprojectsetup.di.component

import com.worldvisionsoft.kotlinbasicprojectsetup.ui.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    internal abstract fun bindLoginActivity(): HomeActivity
}