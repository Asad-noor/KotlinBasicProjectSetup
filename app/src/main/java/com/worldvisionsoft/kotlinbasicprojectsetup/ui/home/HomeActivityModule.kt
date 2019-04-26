package com.worldvisionsoft.kotlinbasicprojectsetup.ui.home

import com.worldvisionsoft.kotlinbasicprojectsetup.data.DataManager
import dagger.Module
import dagger.Provides

@Module
class HomeActivityModule {

    @Provides
    internal fun provideLoginViewModel(dataManager: DataManager): HomeViewModel {
        return HomeViewModel(dataManager)
    }
}