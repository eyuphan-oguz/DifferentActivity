package com.eyuphanoguz.differentactivity

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

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

    fun showAlertMessage(view: View){
        val uyariMesaji = AlertDialog.Builder(this)
        uyariMesaji.setTitle("Sifre Hatasi")
        uyariMesaji.setMessage("Lutfen sifreyi giriniz")
        uyariMesaji.setPositiveButton("Evet",DialogInterface.OnClickListener({dialogInterface, i ->
            Toast.makeText(this,"Evete tiklandi",Toast.LENGTH_LONG).show()

        }))
        uyariMesaji.setNegativeButton("Hayir",({dialogInterface, i ->
            Toast.makeText(this,"Hayira tiklandi",Toast.LENGTH_LONG).show()
        }))

        uyariMesaji.show()

    }


}