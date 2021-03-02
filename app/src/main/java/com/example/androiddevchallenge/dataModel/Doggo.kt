package com.example.androiddevchallenge.dataModel

import com.example.androiddevchallenge.R

data class Doggo(
    val id: Int,
    val age: Int,
    val image: Int,
    val name: String,
    val breed: String,
    val gender: String,
    val likes: String,
    val specialTreatment: String,
    val allergies: String,
    val color: String
)


val doggoList = listOf(
    Doggo(1,5, R.drawable.im_01,"Toro","German Shepherd","Male","Playing Balls","No","No","Brown") ,
    Doggo(2,2, R.drawable.im_02,"Lucy","Labrador","Female","Park Walks","No","No","White"),
    Doggo(3,8, R.drawable.im_03,"Romio","Poodles","Female","Sleeping","Need Dog Food","No","White"),
    Doggo(3,6, R.drawable.im_04,"Tuffy","Beagles","Male","Digging","No","No","White-Brown"),
    Doggo(4,10, R.drawable.im_05,"Paw","French Bulldog","Male","Running","Needs Runner","Yes","Brown"),
    Doggo(5,2, R.drawable.im_5,"Tommy","Bulldog","Male","Water Gamees","No","No","White"),
    Doggo(6,3, R.drawable.img_06,"Mixy","Golden Retriever","Female","Biscuits","No","No","Mustard"),
    Doggo(7,5, R.drawable.im_07,"Romo","Yorkshire","Female","Sleeping","Needs Warm Place","No","Brown"),
    Doggo(8,8, R.drawable.im_08,"Charlie","German Shepherd","Male","Park walks","No","Yes","Chocolate"),
    Doggo(9,9, R.drawable.im_09,"Mike","Rottweilers","Male","Biscuits","Need Dog Food","No","Black")
)
