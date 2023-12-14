package com.example.myapplication

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun FirstPage(navController: NavController) {
    // Define your data
    val name = "John"
    val lastName = "Doe"

    // Navigate to the second page with data
    Button(onClick = {
        navController.navigate("secondPage/$name/$lastName")
    }) {
        Text(text = "first page btn")
        // Your button content
    }
}
