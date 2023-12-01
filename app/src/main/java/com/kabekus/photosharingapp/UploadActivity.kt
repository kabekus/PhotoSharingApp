package com.kabekus.photosharingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kabekus.photosharingapp.databinding.ActivityFeedBinding
import com.kabekus.photosharingapp.databinding.ActivityUploadBinding

class UploadActivity : AppCompatActivity() {
    private lateinit var binding : ActivityUploadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun postUpload(view: View){

    }
    fun selectImage(view: View){

    }
}