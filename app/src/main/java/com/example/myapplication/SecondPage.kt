package com.example.myapplication
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
//import androidx.navigation.compose.navArgument

@Composable
fun SecondPage(navController: NavController, name: String, lastName: String) {
    // Use the received data in your UI
    // ...

    // Navigate back to the first page if needed
    Button(onClick = { navController.popBackStack() }) {
        // Your button content
        Text(text = "second page btn")

    }
}

