package com.example.zawadimart.ui.screens.item

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.zawadimart.ui.theme.newaesthetic
import com.example.zawadimart.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(){

    Column (
        modifier = Modifier.fillMaxSize()
    ){

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
                    Icon(ImageVector = Icons.Default.Menu, contentDescription = "" )

                }
            },
            actions = {

                IconButton(onClick = {}) {
                    Icon(ImageVector = Icons.Default.ShoppingCart, contentDescription = "" )

                }
                IconButton(onClick = {}) {
                    Icon(ImageVector = Icons.Default.Notifications, contentDescription = "" )

                }

            }
        )
        //End









    }


}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){

    ItemScreen()



}