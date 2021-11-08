package com.light.notes.data.repository

import android.content.Context
import com.light.notes.data.database.UserStorage
import com.light.notes.data.database.model.User
import com.light.notes.domain.models.SaveUserName
import com.light.notes.domain.models.UserName
import com.light.notes.domain.repository.UserRepository


class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun saveName(param: SaveUserName): Boolean {
        val user = User(name = param.name)
        val result = userStorage.save(user)
        return result
    }

    override fun getName(): UserName {
        val user = userStorage.get()
        val userName = UserName(firstname = user.name)
        return userName
    }
}