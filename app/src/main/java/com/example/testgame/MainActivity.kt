package com.example.testgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import com.example.testgame.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnEasy.setOnClickListener{
            val intent = Intent(this,easyActivity::class.java)
            startActivity(intent)
        }
        binding.btnHard.setOnClickListener{
            val intent = Intent(this,hardActivity::class.java)
            startActivity(intent)
        }
    }
}

