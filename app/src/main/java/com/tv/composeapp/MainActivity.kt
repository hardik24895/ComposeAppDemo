package com.tv.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tv.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewItem()

            /*ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }*/
        }
    }
}

@Composable
fun Greeting() {
    Text(
        modifier = Modifier
            .clickable {
            }
            .background(Color.Blue)
            .size(200.dp)
            .border(4.dp, Color.Red)
            .clip(CircleShape)

            .background(Color.Yellow)
        ,
        text = "Hello Hardik!",
        color = Color.Magenta,
    )
}

@Composable
fun Imageset() {
    Image(
        painter = painterResource(id = R.drawable.dummy),
        contentDescription = "dummy image",
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun ButtonFunction() {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
        )
    ) {
        Text(text = "Click Me")
        Imageset()
    }
}

@Composable
fun InputTextField() {
    val state = remember { mutableStateOf("") }

    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Enter input") }

    )
}

@Composable
fun columFun() {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A", fontSize = 25.sp)
        Text(text = "B", fontSize = 25.sp)
    }

}

@Composable
fun rowFun() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "A", fontSize = 25.sp)
        Text(text = "B", fontSize = 25.sp)
    }
}
@Composable
fun box(){
  Box(
      contentAlignment = Alignment.BottomEnd
  ) {
      Text(text = "A", fontSize = 25.sp)
      Text(text = "B", fontSize = 25.sp)
  }
}
@Composable
fun listItem(imageId:Int, name: String, desc:String){

    Row (
        Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(painter = painterResource(id = imageId), contentDescription ="" ,
            Modifier.size(40.dp)
            )
        Column {
            Text(text = name, fontSize = 25.sp, fontWeight = FontWeight.Bold)
            Text(text = desc, fontSize = 15.sp, fontWeight = FontWeight.Thin)
        }
    }
}

@Composable
fun listView(){
  Column {
      listItem(R.drawable.dummy, "Hardik", "Software developer")
      listItem(R.drawable.dummy, "Hardik", "Software developer")
      listItem(R.drawable.dummy, "Hardik", "Software developer")
      listItem(R.drawable.dummy, "Hardik", "Software developer")
      listItem(R.drawable.dummy, "Hardik", "Software developer")
  }
}


@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun GreetingPreview() {
    ComposeAppTheme {
        Imageset()
    }
}