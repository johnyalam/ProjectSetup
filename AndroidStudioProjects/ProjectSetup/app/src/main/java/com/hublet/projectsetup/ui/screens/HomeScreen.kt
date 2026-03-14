package com.hublet.projectsetup.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.hublet.projectsetup.ui.viewmodel.HomeViewModel

@Composable
fun HomeScreen(onLoginClicked: ()-> Unit,
               onRegisterClicked: ()-> Unit,
               viewModel: HomeViewModel = hiltViewModel()){
    Box(modifier = Modifier.background(Color.White)){
        Column(modifier = Modifier.fillMaxSize()
            .padding(15.dp)
            .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            Text(text = "Home Screen")
            Spacer(modifier = Modifier.weight(1f))
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                Button(onClick = {
                    //navigate to login screen
                    onLoginClicked()
                }) {
                    Text(text= "Login")
                }
                Button(onClick = {
                    // navigate to registration screen
                    onRegisterClicked()
                }) {
                    Text(text = "Register")
                }
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}