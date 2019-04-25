package com.example.livedata.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class TransformationViewModel: ViewModel() {

    private val word = MutableLiveData<String>()

    init {
        word.value = "Random"
    }

    val newWord: LiveData<String> = Transformations.map(word, this::newWordAddedString)

    private fun newWordAddedString(newWord: String) = "The new word is $newWord"

    fun setWordValue(wordValue: String)  = apply {
        word.value = wordValue
    }
}