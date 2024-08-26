package com.auma.navigationapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.auma.navigationapp.R


class firstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_first,container,false)

        view.findViewById<Button>(R.id.second_fragment_button).setOnClickListener { view.findNavController().navigate(
            R.id.action_firstFragment_to_secondFragment
        ) }
        view.findViewById<Button>(R.id.third_fragment_button).setOnClickListener { view.findNavController().navigate(
            R.id.action_firstFragment_to_thirdFragment
        ) }
        return view
    }

}