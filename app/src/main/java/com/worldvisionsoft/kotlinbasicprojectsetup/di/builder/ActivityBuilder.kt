package com.worldvisionsoft.kotlinbasicprojectsetup.di.builder

import com.worldvisionsoft.kotlinbasicprojectsetup.ui.home.HomeActivity
import com.worldvisionsoft.kotlinbasicprojectsetup.ui.home.HomeActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(HomeActivityModule::class)])
    abstract fun bindHomeActivity(): HomeActivity
}