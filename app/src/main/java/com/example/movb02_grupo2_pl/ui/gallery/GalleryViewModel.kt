package com.example.movb02_grupo2_pl.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Espacio para Galeria"
    }
    val text: LiveData<String> = _text
}