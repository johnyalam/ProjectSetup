package com.hublet.projectsetup.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hublet.projectsetup.data.UserData

@Composable
fun UserListItem( user: UserData) {
    Card(modifier = Modifier.fillMaxWidth().padding(10.dp)){
        Column(modifier = Modifier.padding(10.dp)) {
            Text(text = user.userName)
            Spacer(Modifier.padding(10.dp))
            Text(text = user.userEmail)
            Spacer(Modifier.padding(10.dp))
            Text(text = user.userImage)
            Spacer(Modifier.padding(10.dp))
        }
    }
}