package com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db

import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.user.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDbHelper @Inject
constructor(val appDatabase: AppDatabase) : DbHelper {

    override fun getUsers(userId: String): List<User> = appDatabase.userDao().loadAll()
}