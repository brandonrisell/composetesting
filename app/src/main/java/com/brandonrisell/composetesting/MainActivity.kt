package com.brandonrisell.composetesting

import android.app.Activity
import android.os.Bundle
//import androidx.ui.core.CraneWrapper
//import androidx.compose.composer
import androidx.ui.core.setContent
import com.brandonrisell.composetesting.components.App

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { App() }
    }

//    @Composable
//    fun MyApp() {
//        MaterialTheme { Counter() }
//    }
//
//    @Composable
//    fun Counter() {
//        val amount = +state { 0 }
//
//        Column {
//            Text(text = "Counter demo")
//            Button(text = "Add", onClick = { amount.value++ })
//            Button(text = "Subtract", onClick = { amount.value-- })
//            Text(text = "Clicks: ${amount.value}")
//        }
//    }
}
