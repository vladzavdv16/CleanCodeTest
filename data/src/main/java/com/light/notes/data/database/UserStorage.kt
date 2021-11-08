package com.light.notes.data.database

import com.light.notes.data.database.model.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}