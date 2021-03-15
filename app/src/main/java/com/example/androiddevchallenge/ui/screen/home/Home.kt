package com.example.androiddevchallenge.ui.screen.home

import android.net.Uri
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.gardenListData
import com.example.androiddevchallenge.data.gardenThemeData
import com.example.androiddevchallenge.ui.component.GardenListItem
import com.example.androiddevchallenge.ui.component.PrimaryTextField
import com.example.androiddevchallenge.ui.component.ThemeCard
import com.example.androiddevchallenge.model.Garden
import com.example.androiddevchallenge.model.NavItems
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun Home() {
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(bottomBar = {
            BottomNavigation(
              backgroundColor = MaterialTheme.colors.primary,
              contentColor = MaterialTheme.colors.onPrimary
            ) {
                NavItems.values().forEach { navItem ->
                    BottomNavigationItem(
                        selected = navItem == NavItems.HOME,
                        onClick = {},
                        icon = {
                            Icon(
                                imageVector = ImageVector.Companion.vectorResource(
                                    id = navItem.iconRes
                                ),
                                contentDescription = null
                            )
                        },
                        label = { Text(text = navItem.label) }
                    )
                }
            }
        }) {
            LazyColumn(
                contentPadding = it
            ) {
                itemsIndexed(
                    listOf(Garden(imageUrl = Uri.EMPTY, name = "")) + gardenListData
                ) { index, garden ->
                    if (index == 0) {
                        HomeHeader()
                    } else {
                        GardenListItem(garden = garden)
                        Spacer(modifier = Modifier.size(8.dp))
                    }
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightHomePreview() {
    MyTheme {
        Home()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkHomePreview() {
    MyTheme(darkTheme = true) {
        Home()
    }
}
