package com.worldvisionsoft.kotlinbasicprojectsetup.di.component

import android.app.Application
import com.worldvisionsoft.kotlinbasicprojectsetup.KotlinBasicApp
import com.worldvisionsoft.kotlinbasicprojectsetup.di.builder.ActivityBuilder
import com.worldvisionsoft.kotlinbasicprojectsetup.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: KotlinBasicApp)
}