package com.example.ravenkiotlinhw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

const val KEY = "key"
const val REQUEST_CODE = 1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun firstButton(view: View) {
        if (firstEt.text.trim().isNotEmpty()) {
            getFromIntent(KEY)
        } else {
            Helper().showToast2(this)
        }
    }

    private fun getFromIntent(name: String) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(name, firstEt.text.toString())
        startActivityForResult(intent, REQUEST_CODE)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){
                val result = data?.getStringExtra(KEY_RESULT)
                firstEt.setText(result)
            }
        }
    }

}
