package com.example.livedata.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.livedata.R
import com.example.livedata.utils.WordGenerator
import com.example.livedata.viewmodels.TransformationViewModel
import kotlinx.android.synthetic.main.fragment_tranformation.*

/**
 * A simple [Fragment] subclass.
 *
 */
class FragmentTransformation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tranformation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnTransformationMap.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentTransformation_to_fragmentMapTransformation)
        }

        btnTransformationSwitchMap.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentTransformation_to_fragmentSwitchMapTransformation)
        }
    }
}
