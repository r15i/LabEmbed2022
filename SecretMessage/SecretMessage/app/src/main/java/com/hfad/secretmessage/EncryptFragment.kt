package com.hfad.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class EncryptFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_encrypt, container, false)
//        receive the message
        val message = EncryptFragmentArgs.fromBundle(requireArguments()).message
//        select where to put
        val encryptedView = view.findViewById<TextView>(R.id.encrypted_message)
//        encrypt and display
        encryptedView.text = message.reversed()
        return view
    }
}
