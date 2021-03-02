package com.example.androiddevchallenge.welcomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R

@Composable
fun HomePage(navController: NavController)
{
    BottomView(navController)
    TopView()
}
@Composable
fun BottomView(navController: NavController) {
    Surface(color = Color(0xff4e3d77), modifier = Modifier.fillMaxSize()) {
        Column(
            verticalArrangement = Arrangement.Bottom,
//            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                TextButton(onClick = {navController.navigate("goToDoggoListPage")}) {
                    Text(text = "Skip", color = Color.White)

                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextButton(onClick = {navController.navigate("goToDoggoListPage")}) {
                        Text(text = "Next", color = Color.White)
                        Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                    }
                }
            }

        }
    }
}


@Composable
fun TopView() {
    Surface(color = Color(0xBF53CE64), modifier = Modifier
        .requiredHeight(400.dp)
        .fillMaxWidth(),
        shape = RoundedCornerShape(60.dp).copy(ZeroCornerSize,  ZeroCornerSize)) {
        Column(modifier = Modifier.padding(16.dp)
        ) {
            Spacer(modifier = Modifier.padding(vertical = 12.dp))

            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription =null,
                modifier = Modifier
                    .padding(start = 110.dp, top = 40.dp)
                    .requiredHeight(100.dp)
            )
            Text(
                text = "Dog Adoption",
                color= Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Default,
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                modifier = Modifier.padding(top=5.dp,start = 50.dp)
            )

            Text(
                text = "because you will save a life",
                color= Color.White,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Cursive,
                textAlign = TextAlign.Center,
                fontSize = 22.sp,
                modifier = Modifier.padding(top =0.dp,start = 65.dp)
            )

        }
    }
}