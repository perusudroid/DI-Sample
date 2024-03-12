package com.example.photonapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import com.example.findmyip.MainActivity

class MainApp : ComponentActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeView(this).apply{
                Box(modifier = Modifier.fillMaxSize()){
                    Button(onClick = {
                        startActivity(Intent(this@MainApp, MainActivity::class.java))
                    }) {
                        Text("Start")
                    }
                }
            }
        }
    }

}