package com.example.flashcards.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.flashcards.R
import com.example.flashcards.databinding.FragmentWrongWordBinding

class WrongWordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentWrongWordBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_wrong_word,
            container,
            false
        )

        binding.btnCorrect.setOnClickListener {
            findNavController().navigate(
                WrongWordFragmentDirections.actionWrongWordFragmentToTitleFragment()
            )
        }

        return binding.root
    }
}