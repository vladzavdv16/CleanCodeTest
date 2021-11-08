package com.light.notes.cleancodetest.di

import com.light.notes.domain.usecase.GetUserNameUseCase
import com.light.notes.domain.usecase.SaveUserNameUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<SaveUserNameUseCase> {
        SaveUserNameUseCase(userRepository = get())
    }

    factory<GetUserNameUseCase> {
        GetUserNameUseCase(userRepository = get())
    }
}