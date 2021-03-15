package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.component.PrimaryButton
import com.example.androiddevchallenge.ui.component.PrimaryTextField
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun Login(navController: NavController) {
    val state = remember { mutableStateOf("") }

    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Log in with email",
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier
                    .paddingFromBaseline(top = 184.dp)
                    .padding(bottom = 16.dp),
                style = MaterialTheme.typography.h1
            )

            PrimaryTextField(state = state, label = {
                Text(text = "Email address", style = MaterialTheme.typography.body2)
            }, modifier = Modifier.padding(bottom = 8.dp))

            PrimaryTextField(state = state, label = {
                Text(text = "Password (8+ characters)", style = MaterialTheme.typography.body2)
            })

            Row(modifier = Modifier.paddingFromBaseline(top = 24.dp)) {
                Text(
                    text = "By clicking below, you agree to our ",
                    style = MaterialTheme.typography.body2
                )

                Text(
                    text = "Terms of Use",
                    style = MaterialTheme.typography.body2,
                    textDecoration = TextDecoration.Underline
                )

                Text(text = " and consent", style = MaterialTheme.typography.body2)
            }

            Row(modifier = Modifier.paddingFromBaseline(bottom = 16.dp)) {
                Text(text = "to our ", style = MaterialTheme.typography.body2)

                Text(
                    text = "Privacy Policy",
                    style = MaterialTheme.typography.body2,
                    textDecoration = TextDecoration.Underline
                )
            }

            PrimaryButton(text = "Log in", onClick = { navController.navigate("home") })
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightLoginPreview() {
    MyTheme {
        Login(rememberNavController())
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkLoginPreview() {
    MyTheme(darkTheme = true) {
        Login(rememberNavController())
    }
}
