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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.androiddevchallenge.model.Garden
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun GardenListItem(garden: Garden) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxWidth()
    ) {
        ConstraintLayout(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)) {
            val (image, name, description, checkBox, line) = createRefs()

            CoilImage(
                data = garden.imageUrl,
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .clip(MaterialTheme.shapes.small)
                    .height(64.dp)
                    .width(64.dp)
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                    }
            )

            Text(
                text = garden.name,
                style = MaterialTheme.typography.h2,
                modifier = Modifier
                    .constrainAs(name) {
                        start.linkTo(image.end, 16.dp)
                    }
                    .paddingFromBaseline(top = 24.dp)
            )

            Text(
                text = garden.description,
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .constrainAs(description) {
                        start.linkTo(image.end, 16.dp)
                        top.linkTo(name.bottom)
                    }
                    .paddingFromBaseline(bottom = 24.dp)
            )

            Checkbox(
                checked = false,
                onCheckedChange = { },
                modifier = Modifier.constrainAs(checkBox) {
                    top.linkTo(image.top)
                    bottom.linkTo(image.bottom)
                    end.linkTo(parent.end)
                }
            )

            Divider(
                color = MaterialTheme.colors.onBackground,
                thickness = 1.dp,
                modifier = Modifier
                    .constrainAs(line) {
                        bottom.linkTo(image.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    .padding(start = 72.dp)
            )
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightGardenListItemPreview() {
    val sampleGarden = Garden(
        imageUrl = Uri.EMPTY,
        name = "Sample"
    )

    MyTheme {
        GardenListItem(sampleGarden)
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkGardenListItemPreview() {
    val sampleGarden = Garden(
        imageUrl = Uri.EMPTY,
        name = "Sample"
    )

    MyTheme(darkTheme = true) {
        GardenListItem(sampleGarden)
    }
}
