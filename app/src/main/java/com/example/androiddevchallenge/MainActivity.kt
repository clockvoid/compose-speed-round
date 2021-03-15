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
package com.example.androiddevchallenge

import android.content.res.Resources.Theme
import android.os.Bundle
import android.util.TypedValue
import androidx.activity.compose.setContent
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.screen.Login
import com.example.androiddevchallenge.ui.screen.Welcome
import com.example.androiddevchallenge.ui.screen.home.Home
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "welcome") {
                    composable("welcome") {
                        val typedValue = TypedValue()
                        val theme: Theme = theme
                        theme.resolveAttribute(android.R.attr.windowBackground, typedValue, true)
                        @ColorInt val color = typedValue.data

                        window.decorView.setBackgroundColor(color)

                        Welcome(navController) {
                            theme.resolveAttribute(android.R.attr.colorBackground, typedValue, true)
                            @ColorInt val newColor = typedValue.data

                            window.decorView.setBackgroundColor(newColor)
                        }
                    }
                    composable("login") { Login(navController) }
                    composable("home") { Home() }
                }
            }
        }
    }
}
