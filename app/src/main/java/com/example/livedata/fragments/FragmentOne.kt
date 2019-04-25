package com.example.livedata.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.livedata.R
import kotlinx.android.synthetic.main.fragment_fragment_one.*
import java.util.*


/**
 * A simple [Fragment] subclass.
 *
 */
class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnRandomWords.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentOne_to_randomWordsFragment)
        }

        btnTransformation.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentOne_to_fragmentTransformation)
        }
    }
}
