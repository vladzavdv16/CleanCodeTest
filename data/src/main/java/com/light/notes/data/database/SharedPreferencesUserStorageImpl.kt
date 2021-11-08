package com.light.notes.data.database

import android.content.Context
import com.light.notes.data.database.model.User

private const val SHARED_PREFS_NAME = "shared_prefs_name"
private const val KEY_FIRST_NAME = "key_first_name"

class SharedPreferencesUserStorageImpl(private val context: Context) : UserStorage {

    private val sharedPreferences =
        context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun save(user: User): Boolean {
        sharedPreferences.edit().putString(KEY_FIRST_NAME, user.name).apply()
        return true
    }

    override fun get(): User {
        val firstname = sharedPreferences.getString(KEY_FIRST_NAME, "") ?: ""
        return User(name = firstname)
    }
}