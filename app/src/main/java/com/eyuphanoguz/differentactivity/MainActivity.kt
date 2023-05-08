package com.eyuphanoguz.differentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeActivity(view: View){
        var kullaniciVerisi = findViewById<EditText>(R.id.editText).text.toString()

        val intent = Intent(applicationContext, IkinciActivity::class.java)
        intent.putExtra("yollananVeri",kullaniciVerisi)
        startActivity(intent)
    }
}