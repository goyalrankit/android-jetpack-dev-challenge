package com.example.androiddevchallenge.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.dataModel.doggoList

@Composable
fun DoggoNavigation(navController: NavController)
{
    DoggoSingleList(navController)
}



@Composable
fun DoggoSingleList(navController: NavController)
{
    LazyColumn(modifier = Modifier
        .padding(20.dp)
    ){
        itemsIndexed(doggoList) { index, item ->
            DoggoListView(item,navController,index.toString() )
        }
    }
}