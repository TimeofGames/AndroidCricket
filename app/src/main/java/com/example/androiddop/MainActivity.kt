package com.example.androiddop

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val button = findViewById<Button>(R.id.cricket)
        button.setOnClickListener{Thread(){
                    run(){
                        val mp = MediaPlayer.create(this, R.raw.cricket)
                        mp.start();
                    }}.start();
                }
    }
}