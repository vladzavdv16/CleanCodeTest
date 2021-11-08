package com.light.notes.cleancodetest.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.light.notes.domain.models.SaveUserName
import com.light.notes.domain.usecase.GetUserNameUseCase
import com.light.notes.domain.usecase.SaveUserNameUseCase

class MainViewModel(
    private val getUserNameUseCase: GetUserNameUseCase,
    private val saveUserNameUseCase: SaveUserNameUseCase,
) : ViewModel() {

    val _text = MutableLiveData<String>()

    val text: LiveData<String> = _text


    fun save(text: String) {
        val params = SaveUserName(name = text)
        val result = saveUserNameUseCase.execute(param = params)
        _text.value = "$result"
    }

    fun load(text: String) {
        val userName = getUserNameUseCase.execute()
        val result = userName.firstname
        _text.value = "$result"
    }
}