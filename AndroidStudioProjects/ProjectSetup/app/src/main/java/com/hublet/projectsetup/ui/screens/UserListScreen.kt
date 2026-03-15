package com.hublet.projectsetup.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.hublet.projectsetup.ui.component.UserListItem
import com.hublet.projectsetup.ui.viewmodel.UserListViewModel

@Composable
fun UserListScreen(
    onBackPressed: () -> Unit,
    viewModel: UserListViewModel = hiltViewModel()
) {
    val userListState by viewModel.users.collectAsState()
    Box(){
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier.fillMaxWidth()) {
                IconButton(
                    onClick = { onBackPressed() },
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                }
                Text(text = "User List", modifier = Modifier.align(Alignment.Center))
            }

            Spacer(Modifier.padding(10.dp))
            Button(onClick = {viewModel.getUsers()}){
                Text(text = "Get Users")
            }
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(userListState) { item ->
                    UserListItem(user = item)
                 }
            }
        }
    }
}