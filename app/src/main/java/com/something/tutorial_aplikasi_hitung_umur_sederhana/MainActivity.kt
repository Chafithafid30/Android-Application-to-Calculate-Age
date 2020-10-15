package com.something.tutorial_aplikasi_hitung_umur_sederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun proses(view: View) {

        var lahir = editText1.text.toString()
        var usia : Int = 2020 - lahir.toInt()
        textView1.setText(usia.toString())
    }
}