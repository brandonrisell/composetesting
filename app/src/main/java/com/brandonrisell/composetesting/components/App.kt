package com.brandonrisell.composetesting.components

import androidx.compose.Composable
// import androidx.compose.composer
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme

@Composable
fun App() {
    MaterialTheme {
        Column {
            Header()
            SnackList()
        }
    }
}