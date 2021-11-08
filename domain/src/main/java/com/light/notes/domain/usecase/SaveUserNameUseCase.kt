package com.light.notes.domain.usecase

import com.light.notes.domain.models.SaveUserName
import com.light.notes.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserName): Boolean {
        return userRepository.saveName(param = param)
    }
}