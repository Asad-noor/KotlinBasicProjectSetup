package com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.user.UserDao
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.user.User


@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
