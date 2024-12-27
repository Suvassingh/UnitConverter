package com.example.learningjetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp


data class contact(
    val name:String,
    val phoneNumber:String
)

@Composable
fun lazy() {
    val Contact = remember {
        listOf(
            contact(
                 name = "suvas",
                phoneNumber = "123423232"
            ),
            contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),
        contact(
            name = "suvas",
            phoneNumber = "123423232"
        ),
        contact(
            name = "suvas",
            phoneNumber = "123423232"
        ),
        contact(
            name = "suvas",
            phoneNumber = "123423232"
        ),
        contact(
            name = "suvas",
            phoneNumber = "123423232"
        ),
            contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),contact(
                name = "suvas",
                phoneNumber = "123423232"
            ),


    ) }
    LazyRow (modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
        items(Contact){Contact->
            Card(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
                Column {
                    Text(text = Contact.name, fontSize = 20.sp)
                    Text(text = Contact.phoneNumber, fontSize = 20.sp)
                }
            }
        }
    }

}