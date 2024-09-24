package com.example.movb02_grupo2_pl.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Espacio para el Home"
    }
    val text: LiveData<String> = _text
}