package com.example.android.formum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.formum.databinding.ActivityAddWordBinding
import com.example.android.formum.databinding.ActivityMainBinding


class AddWord_Activity : AppCompatActivity() {
    lateinit var binding: ActivityAddWordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddWordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val intent = Intent(this, ActivityMainBinding::class.java)
            startActivity(intent)
        }

        binding.btnAddWord.setOnClickListener {
            val word: String = binding.edtWord.text.toString()
            val meaning: String = binding.edtMeaning.text.toString()
        }
    }
}