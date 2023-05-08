package com.eyuphanoguz.differentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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


}