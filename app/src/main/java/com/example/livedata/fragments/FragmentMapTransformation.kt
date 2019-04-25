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
import com.example.livedata.viewmodels.TransformationViewModel
import kotlinx.android.synthetic.main.fragment_fragment_map_transformation.*

/**
 * A simple [Fragment] subclass.
 *
 */
class FragmentMapTransformation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_map_transformation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val transformationViewModel = ViewModelProviders.of(this).get(TransformationViewModel::class.java)
        transformationViewModel.newWord.observe(this, Observer {
            textWord.text = it
        })

        btnGenerate.setOnClickListener {
            transformationViewModel.setWordValue(WordGenerator().newWord(10))
        }
    }
}
