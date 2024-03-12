package com.example.rowlayoutwithimageandcol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(painter = painterResource(
                id = R.drawable.sajid),
                contentDescription = "Sajid's Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 60.dp, height = 60.dp)
                    .clip(shape = CircleShape)
            )

            Column(
                modifier = Modifier
                    .padding(start = 10.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center

            ) {
                Text(text = "Sajid Ali", style = MaterialTheme.typography.headlineLarge ,fontWeight = FontWeight.Bold)
                Text(text = "3 hours ago ", style = MaterialTheme.typography.bodySmall)
            }

        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(painter = painterResource(
                id = R.drawable.sajid),
                contentDescription = "Sajid's Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 60.dp, height = 60.dp)
                    .clip(shape = CircleShape)
            )

            Column(
                modifier = Modifier
                    .padding(start = 10.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center

            ) {
                Text(text = "Shafique  Bakri", style = MaterialTheme.typography.headlineLarge ,fontWeight = FontWeight.Bold)
                Text(text = "2 hours ago ", style = MaterialTheme.typography.bodySmall)
            }

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
