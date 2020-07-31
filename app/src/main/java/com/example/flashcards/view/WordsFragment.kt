package com.example.flashcards.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.flashcards.R
import com.example.flashcards.databinding.WordsFragmentBinding

class WordsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: WordsFragmentBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.words_fragment,
            container,
            false
        )

        binding.btnCheck.setOnClickListener {
            findNavController().navigate(
                WordsFragmentDirections.actionWordsFragmentToCorrectWordFragment()
            )
        }

        binding.btnQuit.setOnClickListener {
            findNavController().navigate(
                WordsFragmentDirections.actionWordsFragmentToWrongWordFragment()
            )
        }

        return binding.root
    }
}