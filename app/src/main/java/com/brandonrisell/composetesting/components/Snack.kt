package com.brandonrisell.composetesting.components

import androidx.compose.Composable
// import androidx.compose.composer
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.layout.Row
import androidx.ui.material.Button
import androidx.ui.material.themeTextStyle

@Composable
fun Snack(name :String) {
    val score = +state { 0 }

    val handleIncrement: () -> Unit = {
        score.value++
    }

    val handleDecrement: () -> Unit = {
        score.value--
    }

    Row {
        Text(text = name, style = +themeTextStyle { body1 })
        Button(text = "-", onClick = handleDecrement)
        Text(text = score.value.toString(), style = +themeTextStyle { body2 })
        Button(text = "+", onClick = handleIncrement)
    }
}