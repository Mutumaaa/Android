package com.example.zawadimart.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.zawadimart.R
import com.example.zawadimart.ui.theme.newaesthetic
import com.example.zawadimart.ui.theme.neworange
import com.example.zawadimart.ui.theme.newwhite
import com.navigation.ROUT_INTENT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize()
    ){
        val mContext = LocalContext.current
       //Topappbar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newaesthetic,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "" )

                }
            },
            actions = {

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "" )

                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "" )


                }
                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "" )


                }

            }
        )
        //End pf topappabr
        Image(
            painter = painterResource(R.drawable.ecommerce),
            contentDescription = "ecommerce",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(20.dp))

        //SearchBar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search,contentDescription = "") },
            placeholder = { Text(text = "Search") }
        )


        //End of SearchBar

        Spacer(modifier = Modifier.height(10.dp))

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            //Row
            Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.products),
                    contentDescription = "ecommerce",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth,
                )
                Spacer(modifier = Modifier.width(10.dp))


                Column {

                    Text(
                        text = "SmartHome products",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "KSH 2400",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :KSH 1600",
                        fontSize = 16.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Yellow)
                    }

                }
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(neworange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(text = "Add to Cart")
                }





            }
            //End of row
            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.products),
                    contentDescription = "ecommerce",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth,
                )
                Spacer(modifier = Modifier.width(10.dp))


                Column {

                    Text(
                        text = "SmartHome products",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "KSH 2400",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :KSH 1600",
                        fontSize = 16.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Yellow)
                    }

                }
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(neworange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(text = "Add to Cart")
                }





            }
            //End of row
            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.products),
                    contentDescription = "ecommerce",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth,
                )
                Spacer(modifier = Modifier.width(10.dp))


                Column {

                    Text(
                        text = "SmartHome products",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "KSH 2400",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :KSH 1600",
                        fontSize = 16.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Yellow)
                    }

                }
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(neworange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(text = "Add to Cart")
                }





            }
            //End of row
            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.products),
                    contentDescription = "ecommerce",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth,
                )
                Spacer(modifier = Modifier.width(10.dp))


                Column {

                    Text(
                        text = "SmartHome products",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "KSH 2400",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :KSH 1600",
                        fontSize = 16.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Yellow)
                    }

                }
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(neworange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(text = "Add to Cart")
                }





            }

            //Row
            Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.products),
                    contentDescription = "ecommerce",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth,
                )
                Spacer(modifier = Modifier.width(10.dp))


                Column {

                    Text(
                        text = "SmartHome products",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "KSH 2400",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :KSH 1600",
                        fontSize = 16.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Yellow)
                    }

                }
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(neworange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(text = "Add to Cart")
                }





            }
            //End of row
            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.products),
                    contentDescription = "ecommerce",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth,
                )
                Spacer(modifier = Modifier.width(10.dp))


                Column {

                    Text(
                        text = "SmartHome products",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "KSH 2400",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :KSH 1600",
                        fontSize = 16.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Yellow)
                    }

                }
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(neworange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(text = "Add to Cart")
                }





            }
            //End of row
            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.products),
                    contentDescription = "ecommerce",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth,
                )
                Spacer(modifier = Modifier.width(10.dp))


                Column {

                    Text(
                        text = "SmartHome products",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "KSH 2400",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :KSH 1600",
                        fontSize = 16.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Yellow)
                    }

                }
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(neworange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(text = "Add to Cart")
                }





            }
            //End of row
            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.products),
                    contentDescription = "ecommerce",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth,
                )
                Spacer(modifier = Modifier.width(10.dp))


                Column {

                    Text(
                        text = "SmartHome products",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "KSH 2400",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :KSH 1600",
                        fontSize = 16.sp,

                        )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Yellow)
                    }

                }
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(neworange),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Text(text = "Add to Cart")
                }





            }
            //End of row
        }











    }


}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){

    ItemScreen(rememberNavController())



}