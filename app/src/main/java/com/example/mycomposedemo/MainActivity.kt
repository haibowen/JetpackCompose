package com.example.mycomposedemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposedemo.ui.theme.MyComposeDemoTheme

class MainActivity : ComponentActivity() {
    private var  context: Context? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    context=this
                    Column {
                        showRowSomething()
                        showSomething(context = context as MainActivity)
                        Button(onClick = {
                            startActivity(Intent(this@MainActivity,MainActivity2::class.java))
                        }) {
                            Text(text = "start ")

                        }
                        Surface(color = Color.Cyan,modifier = Modifier.padding(top = 20.dp)) {
                            
                            Text(text = "首页")
                            
                        }
                        OutlinedButton(onClick = { /*TODO*/ }) {

                            Text(text = "这是一种按钮")
                        }
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "这是文字按钮")
                            
                        }
                        getImage()
                        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null,modifier = Modifier.clip(shape = RoundedCornerShape(50)))

                        Divider(color = Color.Black,modifier = Modifier.padding(top = 10.dp))
                        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null,modifier = Modifier.width(150.dp).height(150.dp).clip(shape = RoundedCornerShape(60)).padding(start = 10.dp,end = 10.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun getImage(){
    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null,modifier = Modifier
        .width(100.dp)
        .height(100.dp))

}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Test(name: String) {
    Text(text = "hyplo")
}
@Composable
fun showSomething(context: Context) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Greeting("Android")
        Test(name = "hyplo")
        Text(text = "这是android的commpose222222222")
        Test(name = "显示")
        Button(onClick = { Toast.makeText(context, "这是按钮的点击", Toast.LENGTH_LONG).show() }) {
            Test(name = "hyplo")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun showRowSomething() {
    Row() {
        Text(text = "android", Modifier.padding(top = 20.dp))
        Button(onClick = { /*TODO*/ }, Modifier.padding(start = 20.dp, top = 20.dp)) {
            Text(text = "这是一个按钮")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeDemoTheme {
        Column() {
            Greeting("Android")
            Test("hyplo")
        }
    }
}