package com.example.fragmentsproyect

import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.navArgs

class ResultFragment : Fragment() {
    val args: ResultFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_result, container, false)
        val imgResult = root.findViewById<ImageView>(R.id.imgResult)

        if (savedInstanceState == null) {
            if (args.warriorType == 1){
                Log.i("ResultFragment", "Conan Warrior")
                imgResult.setImageResource(R.drawable.conan)
            }
            if (args.warriorType == 2){
                Log.i("ResultFragment", "Conan Warrior")
                imgResult.setImageResource(R.drawable.xena)
            }
        }

        return root
    }

}