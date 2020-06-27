package com.example.ravenkiotlinhw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val KEY = "key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intent = intent
        firstEt.setText(intent.getStringExtra("key2"))
    }


    fun firstButton(view: View) {
        if(firstEt.text.trim().isNotEmpty()){
            getFromIntent(KEY)
        }else{
            showToast("Пожалуйста, введите текст")
        }
    }

    fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    private fun getFromIntent(name: String){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(name, firstEt.text.toString())
        startActivity(intent)
    }

}
