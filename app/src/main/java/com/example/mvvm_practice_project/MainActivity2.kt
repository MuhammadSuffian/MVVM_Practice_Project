package com.example.mvvm_practice_project

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mvvm_practice_project.databinding.ActivityMain2Binding
import com.example.mvvm_practice_project.databinding.ActivityMainBinding
import kotlin.getValue

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    private val userViewModel: UserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        logic()
    }
    fun logic(){
        binding.updateButton.setOnClickListener(){
            userViewModel.updateUser2()
            finish()
        }
    }
}