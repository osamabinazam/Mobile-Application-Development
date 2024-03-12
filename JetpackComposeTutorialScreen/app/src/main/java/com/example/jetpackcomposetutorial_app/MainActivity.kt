package com.example.jetpackcomposetutorial_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial_app.ui.theme.JetpackcomposetutorialappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomposetutorialappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GetpackCmoposeTutorialApp()
                }
            }
        }
    }
}

@Composable
fun GetpackCmoposeTutorialApp() {
    Column (Modifier){
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "Tutorail Banner",
            modifier = Modifier.fillMaxWidth(),
        );

        Text(
            text = stringResource(id = R.string.title),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center,
            fontSize = 24.sp
        )

        Text(
            text = stringResource(id = R.string.paragraph1),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth()
        )

        Text(text = stringResource(id = R.string.paragraph2),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )


    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackcomposetutorialappTheme {
        GetpackCmoposeTutorialApp()
    }
}