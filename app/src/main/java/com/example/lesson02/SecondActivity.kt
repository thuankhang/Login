package com.example.lesson02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun changeActivity2(view : View) {
        val intent = Intent (this, MainActivity::class.java).apply {
        }
        startActivity(intent)
    }
}
