package com.example.livedata.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.livedata.R
import com.example.livedata.utils.WordGenerator
import com.example.livedata.viewmodels.RandomWordsViewModel
import kotlinx.android.synthetic.main.fragment_random_words.*

/**
 * A simple [Fragment] subclass.
 *
 */
class RandomWordsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_random_words, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val randomWordsViewModel = ViewModelProviders.of(this).get(RandomWordsViewModel::class.java)
        randomWordsViewModel.word.observe(this, Observer<String> { t -> textWord.text = t })

        btnGenerate.setOnClickListener {
            randomWordsViewModel.word.value = WordGenerator().newWord(10)
        }
    }
}
