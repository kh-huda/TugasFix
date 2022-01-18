package com.karimsinouh.coursemusic.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.painter.Painter

data class Course(
    @DrawableRes val cImage: Painter,
    val choice: String,
    val participant: String
)
