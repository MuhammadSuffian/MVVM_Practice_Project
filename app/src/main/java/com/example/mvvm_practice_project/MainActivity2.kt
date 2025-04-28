package com.example.mvvm_practice_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
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
        userViewModel.user.observe(this, Observer { user ->
            binding.nameText.text = "Name: ${user.name}"
            binding.ageText.text = "Age: ${user.age}"
            binding.emailText.text = "Email: ${user.email}"
        })
        binding.updateButton.setOnClickListener(){
            userViewModel.updateUser2()
        }
        binding.back.setOnClickListener {
        finish()
        }
    }
}