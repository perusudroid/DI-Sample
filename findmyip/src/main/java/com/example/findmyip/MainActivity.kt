package com.example.findmyip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.ComposeView

class MainActivity : ComponentActivity() {

    private val findMyIpViewModel by viewModels<FindMyIpViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeView(this).apply{
                FindMyIPView(findMyIpViewModel.viewState.collectAsState().value)
            }
        }
    }
}