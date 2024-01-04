package com.kenruizinoue.userratingbarcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                // 1. Rating State
                val ratingState = remember { mutableIntStateOf(0) }
                UserRatingBar(
                    // 2. Customized UserRatingBar
                    ratingState = ratingState,
                    ratingIconPainter = painterResource(id = R.drawable.ic_star_2),
                    size = 48.dp,
                    selectedColor = Color(0xFF5A966E),
                )
                // 3. Current Selected Value Feedback
                Text(
                    text = "Current Rating Bar Value: ${ratingState.intValue}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
        }
    }
}