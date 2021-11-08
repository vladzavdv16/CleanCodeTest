package com.light.notes.cleancodetest.di

import com.light.notes.data.database.SharedPreferencesUserStorageImpl
import com.light.notes.data.database.UserStorage
import com.light.notes.data.repository.UserRepositoryImpl
import com.light.notes.domain.repository.UserRepository
import org.koin.dsl.module


val dataModule = module {

    single<UserStorage> {
        SharedPreferencesUserStorageImpl(context = get())
    }

    single<UserRepository> {
        UserRepositoryImpl(userStorage = get())
    }
}