package com.fair.utctesting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fair.utctesting.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var date: Date
    private lateinit var dateFormat: SimpleDateFormat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {


            getTime.setOnClickListener {

                date = Date()
                dateFormat = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.US)
                dateFormat.timeZone = TimeZone.getTimeZone("UTC")

                displayText.text = dateFormat.format(date)
            }



        }

    }


}