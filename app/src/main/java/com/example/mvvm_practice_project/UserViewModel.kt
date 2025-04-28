package com.example.mvvm_practice_project

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> get() = _user

    init {
        loadUser()
    }

    private fun loadUser() {
        _user.value = User(
            name = "Hamza Saghir",
            age = 21,
            email = "hamza@example.com"
        )
    }

    fun updateUser() {
        _user.value = User(
            name = "Suffian",
            age = 22,
            email = "suffian@example.com"
        )
    }
}
