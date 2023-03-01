package net.iessochoa.sergiomarti.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.iessochoa.sergiomarti.practica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var num:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvNumber.text = num.toString()

        binding.btAddOne.setOnClickListener() {
            num++
            binding.tvNumber.text = num.toString()
        }

    }
}