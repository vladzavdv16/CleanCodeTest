package com.light.notes.domain.repository

import com.light.notes.domain.models.SaveUserName
import com.light.notes.domain.models.UserName

interface UserRepository {

    fun saveName(param: SaveUserName): Boolean

    fun getName(): UserName
}