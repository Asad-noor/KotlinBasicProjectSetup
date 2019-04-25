package com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.user.UserDao
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.user.User


@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
