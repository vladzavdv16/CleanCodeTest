package com.light.notes.domain.usecase

import com.light.notes.domain.models.UserName
import com.light.notes.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}