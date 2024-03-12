package com.example.findmyip

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FindMyIPView(state: ViewUIState) {

    Box(modifier = Modifier.fillMaxSize().background(Color.Red), contentAlignment = Alignment.Center){
        when(state.dataState){
            ViewDataState.Init -> {}
            ViewDataState.Loading -> CircularProgressIndicator(
                modifier = Modifier.width(64.dp),
                color = MaterialTheme.colorScheme.secondary
            )
            is ViewDataState.Success -> Text("Content Loaded \n ${state.dataState.data}")
            is ViewDataState.Error -> Text("Error ${state.dataState.error}")
        }
    }

}