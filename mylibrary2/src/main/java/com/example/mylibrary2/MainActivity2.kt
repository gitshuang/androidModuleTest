package com.example.mylibrary2

import android.app.Activity
import android.os.Bundle
import androidx.annotation.Nullable

class MainActivity2 : Activity() {
    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        System.out.println("mylibrary2 print onCreate");
        setContentView(R.layout.activity_three)

    }






}

