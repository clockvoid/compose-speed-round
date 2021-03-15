package com.example.androiddevchallenge.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PrimaryTextField(
    state: MutableState<String>,
    modifier: Modifier = Modifier,
    label: @Composable () -> Unit
) {
    OutlinedTextField(
        value = state.value,
        onValueChange = { value -> state.value = value },
        label = label,
        textStyle = MaterialTheme.typography.body1,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
    )
}

@Preview("Light Theme")
@Composable
fun LightPrimaryTextFieldPreview() {
    val state = mutableStateOf("")

    MyTheme {
        Box(modifier = Modifier.background(color = MaterialTheme.colors.background)) {
            PrimaryTextField(state = state, modifier = Modifier.fillMaxWidth()) {
                Text("hello")
            }
        }
    }
}

@Preview("Dark Theme")
@Composable
fun DarkPrimaryTextFieldPreview() {
    val state = mutableStateOf("")

    MyTheme(darkTheme = true) {
        Box(modifier = Modifier.background(color = MaterialTheme.colors.background)) {
            PrimaryTextField(state = state, modifier = Modifier.fillMaxWidth()) {
                Text("hello")
            }
        }
    }
}
