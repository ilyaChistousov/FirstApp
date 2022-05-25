package com.example.firstapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firstapp.databinding.GameDetailsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class GameDetails : BottomSheetDialogFragment() {

    private var binding:GameDetailsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = GameDetailsBinding.inflate(inflater, container, false)

        binding?.gameName?.text = arguments?.getString("gameName")
        binding?.gameDifficulty?.text = arguments?.getString("gameDifficulty")
        binding?.gameImage?.setImageResource(R.drawable.elden_ring)

        return binding?.root
    }

}