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
import com.example.androiddevchallenge.model.Garden

val gardenListData = listOf(
    Garden(
        imageUrl = Uri.parse("https://images.pexels.com/photos/3097770/pexels-photo-3097770.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Monstera"
    ),
    Garden(
        imageUrl = Uri.parse("https://images.pexels.com/photos/4751978/pexels-photo-4751978.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Aglaonema"
    ),
    Garden(
        imageUrl = Uri.parse("https://images.pexels.com/photos/4425201/pexels-photo-4425201.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Peace lily"
    ),
    Garden(
        imageUrl = Uri.parse("https://images.pexels.com/photos/6208087/pexels-photo-6208087.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Fiddle leaf tree"
    ),
    Garden(
        imageUrl = Uri.parse("https://images.pexels.com/photos/2123482/pexels-photo-2123482.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Snake planet"
    ),
    Garden(
        imageUrl = Uri.parse("https://images.pexels.com/photos/1084199/pexels-photo-1084199.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
        name = "Pathos"
    )
)
