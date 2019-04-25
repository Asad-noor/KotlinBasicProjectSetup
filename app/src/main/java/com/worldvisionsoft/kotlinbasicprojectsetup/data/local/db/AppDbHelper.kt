package com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db

import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.user.User
import javax.inject.Inject


class AppDbHelper constructor(@Inject val appDatabase: AppDatabase): DbHelper {

    override fun getUsers(userId: String): List<User> = appDatabase.userDao().loadAll()
}