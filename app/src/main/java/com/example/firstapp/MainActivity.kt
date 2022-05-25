package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.topAppBar?.setNavigationOnClickListener {
            val mainMenu = MainMenu()
            mainMenu.show(supportFragmentManager, "mainMenu")
        }

        binding?.cardButton?.setOnClickListener{
            val gameDetails = GameDetails()
            val bundle = Bundle()

            bundle.putString("gameName", getString(R.string.game_name))
            bundle.putString("gameDifficulty", getString(R.string.difficulty))

            gameDetails.arguments = bundle

            gameDetails.show(supportFragmentManager, "gameDetails")

        }

        binding?.bottomNV?.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> {
                    createToast("tap on home")
                    true
                }
                R.id.history -> {
                    createToast("tap on history")
                    true
                }
                R.id.search -> {
                    createToast("tap on search")
                    true
                }
                R.id.message -> {
                    createToast("tap on message")
                    true
                }
                else -> false
            }
        }

        binding?.topAppBar?.setOnMenuItemClickListener{
            when(it.itemId) {
                R.id.location -> {
                    createToast("tap on location")
                    true
                }
                R.id.photo -> {
                    createToast("tap on photo")
                    true
                }
                else -> false
            }
        }

    }

    private fun createToast(message:String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}