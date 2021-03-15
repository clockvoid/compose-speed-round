package com.example.androiddevchallenge.ui.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
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
import com.example.androiddevchallenge.data.gardenThemeData
import com.example.androiddevchallenge.ui.component.PrimaryTextField
import com.example.androiddevchallenge.ui.component.ThemeCard
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun HomeHeader() {
    val state = remember { mutableStateOf("") }

    PrimaryTextField(
        state = state,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        label = {
            Row {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_baseline_search_24),
                    contentDescription = null,
                    modifier = Modifier.height(18.dp)
                )
                Text(text = "Search", style = MaterialTheme.typography.body1)
            }
        }
    )
    Text(
        text = "Browse themes",
        style = MaterialTheme.typography.h1,
        modifier = Modifier
            .paddingFromBaseline(top = 32.dp, bottom = 16.dp)
            .padding(start = 16.dp, end = 16.dp)
    )
    LazyRow(
        content = {
            items(gardenThemeData) { theme ->
                ThemeCard(theme = theme)
                Spacer(modifier = Modifier.size(size = 8.dp))
            }
        },
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp)
    )
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    ) {
        val (text, icon) = createRefs()

        Text(
            text = "Design your home garden",
            style = MaterialTheme.typography.h1,
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 16.dp)
                .constrainAs(text) {}
        )
        Icon(
            imageVector = ImageVector.vectorResource(
                id = R.drawable.ic_baseline_filter_list_24
            ),
            contentDescription = null,
            modifier = Modifier.constrainAs(icon) {
                top.linkTo(text.top)
                bottom.linkTo(text.bottom)
                end.linkTo(parent.end)
            }
        )
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightHomeHeaderPreview() {
    MyTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column {
                HomeHeader()
            }
        }
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkHomeHeaderPreview() {
    MyTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colors.background) {
            Column {
                HomeHeader()
            }
        }
    }
}
