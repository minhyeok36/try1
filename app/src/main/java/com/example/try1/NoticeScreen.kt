package com.example.try1

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)  // 추가된 부분
@Composable
fun NoticeScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        // 상단 바
        TopAppBar(
            title = { Text("공지사항", color = Color.Black) },
            navigationIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.hshpic), // 뒤로가기 아이콘
                    contentDescription = "Back",
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable { navController.popBackStack() }
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFFFEB3B)) // 노란색 배경
        )

        // 공지사항 리스트
        LazyColumn(modifier = Modifier.padding(16.dp)) {
            items(10) { index -> // 10개의 공지사항을 예시로 표시
                NoticeItem(
                    title = "개인정보 열람 및 수정에 대한 안내",
                    date = "2018. 03. 16. 13:30"
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }

        // 하단 네비게이션 바
        BottomNavigationBar(navController)
    }
}

@Composable
fun NoticeItem(title: String, date: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = title, fontSize = 16.sp, color = Color.Black)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = date, fontSize = 12.sp, color = Color.Gray)
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.hshpic),
            contentDescription = "Home",
            modifier = Modifier.clickable { navController.navigate("home") }
        )
        Icon(
            painter = painterResource(id = R.drawable.hshpic),
            contentDescription = "Notice",
            modifier = Modifier.clickable { navController.navigate("notice") }
        )
        Icon(
            painter = painterResource(id = R.drawable.hshpic),
            contentDescription = "Schedule",
            modifier = Modifier.clickable { navController.navigate("schedule") }
        )
        Icon(
            painter = painterResource(id = R.drawable.hshpic),
            contentDescription = "Map",
            modifier = Modifier.clickable { navController.navigate("map") }
        )
    }
}
