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
        maxLines = 1,
        singleLine = true,
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
