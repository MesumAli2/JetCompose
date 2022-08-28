package com.mesum.jetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mesum.jetcompose.ui.theme.JetComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DisplayTextImage(getString(R.string.title), getString(R.string.sub_heading), getString(R.string.paragraph))
                }
            }
        }
    }
}
@Composable
fun DisplayTextImage(title: String, subheading: String, string: String){
    
    Column {
        Image(painter = painterResource(id =R.drawable.bg_compose_background), contentDescription = null ,
            contentScale = ContentScale.FillWidth, modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(
                    Alignment.Start
                ))

        Text(text =title , fontSize = 36.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.Start)
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp))

        Text(text =subheading , fontSize = 16.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.Start)
            .padding(start = 16.dp, end = 16.dp)
        )

        Text(text =string , fontSize = 16.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.Start)
            .padding(start = 16.dp, end = 16.dp)
        )

    }





}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetComposeTheme {
    }
}