package com.karimsinouh.coursemusic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.karimsinouh.coursemusic.ui.theme.BottomNavigationIconsTheme
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.karimsinouh.coursemusic.ui.customComposables.CustomBottomNavigation
import com.karimsinouh.coursemusic.ui.screen.CourseLI
import com.karimsinouh.coursemusic.ui.theme.LightBackground

class MainActivity : ComponentActivity() {


    private val currentRoute= mutableStateOf(Screen.Home.route)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationIconsTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White)
                ) {
                    CourseLI()
                }
                    Scaffold(
                        bottomBar = {
                            CustomBottomNavigation(
                                selectedRoute = currentRoute.value,
                                onItemSelected = {
                                    currentRoute.value=it.route
                                }
                            )
                        },
                        backgroundColor = MaterialTheme.colors.primary,
                        contentColor = MaterialTheme.colors.onSurface
                    ) {


                    }
                    window.statusBarColor=MaterialTheme.colors.primary.toArgb()

                }

            }
        }
    }

    private fun Image(painterResource: Painter) {

    }


