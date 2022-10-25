package com.example.websitie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_ver.setOnClickListener {
            val boton1 = Intent(this, SitioWebActivity::class.java)
            boton1.putExtra("Dirección URL", txt_url.text.toString())
            startActivity(boton1)
        }
    }
}