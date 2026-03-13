package com.hublet.projectsetup.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(onBackPressed: () -> Unit) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf(value = "") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(modifier = Modifier.fillMaxWidth()) {
            IconButton(
                onClick = { onBackPressed() },
            ) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
            }
            Text(text = "Login Screen", modifier = Modifier.align(Alignment.Center))
        }

        Spacer(modifier = Modifier.weight(1f))

        OutlinedTextField(
            label = { Text(text = "Email") },
            value = email,
            onValueChange = {})
        Spacer(modifier = Modifier.padding(5.dp))
        OutlinedTextField(
            label = { Text(text = "Password") },
            value = password, onValueChange = {})

        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = {}) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
