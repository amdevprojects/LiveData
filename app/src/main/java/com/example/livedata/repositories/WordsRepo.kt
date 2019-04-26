package com.example.livedata.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.livedata.utils.WordGenerator

object WordsRepo {

    fun getRandomWordsList(wordLength: Int): MutableLiveData<List<String>> {
        val wordListLiveData = MutableLiveData<List<String>>()
        val wordList = mutableListOf<String>()
        repeat(10) {
            wordList.add(WordGenerator().newWord(wordLength))
        }
        wordListLiveData.value = wordList
        return wordListLiveData
    }
}