package com.example.module1

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.module1.ui.theme.MyApplicationTheme
import com.example.mylibrary.MainActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setContent {
//            MyApplicationTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }

        val btnLaunchOtherModule = findViewById<Button>(R.id.btnLaunchOtherModule)
        btnLaunchOtherModule.setOnClickListener { // 处理按钮点击事件，启动另一个模块的 Activity
            launchOtherModuleActivity()
            //Log.d("YourTag", "Debug message11111")
            //MainActivity.doSomething();
            //System.out.println("module1 print123");
        }

    }

    private fun launchOtherModuleActivity() {
        // 在这里使用 Intent 启动另一个模块的 Activity
//        Intent intent = new Intent(this, io.cordova.hellocordova.MainActivity);
//        startActivity(intent);
        // 在这里使用 Intent 启动另一个模块的 Activity
//        val intent = Intent()
//        intent.component =
//            ComponentName("com.example.mylibrary", "com.example.mylibrary.MainActivity")
//        startActivity(intent)

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! 22",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}