package com.brandonrisell.composetesting.components

import androidx.compose.Composable
// import androidx.compose.composer
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.material.themeTextStyle

@Composable
fun Header() {
    Text(text = "Snack Review!", style = +themeTextStyle { h3 })
}