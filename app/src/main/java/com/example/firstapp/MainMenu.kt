package com.example.firstapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.firstapp.databinding.MainMenuBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MainMenu : BottomSheetDialogFragment() {

    private var binding: MainMenuBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = MainMenuBinding.inflate(inflater, container, false)

        binding?.navigationView?.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.homeBSD -> createToast("tap on home")
                R.id.contactBSD -> createToast("tap on contact")
                R.id.favoritesBSD -> createToast("tap on favorites")
                R.id.shopBSD -> createToast("tap on shop")
                R.id.settingBSD -> createToast("tap on settings")
                R.id.videoBSD -> createToast("tap on video")
            }
            true
        }

        return binding?.root
    }

    private fun createToast(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }


}