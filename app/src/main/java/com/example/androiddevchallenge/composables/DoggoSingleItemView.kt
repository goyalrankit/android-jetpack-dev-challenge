package com.example.androiddevchallenge.composables

import android.util.Log
import android.widget.Toast
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.dataModel.Doggo
import com.example.androiddevchallenge.dataModel.doggoList


@ExperimentalAnimationApi
@Composable
fun DoggoSingleItemView(index:String,navController: NavController)
{
    val doggo = doggoList[index.toInt()]

    Log.d("TAG", "DoggoInfo: "+ doggo.likes + doggo.breed)

    NavGraph(navController,doggo)

}

@Composable
fun NavGraph(navController:NavController,doggo:Doggo)
{
    BottomView(navController, doggo)
    TopView(doggo)
}
@Composable
fun BottomView(navController: NavController,doggo: Doggo) {
    Surface(color = Color(0xff4e3d77), modifier = Modifier.fillMaxSize()) {
        Column(
            verticalArrangement = Arrangement.Bottom,
        ) {
            Row()
            {
                Text(
                    text = "Name",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Default,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(top = 0.dp, start = 25.dp)
                )
                Text(
                    text = doggo.name,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 25.dp)
                )
            }

            Row()
            {
                Text(
                    text = "Breed",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Default,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(top = 0.dp, start = 25.dp)
                )
                Text(
                    text = doggo.breed,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 25.dp)
                )
            }

            Row()
            {
                Text(
                    text = "Age",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Default,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(top = 0.dp, start = 25.dp)
                )
                Text(
                    text = doggo.age.toString(),
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 35.dp)
                )
            }

            Row()
            {
                Text(
                    text = "Gender",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Default,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(top = 0.dp, start = 25.dp)
                )
                Text(
                    text = doggo.gender,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 25.dp)
                )
            }

            Row()
            {
                Text(
                    text = "Likes",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Default,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(top = 0.dp, start = 25.dp)
                )
                Text(
                    text = doggo.likes,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 25.dp)
                )
            }

            Row()
            {
                Text(
                    text = "Hair Color",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Default,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(top = 0.dp, start = 25.dp)
                )
                Text(
                    text = doggo.color,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 25.dp)
                )
            }
            Row()
            {
                Text(
                    text = "Allergies",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Default,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(top = 0.dp, start = 25.dp)
                )
                Text(
                    text = doggo.allergies,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 35.dp)
                )
            }

            Row()
            {
                Text(
                    text = "Special Care",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Default,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(top = 0.dp, start = 25.dp)
                )
                Text(
                    text = doggo.specialTreatment,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Cursive,
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 25.dp)

                )
            }



            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                val context = LocalContext.current
                TextButton(onClick = {navController.navigate("goToDoggoListPage")}) {
                    Text(text = "Go Back", color = Color.White)

                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TextButton(onClick =
                    { Toast.makeText(context,"Adoption Details are mailed to you. THANK YOU..!!",
                            Toast.LENGTH_LONG).show()
                    }
                    ) {
                        Text(text = "Adopt Me",
                            color = Color.White,
                            fontWeight = FontWeight.ExtraBold,
                            textDecoration = TextDecoration.Underline,
                        )
                        Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                    }
                }
            }

        }
    }
}



@Composable
fun TopView(doggo:Doggo) {
    Surface(color = Color(0xFFEF6C00), modifier = Modifier
        .requiredHeight(200.dp)
        .fillMaxWidth(),
        shape = RoundedCornerShape(60.dp).copy(ZeroCornerSize,  ZeroCornerSize)) {
        Column(modifier = Modifier.padding(16.dp)
        ) {
            Spacer(modifier = Modifier.padding(vertical = 12.dp))

            Image(
                painter = painterResource(doggo.image),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(180.dp)
                    .height(180.dp)
                    .background(color = Color.Transparent)
                    .padding(start = 25.dp, end = 5.dp)
                    .clip(shape = CircleShape)
                    .border(5.dp, color = Color(0xFFEF6C00), shape = CircleShape)


//                painter = painterResource(id = doggo.image),
//                contentDescription =null,
//                modifier = Modifier
//                    .padding(start = 10.dp, top = 10.dp,end = 10.dp)
//                    .requiredHeight(100.dp)
//                    .fillMaxWidth()
            )
        }
    }
}