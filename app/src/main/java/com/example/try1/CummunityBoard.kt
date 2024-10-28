package com.example.try1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CommunityBoardSection() {
    Column {
        Text(text = "즐겨찾는 게시판", style = MaterialTheme.typography.titleLarge)
        // 게시글 예시
        CommunityPost(title = "춘천캠 자유 게시판", description = "코피어싱 해본 사람 있어?")
        CommunityPost(title = "비밀게시판", description = "심심한 사람?")
        // 추가 게시글
    }
}

@Composable
fun CommunityPost(title: String, description: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(text = title, style = MaterialTheme.typography.bodyLarge)
            Text(text = description, style = MaterialTheme.typography.bodySmall)
        }
        // "N" New 표시 아이콘
        Text(text = "N", color = Color.Red)
    }
}

