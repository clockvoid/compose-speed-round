package com.example.androiddevchallenge.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun Login() {
    val state = remember { mutableStateOf("") }

    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 184.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Log in with email",
                modifier = Modifier
                    .padding(bottom = 16.dp),
                style = MaterialTheme.typography.h1.copy(color = MaterialTheme.colors.onBackground)
            )
            OutlinedTextField(
                value = state.value,
                textStyle = MaterialTheme.typography.body1,
                singleLine = true,
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
                    .height(56.dp),
                onValueChange = { state.value = it },
                placeholder = {
                    Text(text = "Email address", style = MaterialTheme.typography.body1)
                }
            )
            OutlinedTextField(
                value = state.value,
                textStyle = MaterialTheme.typography.body1,
                singleLine = true,
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                onValueChange = { /*TODO*/ },
                placeholder = {
                    Text(text = "Password (8+ characters)", style = MaterialTheme.typography.body1)
                }
            )
            Row(modifier = Modifier.height(24.dp), verticalAlignment = Alignment.Bottom) {
                Text(text = "By clicking below, you agree to our ", style = MaterialTheme.typography.body2)
                Text(text = "Terms of Use", style = MaterialTheme.typography.body2)
                Text(text = " and consent", style = MaterialTheme.typography.body2)
            }
            Row(modifier = Modifier.padding(bottom = 16.dp)) {
                Text(text = "to our ", style = MaterialTheme.typography.body2)
                Text(text = "Privacy Policy", style = MaterialTheme.typography.body2)
            }
            Button(
                onClick = { /*TODO*/ },
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = MaterialTheme.colors.onSecondary
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
                    .height(48.dp),
                elevation = ButtonDefaults.elevation(defaultElevation = 0.dp)
            ) {
                Text(text = "Log in")
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightLoginPreview() {
    MyTheme {
        Login()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkLoginPreview() {
    MyTheme(darkTheme = true) {
        Login()
    }
}
