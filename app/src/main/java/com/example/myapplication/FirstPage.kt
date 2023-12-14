package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun FirstPage(navController: NavController) {
    // Define your data
    val name = "John"
    val lastName = "Doe"
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally    ){
        Button(onClick = {
            navController.navigate("secondPage/$name/$lastName")
        }) {
            Text(text = "first page btn")
            // Your button content
        }
    }
    // Navigate to the second page with data

}
@Preview(showBackground = true)
@Composable
fun FirstPagePreview() {
    MyApplicationTheme {

    }
}
