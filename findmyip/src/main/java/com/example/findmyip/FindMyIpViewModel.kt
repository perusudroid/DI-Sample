package com.example.findmyip

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.findmyip.data.remote.RetrofitInstance
import com.example.findmyip.domain.FindMyIpRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class FindMyIpViewModel : ViewModel() {

    private val findMyRepo by lazy { FindMyIpRepo(RetrofitInstance.api) }

    private var _viewState = MutableStateFlow(ViewUIState(ViewDataState.Init))
    val viewState: StateFlow<ViewUIState> get() = _viewState

    init{
        fetchAPI()
    }

    private fun fetchAPI(){
        viewModelScope.launch {
            _viewState.emit(ViewUIState(ViewDataState.Loading))
            kotlin.runCatching {
                findMyRepo.fetchAPI()
            }.onSuccess {
                _viewState.emit(ViewUIState(ViewDataState.Success(it!!)))
            }.onFailure {
                _viewState.emit(ViewUIState(ViewDataState.Error(it.localizedMessage ?: "Error")))
            }
        }
    }

}