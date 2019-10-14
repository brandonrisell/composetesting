# composetesting
Playing around with Jetpack Compose!

TODO: Put more useful information here

The meat of this is here:

Activity:

```kotlin
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { App() }
    }
}
```

Compose component:

```kotlin
@Composable
fun SnackList() {
    val snackList = +state { arrayOf<String>() }
    val newSnackName = +state { "New Snack" }

    val handleButtonClick: () -> Unit = {
        snackList.value += newSnackName.value
    }

    Column {
        snackList.value.map { Snack(name = it) }
        Row {
            Button(text = "New Snack", onClick = handleButtonClick)
        }
    }
}
```
