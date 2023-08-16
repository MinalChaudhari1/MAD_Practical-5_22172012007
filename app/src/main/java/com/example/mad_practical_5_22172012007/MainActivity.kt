package com.example.mad_practical_5_22172012007

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browseButton:Button = findViewById(R.id.button_Browse)
        val editTextBrowser:EditText=findViewById(R.id.editText)
        browseButton.setOnClickListener{
            openBrowser(editTextBrowser.text.toString())
        }
    }
    fun  openBrowser(url:String)
    {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun opencall(number:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$number")).also { startActivity(it) }
    }
    fun opencalllog(){

    }
    fun openGallery(){

    }
    fun opencamera(){

    }
    fun openAlaram(){

    }
}
