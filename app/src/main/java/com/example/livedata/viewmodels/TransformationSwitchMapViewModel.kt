package com.example.livedata.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.livedata.repositories.WordsRepo

class TransformationSwitchMapViewModel: ViewModel() {

    private val randomWordLength = MutableLiveData<Int>()

    init {
        randomWordLength.value = 10
    }

    val randomWord: LiveData<List<String>> = Transformations.switchMap(randomWordLength, this::newRandomWord)

    private fun newRandomWord(wordLength: Int) = WordsRepo.getRandomWordsList(wordLength)

    fun setRandomWordLength(wordLength: Int) = apply {
        randomWordLength.value = wordLength
    }
}