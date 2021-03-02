package com.example.androiddevchallenge.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.dataModel.Doggo


@Composable
fun DoggoListView(doggo: Doggo, navController: NavController, index:String)
{
    Card(
        backgroundColor = Color(0xFF53CE64),
        shape = RoundedCornerShape(topStart = 20.dp,bottomEnd = 20.dp),
        modifier = Modifier
            .padding(5.dp)
            .clickable { navController.navigate("doggoDetailPage/${index}") }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        )
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, end = 20.dp, bottom = 10.dp)

        ) {
            Image(
                painter = painterResource(doggo.image),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .background(color = Color.Transparent)
                    .padding(start = 5.dp, end = 5.dp)
                    .clip(shape = CircleShape)
                    .border(5.dp, color = Color(0xFFEF6C00), shape = CircleShape)

            )
        }
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            Text(
                text = doggo.name,
                modifier = Modifier.padding(start = 10.dp,top = 10.dp),
                style = MaterialTheme.typography.caption.copy(
                    fontSize = 30.sp,
                    color = Color.Black
                )
            )
            Row(
                modifier = Modifier
                    .height(20.dp)
                    .padding(top = 4.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dog_likes),
                    contentDescription = null,
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                        .padding(start = 6.dp, end = 2.dp)
                )

                Text(
                    text = doggo.breed,
                    modifier = Modifier
                        .padding(start = 4.dp)
                        .height(25.dp),
                    style = LocalTextStyle.current.copy(
                        fontSize = 12.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )
            }


            Row {
                Card(
                    backgroundColor = Color.Black,
                    modifier = Modifier
                        .requiredWidth(80.dp)
                        .padding(start = 10.dp, end = 10.dp, top = 20.dp)
                        .height(25.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.dog_gender_2),
                        contentDescription = null,
                        modifier = Modifier
                            .requiredWidth(40.dp)
                            .padding(start = 10.dp, end = 10.dp)
                            .height(15.dp)
                    ) }

                Card(
                    backgroundColor = Color.Black,
                    modifier = Modifier
                        .requiredWidth(80.dp)
                        .padding(start = 10.dp, end = 10.dp, top = 20.dp)
                        .height(25.dp)
                ) {
                    Image(
                        painter = painterResource(id =R.drawable.dog_color),
                        contentDescription = null,
                        modifier = Modifier
                            .requiredWidth(40.dp)
                            .padding(start = 10.dp, end = 10.dp)
                            .height(15.dp)
                    ) }
                Card(
                    backgroundColor = Color.Black,
                    modifier = Modifier
                        .requiredWidth(80.dp)
                        .padding(start = 10.dp, end = 10.dp, top = 20.dp)
                        .height(25.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.dog_age),
                        contentDescription = null,
                        modifier = Modifier
                            .requiredWidth(40.dp)
                            .padding(start = 10.dp, end = 10.dp)
                            .height(15.dp)
                    ) }
            }

            Spacer(Modifier.requiredHeight(5.dp))

            Row {
                Card(
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .requiredWidth(80.dp)
                        .padding(start = 10.dp, end = 10.dp)
                        .height(25.dp)
                ) {
                    Text(
                        text = doggo.age.toString(),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp)
                            .fillMaxHeight(),
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Card(
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .requiredWidth(80.dp)
                        .padding(start = 10.dp, end = 10.dp)
                        .height(25.dp)
                ) {
                    Text(
                        text = doggo.color,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp)
                            .fillMaxHeight(),
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold                        )
                }

                Card(
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .requiredWidth(80.dp)
                        .padding(start = 10.dp, end = 10.dp)
                        .height(25.dp)
                ) {
                    Text(
                        text = doggo.gender,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp)
                            .fillMaxHeight(),
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}
fun Row(verticalAlignment: Alignment.Vertical, modifier: Modifier) {

}



