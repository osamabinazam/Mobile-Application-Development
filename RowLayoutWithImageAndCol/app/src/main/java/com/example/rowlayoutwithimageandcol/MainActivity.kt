package com.example.rowlayoutwithimageandcol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rowlayoutwithimageandcol.ui.theme.RowLayoutWithImageAndColTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowLayoutWithImageAndColTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RowLayoutWithCol()
                }
            }
        }
    }
}

@Composable
fun RowLayoutWithCol(){

    Column {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Box{
                Image(painter = painterResource(
                    id = R.drawable.sajid),
                    contentDescription = "Sajid's Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(width = 60.dp, height = 60.dp)
                        .clip(shape = CircleShape)
                )

                Icon(
                    imageVector = Icons.Default.NotificationsActive,
                    contentDescription = "Online",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .size(15.dp)
                        .clip(shape = CircleShape)
                        .background(color = MaterialTheme.colorScheme.primary)
                        .padding(1.dp)
                        .align(Alignment.BottomEnd)
                )
            }

            Column(
                modifier = Modifier
                    .padding(start = 10.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center

            ) {
                Text(text = "Sajid Ali", style = MaterialTheme.typography.headlineLarge ,fontWeight = FontWeight.Bold)
                Text(text = "3 hours ago ", style = MaterialTheme.typography.bodySmall)
            }

            Icon(
                Icons.Rounded.Add,
                contentDescription = "Add",
                tint = Color.Gray,
                modifier = Modifier
                    .size(30.dp)
                    .clip(shape = CircleShape)
            )

        }

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)

        ) {
            Box{
                Image(painter = painterResource(
                    id = R.drawable.sajid),
                    contentDescription = "Shafique's Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(width = 60.dp, height = 60.dp)
                        .clip(shape = CircleShape)
                )

                Icon(
                    imageVector = Icons.Default.NotificationsActive,
                    contentDescription = "Online",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .size(15.dp)
                        .clip(shape = CircleShape)
                        .background(color = MaterialTheme.colorScheme.primary)
                        .padding(1.dp)
                        .align(Alignment.BottomEnd)
                )
            }

            Column(
                modifier = Modifier
                    .padding(start = 10.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center

            ) {
                Text(
                    text = "Shafique  Bakri",
                    style = MaterialTheme.typography.headlineLarge ,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "2 hours ago ",
                    style = MaterialTheme.typography.bodySmall
                )
            }

            Icon(
                Icons.Rounded.Add,
                contentDescription = "Add",
                tint = Color.Gray,
                modifier = Modifier
                    .size(30.dp)
                    .clip(shape = CircleShape)
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RowLayoutWithImageAndColTheme {
        RowLayoutWithCol()
    }
}
