package com.example.mylibrary

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.annotation.Nullable
import org.w3c.dom.Text

class MainActivity : Activity() {
    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        System.out.println("mylibrary print onCreate");
        setContentView(R.layout.activity_two)

    }



    companion object {
        fun doSomething() {
            //Log.d("YourTag", "Debug message11111")
            System.out.println("mylibrary print hhhh");
        }
    }


}

