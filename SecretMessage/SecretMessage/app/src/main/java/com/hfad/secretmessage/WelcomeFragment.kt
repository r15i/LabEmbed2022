package com.hfad.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


//
//it define what to do on the creation of the fragment and inflate the layout of the fragment
//in this case also defines a listener


class WelcomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        val startButton = view.findViewById<Button>(R.id.start)

        startButton.setOnClickListener {
//            uses the navigation controller to find what action has to be performed from the nav_graph.xml
            view.findNavController().navigate(R.id.action_welcomeFragment_to_messageFragment)
        }

//        it actually return a view inflated
        return view
    }
}
