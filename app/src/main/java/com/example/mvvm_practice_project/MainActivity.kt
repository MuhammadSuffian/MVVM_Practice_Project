package com.example.mvvm_practice_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import com.example.mvvm_practice_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val userViewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun logic(){
        userViewModel.user.observe(this, Observer { user ->
            binding.nameText.text = "Name: ${user.name}"
            binding.ageText.text = "Age: ${user.age}"
            binding.emailText.text = "Email: ${user.email}"
        })
        binding.updateButton.setOnClickListener {
//            userViewModel.updateUser2()
        }
        binding.activity2.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        logic()
    }

}