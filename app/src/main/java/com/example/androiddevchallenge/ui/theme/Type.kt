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
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R

// Set of Material typography styles to start with
val typography = Typography(
    h1 = TextStyle(
        fontFamily = Font(resId = R.font.nunito_sans_bold).toFontFamily(),
        fontSize = 18.sp
    ),
    h2 = TextStyle(
        fontFamily = Font(resId = R.font.nunito_sans_bold).toFontFamily(),
        fontSize = 14.sp,
        letterSpacing = 0.15.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = Font(resId = R.font.nunito_sans_light).toFontFamily(),
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = Font(resId = R.font.nunito_sans_light).toFontFamily(),
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = Font(resId = R.font.nunito_sans_light).toFontFamily(),
        fontSize = 12.sp
    ),
    button = TextStyle(
        fontFamily = Font(resId = R.font.nunito_sans_semi_bold).toFontFamily(),
        fontSize = 14.sp,
        letterSpacing = 1.sp
    ),
    caption = TextStyle(
        fontFamily = Font(resId = R.font.nunito_sans_semi_bold).toFontFamily(),
        fontSize = 12.sp
    )
)
