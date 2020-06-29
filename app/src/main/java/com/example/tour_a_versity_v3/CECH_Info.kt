package com.example.tour_a_versity_v3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tour_a_versity_v3.CECH_Photos
import com.example.tour_a_versity_v3.R

class CECH_Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val button = findViewById<Button>(R.id.TucPhotoButton)
        button.setOnClickListener {
            val intent = Intent(this, CECH_Photos::class.java)
            startActivity(intent)
        }
    }
}