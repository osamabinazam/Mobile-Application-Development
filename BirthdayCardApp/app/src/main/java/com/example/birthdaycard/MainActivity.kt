package com.example.birthdaycard

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = stringResource(id =R.string.greeting ),
                        from = stringResource(id = R.string.from)
                    )
                }
            }
        }
    }
}


@Composable
fun  GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.androidparty);
    Box(Modifier) {
        Image(
            painter = image,
            contentDescription = "This is android party image",
            contentScale = ContentScale.Crop,
            alpha = 0.6f,
        );

        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize()
        );
    }

}

@Composable
fun GreetingText(message: String,from :String ,modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,

        modifier = modifier.padding(8.dp),

    ){
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,

            )
        Text(
            text = from,
            fontSize = 20.sp,
            lineHeight = 50.sp,
            modifier = Modifier
                .padding(8.dp)
                .align(alignment = Alignment.End),
        )
    }


}

@Preview(showBackground = true, )
@Composable
fun BirthdayCardPreview() {
    BirthdayCardTheme {
//        GreetingText("Happy Birthday Sam!", "From: Osama")
        GreetingImage(stringResource(
            R.string.greeting), "From: Osama")

    }
}