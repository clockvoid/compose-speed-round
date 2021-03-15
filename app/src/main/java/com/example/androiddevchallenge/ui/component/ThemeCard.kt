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

import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.GardenTheme
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun ThemeCard(theme: GardenTheme) {
    Card(
        shape = MaterialTheme.shapes.small,
        backgroundColor = MaterialTheme.colors.surface.compositeOver(MaterialTheme.colors.background),
        modifier = Modifier
            .height(136.dp)
            .width(144.dp)
            .padding(1.dp)
    ) {
        Column {
            CoilImage(
                data = theme.imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(96.dp)
            )

            Text(
                text = theme.name,
                modifier = Modifier
                    .height(40.dp)
                    .paddingFromBaseline(top = 24.dp)
                    .padding(start = 16.dp),
                style = MaterialTheme.typography.h2.copy(color = MaterialTheme.colors.onSurface)
            )
        }
    }
}

@Preview("Light Theme")
@Composable
fun LightThemePreview() {
    val sampleTheme = GardenTheme(
        imageUrl = Uri.EMPTY,
        name = "sample"
    )

    MyTheme {
        Box(modifier = Modifier.background(color = MaterialTheme.colors.background)) {
            ThemeCard(sampleTheme)
        }
    }
}

@Preview("Dark Theme")
@Composable
fun DarkThemePreview() {
    val sampleTheme = GardenTheme(
        imageUrl = Uri.EMPTY,
        name = "sample"
    )

    MyTheme(darkTheme = true) {
        Box(modifier = Modifier.background(color = MaterialTheme.colors.background)) {
            ThemeCard(sampleTheme)
        }
    }
}
