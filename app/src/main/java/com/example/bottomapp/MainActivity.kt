package com.example.bottomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomAppBar.setNavigationOnClickListener {
            // Handle navigation icon press
        }

        binding.bottomAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.accelerator -> {
                    // Handle accelerator icon press
                    true
                }
                R.id.rotation -> {
                    // Handle rotation icon press
                    true
                }
                R.id.dashboard -> {
                    // Handle dashboard icon press
                    true
                }
                else -> false
            }
        }
    }
}