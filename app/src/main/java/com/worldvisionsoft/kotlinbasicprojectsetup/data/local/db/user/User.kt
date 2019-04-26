package com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
class User {

    @ColumnInfo(name = "created_at")
    var createdAt: String? = null

    @PrimaryKey
    var id: Long? = null

    var name: String? = null

    @ColumnInfo(name = "updated_at")
    var updatedAt: String? = null
}
