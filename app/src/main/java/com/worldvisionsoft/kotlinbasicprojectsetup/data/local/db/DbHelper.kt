package com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db

import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.user.User

interface DbHelper {
    fun getUsers(userId: String) : List<User>
}