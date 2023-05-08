package com.eyuphanoguz.differentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class IkinciActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci)

        val intent = intent
        var alinanVeri = intent.getStringExtra("yollananVeri")
        var textDegeri = findViewById<TextView>(R.id.textView2)
        Log.e("gelendata","${alinanVeri}")
        textDegeri.text=alinanVeri.toString()
    }

    fun backPush(view: View){
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }


}