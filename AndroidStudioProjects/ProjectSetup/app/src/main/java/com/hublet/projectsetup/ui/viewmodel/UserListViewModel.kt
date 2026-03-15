package com.hublet.projectsetup.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.hublet.projectsetup.data.UserData
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow

@HiltViewModel
class UserListViewModel @Inject constructor() : ViewModel() {
    val userList = MutableStateFlow<List<UserData>>(emptyList())
    val users = userList

    fun getUsers() {
        userList.apply {
            this.value = listOf(
                UserData("Jane Alam", "j@gmail.com", "https://picsum.photos/200"),
                UserData("Jawad", "jawad@gmail.com", "https://picsum.photos/200"),
                UserData("Marzia", "m@gmail.com", "https://picsum.photos/200"),
                UserData("Muntaha", "m@gmail.com", "https://picsum.photos/200"),
                UserData("Ahmed", "a@gmail.com", "https://picsum.photos/200"),

                UserData("Jane Alam", "j@gmail.com", "https://picsum.photos/200"),
                UserData("Jawad", "jawad@gmail.com", "https://picsum.photos/200"),
                UserData("Marzia", "m@gmail.com", "https://picsum.photos/200"),
                UserData("Muntaha", "m@gmail.com", "https://picsum.photos/200"),
                UserData("Ahmed", "a@gmail.com", "https://picsum.photos/200"),

                UserData("Jane Alam", "j@gmail.com", "https://picsum.photos/200"),
                UserData("Jawad", "jawad@gmail.com", "https://picsum.photos/200"),
                UserData("Marzia", "m@gmail.com", "https://picsum.photos/200"),
                UserData("Muntaha", "m@gmail.com", "https://picsum.photos/200"),
                UserData("Ahmed", "a@gmail.com", "https://picsum.photos/200")

            )
        }
    }
}