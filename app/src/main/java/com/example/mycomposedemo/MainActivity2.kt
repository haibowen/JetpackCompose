package com.example.mycomposedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.mycomposedemo.ui.theme.MyComposeDemoTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                Surface {
                    Column {
                        Test(name = "123")
                        getSomething()
                        MyApp {
                            Text("测试")
                        }
                        MyApp {
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(top = 20.dp)

                            ) {
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "按钮一")


                                }
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "按钮二")


                                }
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "按钮三")


                                }

                            }
                        }
                        Divider(color = Color.Red,modifier = Modifier.padding(top = 20.dp))
                    }


                }
            }
        }
    }
}

@Composable
fun getSomething() {
    Row() {
        Text(text = "第二页", Modifier.padding(top = 10.dp))
        Surface(color = Color.Cyan) {
            Text(text = "进行来拿逆袭", Modifier.padding(20.dp))

        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialTheme() {
        Surface(color = Color.Magenta) {
            content()
        }

    }

}