package com.example.learningjetpackcompose

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

data class screen(
    val title: String = String.toString(),
    val icon: ImageVector
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawer() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val selectedItem = remember { mutableStateOf("Home") }
    val drawerItems = listOf(
        screen("Home ", Icons.Default.Home),
        screen("Setting", Icons.Default.Settings),
        screen("Profile", Icons.Default.Person),

        )
    drawerItems.forEach { item ->
        NavigationDrawerItem(
            label = { Text(text = item.title) },
            selected = item.title == selectedItem.value,
            onClick = {
                selectedItem.value = item.title
                scope.launch { drawerState.close() }
            },
            modifier = Modifier.padding(vertical = 16.dp),
            icon = {Icon(imageVector = item.icon, contentDescription = item.title)}
        )
    }
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier
                    .width(300.dp)
                    .fillMaxHeight()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Text(
                        text = " Main Menu",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                }

            }
        }
    ) {
        Scaffold(topBar = {
            TopAppBar(
                title = { Text(text = selectedItem.value) },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        }
                    ) {
                        Icon(imageVector =Icons.Default.Menu, contentDescription = "Menu")
                    }
                }
            )
        }) { innerPadding ->
            Column (
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ){
                when(selectedItem.value){
                    "Home" -> HomeScreen()
                    "Setting"-> SettingScreen()
                    "Profile"-> ProfileScreen()


                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Text(text = "Home Screen")

}
@Composable
fun SettingScreen() {
    Text(text = "Setting ", modifier = Modifier)

}

@Composable
fun ProfileScreen() {
    Text(text = "Profile ", modifier = Modifier)

}


