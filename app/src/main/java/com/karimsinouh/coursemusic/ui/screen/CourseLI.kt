package com.karimsinouh.coursemusic.ui.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.karimsinouh.coursemusic.R
import com.karimsinouh.coursemusic.data.Course
import com.karimsinouh.coursemusic.ui.component.CourseCard

@Composable
fun CourseLI(){
    val mcourse = listOf(
        Course(cImage = painterResource(R.drawable.gtr) , choice = "Gitar", participant = "34"),
        Course(cImage = painterResource(R.drawable.mic), choice = "Vocal", participant = "24"),
        Course(cImage = painterResource(R.drawable.sxp), choice = "Saxophone", participant = "18"),
        Course(cImage = painterResource(R.drawable.drm), choice = "Drum", participant = "20")
    )
    LazyColumn {
        items(mcourse) { course ->
            CourseCard(item = course)
        }
    }
}