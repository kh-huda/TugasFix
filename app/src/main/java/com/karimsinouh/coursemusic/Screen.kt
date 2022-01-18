package com.karimsinouh.coursemusic

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route:String,
    @StringRes val title:Int,
    val icon:ImageVector,
){


    object Home: Screen("home", R.string.home, Icons.Rounded.Home)
    object Search: Screen("Search", R.string.search,Icons.Rounded.Search)
    object Favorites: Screen("favorites", R.string.favorites,Icons.Rounded.Favorite)
    object Profile: Screen("profile", R.string.profile,Icons.Rounded.Person)

}
