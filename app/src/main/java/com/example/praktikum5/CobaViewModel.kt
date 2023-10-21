package com.example.praktikum5

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.praktikum5.data.dataform
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("")
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var Alamat: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(dataform())
    val uiState: StateFlow<dataform> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, almt: String ,jk: String) {
        namaUsr = nm;
        noTlp = tlp;
        Alamat = almt
        jenisKl = jk;
    }

    fun setJenisK(pilihJK: String) {
            _uiState.update { currentState -> currentState.copy(sex = pilihJK)}
    }
}