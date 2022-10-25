package com.example.websitie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sitio_web.*

class SitioWebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sitio_web)

        val bundle = intent.extras
        val dato = bundle?.getString("Direccion url")
        website1.loadUrl("https://${dato}")
        btn_2.setOnClickListener {
            finish();
        }
    }
}