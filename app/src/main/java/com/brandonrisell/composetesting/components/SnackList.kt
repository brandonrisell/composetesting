package com.brandonrisell.composetesting.components

import androidx.compose.Composable
// import androidx.compose.composer
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.material.Button

@Composable
fun SnackList() {
    val snackList = +state { arrayOf<String>() }
    val newSnackName = +state { "New Snack" }

//    val handleNameChange: () -> Unit = {
//        // TODO: Find/Create a text input and get new text onChange
//    }

    val handleButtonClick: () -> Unit = {
        snackList.value += newSnackName.value
    }

    Column {
        snackList.value.map { Snack(name = it) }
        Row {
            // TODO: Text input
            Button(text = "New Snack", onClick = handleButtonClick)
        }
    }
}