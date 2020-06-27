package com.example.ravenkiotlinhw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

const val KEY_RESULT = "result"

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var intent = intent
        secondEt.setText(intent.getStringExtra(KEY))
    }

    fun secondButton(view: View) {
        if (secondEt.text.trim().isNotEmpty()) {
            getFromIntent(KEY_RESULT)
        } else {
            Helper().showToast2(this)
        }
    }

    private fun getFromIntent(name: String) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra(name, secondEt.text.toString())
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}
