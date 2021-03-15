/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.pink900
import com.example.androiddevchallenge.ui.theme.white

@Composable
fun Welcome(navController: NavController, changeWindowBackground: () -> Unit) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.fillMaxHeight()
    ) {
        Image(
            imageVector = ImageVector.Companion.vectorResource(
                id = if (MaterialTheme.colors.isLight) R.drawable.ic_light_welcome_bg
                else R.drawable.ic_dark_welcome_bg
            ),
            contentDescription = null
        )

        Column {
            Image(
                imageVector = ImageVector.Companion.vectorResource(
                    id = if (MaterialTheme.colors.isLight) R.drawable.ic_light_welcome_illos
                    else R.drawable.ic_dark_welcome_illos
                ),
                contentDescription = null,
                modifier = Modifier.padding(top = 72.dp, start = 88.dp, bottom = 48.dp)
            )

            Image(
                imageVector = ImageVector.Companion.vectorResource(
                    id = if (MaterialTheme.colors.isLight) R.drawable.ic_light_logo
                    else R.drawable.ic_dark_logo
                ),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = "Beautiful home garden solutions",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
                    .paddingFromBaseline(top = 32.dp, bottom = 40.dp),
                style = MaterialTheme.typography.subtitle1.copy(color = MaterialTheme.colors.onBackground),
            )

            Button(
                onClick = { },
                shape = MaterialTheme.shapes.medium,
                colors = buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = MaterialTheme.colors.onSecondary
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp, start = 16.dp, end = 16.dp)
                    .height(48.dp),
                elevation = ButtonDefaults.elevation(defaultElevation = 0.dp)
            ) {
                Text(text = "Create account")
            }

            Button(
                onClick = {
                    changeWindowBackground()
                    navController.navigate("login")
                },
                colors = ButtonDefaults.textButtonColors(
                    contentColor = if (MaterialTheme.colors.isLight) pink900
                    else white
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp
                )
            ) {
                Text(
                    text = "Log in",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.button
                )
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightWelcomePreview() {
    MyTheme {
        Welcome(rememberNavController()) {}
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkWelcomePreview() {
    MyTheme(darkTheme = true) {
        Welcome(rememberNavController()) {}
    }
}
