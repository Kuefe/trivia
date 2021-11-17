package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 * Use the [TitelFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitelFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentTitleBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        //The complete onClickListener with Navigation
//        binding.playButton.setOnClickListener { view: View ->
//            view.findNavController().navigate(R.id.action_titelFragment_to_gameFragment)
//        }
        binding.playButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titelFragment_to_gameFragment))

        return binding.root
    }

}