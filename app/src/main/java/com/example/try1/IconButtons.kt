package com.example.try1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun IconButtonSection() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        IconButtonItem(title = "학교홈", icon = R.drawable.jojik)
        IconButtonItem(title = "셔틀버스", icon = R.drawable.hshpic)
        IconButtonItem(title = "학사공지", icon = R.drawable.logos)
        IconButtonItem(title = "학사일정", icon = R.drawable.lplp)
        IconButtonItem(title = "캠퍼스맵", icon = R.drawable.rrrr)
    }
}

@Composable
fun IconButtonItem(title: String, icon: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(painter = painterResource(id = icon), contentDescription = null, modifier = Modifier.size(40.dp))
        Text(text = title)
    }
}
