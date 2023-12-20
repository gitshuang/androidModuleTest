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
import com.example.mylibrary2.MainActivity2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnLaunchOtherModule = findViewById<Button>(R.id.btnLaunchOtherModule)
        btnLaunchOtherModule.setOnClickListener { // 处理按钮点击事件，启动另一个模块的 Activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener { // 处理按钮点击事件，启动另一个模块的 Activity
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }

    }

    private fun launchOtherModuleActivity() {
        // 在这里使用 Intent 启动另一个模块的 Activity

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