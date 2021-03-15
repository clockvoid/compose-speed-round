package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

enum class NavItems(@DrawableRes val iconRes: Int, val label: String) {
    HOME(R.drawable.ic_baseline_home_24, "Home"),
    FAVORITES(R.drawable.ic_baseline_favorite_border_24, "Favorites"),
    PROFILE(R.drawable.ic_baseline_account_circle_24, "Profile"),
    CART(R.drawable.ic_baseline_shopping_cart_24, "Cart");
}
