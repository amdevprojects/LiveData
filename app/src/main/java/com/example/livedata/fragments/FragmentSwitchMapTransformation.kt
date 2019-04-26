package com.example.livedata.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.livedata.R
import com.example.livedata.viewmodels.TransformationSwitchMapViewModel
import kotlinx.android.synthetic.main.fragment_fragment_switch_map_transformation.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 *
 */
class FragmentSwitchMapTransformation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_switch_map_transformation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val transformationSwitchMapViewModel = ViewModelProviders.of(this).get(TransformationSwitchMapViewModel::class.java)
        transformationSwitchMapViewModel.randomWord.observe(this, Observer {
            textWord.text = it.toString()
        })

        btnGenerate.setOnClickListener {
            transformationSwitchMapViewModel.setRandomWordLength(Random().nextInt(20 - 10 + 1) + 10)
        }
    }
}
