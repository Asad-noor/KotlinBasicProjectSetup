package com.worldvisionsoft.kotlinbasicprojectsetup.ui.home

import com.google.gson.Gson
import com.worldvisionsoft.kotlinbasicprojectsetup.data.DataManager
import dagger.Module
import dagger.Provides

@Module
class HomeActivityModule {

    @Provides
    internal fun provideLoginViewModel(dataManager: DataManager, gson: Gson): HomeViewModel {
        return HomeViewModel(dataManager, gson)
    }
}