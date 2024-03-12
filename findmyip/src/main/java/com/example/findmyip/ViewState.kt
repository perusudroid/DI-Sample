package com.example.findmyip

import com.example.findmyip.data.local.UserResponse

data class ViewUIState(
    val dataState: ViewDataState
)


sealed class ViewDataState{
    object Init : ViewDataState()
    object Loading : ViewDataState()
    data class Success(val data : UserResponse) : ViewDataState()
    data class Error(val error : String) : ViewDataState()
}