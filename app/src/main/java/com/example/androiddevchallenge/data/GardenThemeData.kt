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
package com.example.androiddevchallenge.data

import android.net.Uri
import com.example.androiddevchallenge.model.GardenTheme

val gardenThemeData = listOf(
    GardenTheme(
        imageUrl = Uri.parse("https://images.pexels.com/photos/2132227/pexels-photo-2132227.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Desert chic"
    ),
    GardenTheme(
        imageUrl = Uri.parse("https://images.pexels.com/photos/1400375/pexels-photo-1400375.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Tiny terrariums"
    ),
    GardenTheme(
        imageUrl = Uri.parse("https://images.pexels.com/photos/5699665/pexels-photo-5699665.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Jungle vibes"
    ),
    GardenTheme(
        imageUrl = Uri.parse("https://images.pexels.com/photos/6208086/pexels-photo-6208086.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Easy care"
    ),
    GardenTheme(
        imageUrl = Uri.parse("https://images.pexels.com/photos/3511755/pexels-photo-3511755.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Statements"
    ),
)
