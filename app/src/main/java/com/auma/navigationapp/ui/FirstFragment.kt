package com.auma.navigationapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.auma.navigationapp.R
import com.auma.navigationapp.viewmodel.myViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf


class firstFragment : Fragment() {

    private val viewModel: myViewModel by viewModel {
        parametersOf(findNavController())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_first, container, false)


        view.findViewById<Button>(R.id.second_fragment_button).setOnClickListener {
            viewModel.navigate(
                R.id.action_firstFragment_to_secondFragment
            )
        }
        view.findViewById<Button>(R.id.third_fragment_button).setOnClickListener {
            viewModel.navigate(
                R.id.action_firstFragment_to_thirdFragment
            )
        }
        return view
    }

}