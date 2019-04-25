package com.example.livedata.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomWordsViewModel: ViewModel() {

    val word = MutableLiveData<String>()

    init {
        word.value = "Random"
    }
}