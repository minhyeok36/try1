package com.example.try1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BannerAd() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(Color(0xFF1E88E5))
            .padding(16.dp)
    ) {
        Text(
            text = "A+ 받게 해드립니다.\n지금 바로 루튼으로 과제하고 과탑하기",
            color = Color.White,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
