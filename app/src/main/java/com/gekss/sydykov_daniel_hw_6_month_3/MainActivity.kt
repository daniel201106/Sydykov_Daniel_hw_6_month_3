package com.gekss.sydykov_daniel_hw_6_month_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gekss.sydykov_daniel_hw_6_month_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container_fragment, FirstFragment()).commit()
    }
}