package com.example.zawadimart.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.zawadimart.R
import com.example.zawadimart.ui.theme.newblue
import com.example.zawadimart.ui.theme.neworange
import com.navigation.ROUT_ITEM

@Composable
fun StartScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


    ){

        Text(text = "ZawadiMart")

        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(R.drawable.mercedes),
            contentDescription = "ecommerce",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop

        )
        //End
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Find your order!!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = neworange
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Explore the world of Cars with exclusive insights, benefits and special access.",
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            color = newblue

            )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUT_ITEM)
        },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp)

        ) {
            Text(text = "Get started")
        }


    }


}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){

    StartScreen(rememberNavController())



}