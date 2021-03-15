package com.example.androiddevchallenge.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PrimaryButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        shape = MaterialTheme.shapes.medium,
        colors = buttonColors(
            backgroundColor = MaterialTheme.colors.secondary,
            contentColor = MaterialTheme.colors.onSecondary
        ),
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
    ) {
        Text(text = text, style = MaterialTheme.typography.button)
    }
}

@Preview("Light Theme")
@Composable
fun LightPrimaryButtonPreview() {
    MyTheme {
        PrimaryButton(text = "push me", onClick = {})
    }
}

@Preview("Dark Theme")
@Composable
fun DarkPrimaryButtonPreview() {
    MyTheme(darkTheme = true) {
        PrimaryButton(text = "push me", onClick = {})
    }
}
