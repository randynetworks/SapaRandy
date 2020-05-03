package com.example.belajar_android_self

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.belajar_android_self.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSapa.setOnClickListener {
            var sapa = binding.inputSapa.text.toString()
            var img  = resources.getIdentifier("me", "drawable", packageName)

            if (sapa == null)
                Toast.makeText(this@MainActivity,"duh, kamu blom sapa nichhh..", Toast.LENGTH_SHORT)
            else{
                binding.textSapa.setText(sapa)
                binding.gambar.setImageResource(img)
            }
        }
    }




}
