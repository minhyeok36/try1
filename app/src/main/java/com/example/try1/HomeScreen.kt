package com.example.try1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // 카드 아이템 섹션
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            CardItem(
                title = "에타문학생의 주인공은?",
                subtitle = "시험기간만 되면 작가가 되는 나✍🏻"
            )
            Spacer(modifier = Modifier.width(16.dp))
            CardItem(
                title = "중간고사.. 나만 어려웠나?",
                subtitle = "실시간 시험 후기를 찾아보세요"
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // 아이콘 버튼 섹션
        IconButtonSection(navController)

        Spacer(modifier = Modifier.height(16.dp))

        // 배너 광고
        BannerAd()

        Spacer(modifier = Modifier.height(16.dp))

        // 즐겨찾는 게시판 섹션
        CommunityBoardSection(navController)
    }
}

// 각 아이콘 버튼이 네비게이션을 통해 다른 페이지로 이동할 수 있도록 수정
@Composable
fun IconButtonSection(navController: NavController) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(onClick = { navController.navigate("details/1") }) {
            Text(text = "학교홈")
        }
        Button(onClick = { navController.navigate("details/2") }) {
            Text(text = "셔틀버스")
        }
        Button(onClick = { navController.navigate("details/3") }) {
            Text(text = "학사공지")
        }
        Button(onClick = { navController.navigate("details/4") }) {
            Text(text = "학사일정")
        }
        Button(onClick = { navController.navigate("details/5") }) {
            Text(text = "캠퍼스맵")
        }
        Button(onClick = { navController.navigate("details/6") }) {
            Text(text = "도서관")
        }
    }
}

// 즐겨찾는 게시판도 버튼을 눌렀을 때 다른 페이지로 이동
@Composable
fun CommunityBoardSection(navController: NavController) {
    Column {
        Text(text = "즐겨찾는 게시판")

        Button(onClick = { navController.navigate("details/7") }) {
            Text(text = "춘천캠 자유 게시판")
        }

        Button(onClick = { navController.navigate("details/8") }) {
            Text(text = "비밀게시판")
        }

        Button(onClick = { navController.navigate("details/9") }) {
            Text(text = "졸업생 게시판")
        }

        // 다른 게시판들도 추가 가능
    }
}
