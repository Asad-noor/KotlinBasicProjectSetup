package com.worldvisionsoft.kotlinbasicprojectsetup.ui.home

import com.worldvisionsoft.kotlinbasicprojectsetup.data.DataManager
import dagger.Module

@Module
class HomeActivityModule {
    internal fun provideHomeViewModel(dataManager: DataManager): HomeV
}