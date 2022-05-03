package com.hfad.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
//same as welcome but also passes a string to the next activity
class MessageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton = view.findViewById<Button>(R.id.next)
        val messageView = view.findViewById<EditText>(R.id.message)
        nextButton.setOnClickListener {
//            retrive the string
            val message = messageView.text.toString()
//            choose wich actrion to put in place from nav_graph
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message)

//            uses the crafted action
            view.findNavController().navigate(action)
        }
        return view
    }
}
