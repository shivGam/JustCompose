package com.example.justcompose

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ShowPreview(){
    LazyColumn(content = {
        items(getCategory()){item -> run {
            CardCategory(imgId = item.imgId, name = item.name, desc = item.desc)
        }
        }
    })
}

@Composable
fun CardCategory(imgId : Int, name:String ,desc:String){
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier= Modifier.padding(8.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ){
            Image(
                painter = painterResource(id = imgId),
                contentDescription = "Profile",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            Column(
                modifier = Modifier.weight(.8f)
            ) {
                Text(text = name,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold)
                Text(text = desc,
                    style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}

data class Category(val imgId : Int,val  name:String ,val desc:String)

@SuppressLint("SuspiciousIndentation")
fun getCategory() : MutableList<Category>{

    val list = mutableListOf<Category>()
            list.add(Category(R.drawable.person1,"Shivdatt","Computer Science"))
            list.add(Category(R.drawable.person2,"Arya","Electrical Engineering"))
            list.add(Category(R.drawable.person3,"Raj","Mechanical Engineering"))
            list.add(Category(R.drawable.person1,"Sara","Physics"))
            list.add(Category(R.drawable.person2,"Jake","Mathematics"))
            list.add(Category(R.drawable.person3,"Priya","Chemistry"))
            list.add(Category(R.drawable.person1,"Ankur","Biology"))
            list.add(Category(R.drawable.person2,"Neha","Economics"))
            list.add(Category(R.drawable.person3,"Akshay","Political Science"))
            list.add(Category(R.drawable.person1,"Riya","English Literature"))
            list.add(Category(R.drawable.person1,"Shivdatt","Computer Science"))
            list.add(Category(R.drawable.person2,"Arya","Electrical Engineering"))
            list.add(Category(R.drawable.person3,"Raj","Mechanical Engineering"))
            list.add(Category(R.drawable.person1,"Sara","Physics"))
            list.add(Category(R.drawable.person2,"Jake","Mathematics"))
            list.add(Category(R.drawable.person3,"Priya","Chemistry"))
            list.add(Category(R.drawable.person1,"Ankur","Biology"))
            list.add(Category(R.drawable.person2,"Neha","Economics"))
            list.add(Category(R.drawable.person3,"Akshay","Political Science"))
            list.add(Category(R.drawable.person1,"Riya","English Literature"))
    return list
}