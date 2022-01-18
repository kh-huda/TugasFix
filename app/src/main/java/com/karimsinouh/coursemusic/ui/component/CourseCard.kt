package com.karimsinouh.coursemusic.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.karimsinouh.coursemusic.data.Course

@Composable
fun CourseCard(item : Course){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    )  {
        Row() {
            Card(
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(15.dp)),
                shape = RectangleShape,
                elevation = 2.dp
            ) {
                item.cImage
            }
            Column(modifier = Modifier.padding(20.dp)) {
                Text(
                    text = item.choice,
                    color = Color.Red,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(0.dp))
                Text(item.participant)
            }
        }
    }
}