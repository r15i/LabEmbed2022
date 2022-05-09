package com.example.recyclersample

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.findNavController


/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        val view =  inflater.inflate(R.layout.fragment_list, container, false)
        //Retrieves data from datasource




        val flowerList = Datasource(view.context).getFlowerList()



        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)

        recyclerView.adapter = FlowerAdapter(flowerList)


        return  view
    }

}