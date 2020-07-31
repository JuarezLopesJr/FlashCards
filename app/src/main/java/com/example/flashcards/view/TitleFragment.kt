package com.example.flashcards.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.flashcards.R
import com.example.flashcards.databinding.TitleFragmentBinding


class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: TitleFragmentBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.title_fragment,
            container,
            false
        )

        binding.btnStart.setOnClickListener {
            findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToWordsFragment())
        }

        return binding.root
    }

}