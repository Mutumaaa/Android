@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.zawadimart.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.zawadimart.R
import com.example.zawadimart.ui.theme.newaesthetic
import com.example.zawadimart.ui.theme.neworange
import com.example.zawadimart.ui.theme.newwhite

@Composable
fun DashboardScreen(navController: NavController){

    Column(modifier = Modifier.
    fillMaxSize().background(newaesthetic)) {

       Box {
           //card
           Card(
               modifier = Modifier.fillMaxWidth().height(300.dp),
               shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
               colors = CardDefaults.cardColors(newwhite)



           ) {
               TopAppBar(

                   title = { Text(text = "Dashboard section") },
                   navigationIcon = {
                       IconButton(onClick = {}) {
                           Icon(imageVector = Icons.Default.Menu, contentDescription = "" )

                       }
                   }


               )



           }
           //ennd of card

           Card (
               modifier = Modifier
                   .fillMaxWidth()
                   .height(180.dp)
                   .align(alignment = Alignment.BottomCenter)
                   .padding(start = 20.dp, end = 20.dp)
                   .offset(y = 90.dp)



           ){
               Text( text = "WELCOME TO SMART HOME, YOUR DE")


           }



       }
        //End of box


        Spacer(modifier = Modifier.height(100.dp))

        //Row
        Row(modifier = Modifier.padding(start = 20.dp)) {

            //card1 in row

            Card(
                modifier = Modifier.width(150.dp).height(180.dp)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.home),
                        contentDescription = "ecommerce",
                        modifier = Modifier.size(100.dp),
                    )
                    Text(text = "Home", fontSize = 15.sp)
                }

            }



            //end of card1


            Spacer(modifier = Modifier.width(20.dp))

            //card1 in row

            Card(
                modifier = Modifier.width(150.dp).height(180.dp)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "ecommerce",
                        modifier = Modifier.size(100.dp),
                    )
                    Text(text = "About", fontSize = 15.sp)
                }

            }



            //end of card1



        }





        //End of row1

        Spacer(modifier = Modifier.height(20.dp))



        //Row2
        Row(modifier = Modifier.padding(start = 20.dp)) {

            //card1 in row

            Card(
                modifier = Modifier.width(150.dp).height(180.dp)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "ecommerce",
                        modifier = Modifier.size(100.dp),
                    )
                    Text(text = "Contacts", fontSize = 15.sp)
                }

            }



            //end of card1


            Spacer(modifier = Modifier.width(20.dp))

            //card1 in row

            Card(
                modifier = Modifier.width(150.dp).height(180.dp)
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "ecommerce",
                        modifier = Modifier.size(100.dp),
                    )
                    Text(text = "Products", fontSize = 15.sp)
                }

            }



            //end of card1



        }





        //End of row2


    }


}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){

    DashboardScreen(rememberNavController())



}