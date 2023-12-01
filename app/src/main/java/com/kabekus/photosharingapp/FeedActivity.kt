package com.kabekus.photosharingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kabekus.photosharingapp.databinding.ActivityFeedBinding
import com.kabekus.photosharingapp.databinding.ActivityMainBinding

class FeedActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFeedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeedBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}