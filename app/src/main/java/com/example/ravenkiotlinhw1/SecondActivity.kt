package com.example.ravenkiotlinhw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts.SettingsColumns.KEY
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var intent = intent
        secondEt.setText(intent.getStringExtra(KEY))
    }

    fun secondButton(view: View) {
        if (secondEt.text.trim().isNotEmpty()) {
            getFromIntent("key2")
        } else {
            Helper().showToast2(this)
        }
    }

    private fun getFromIntent(name: String) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra(name, secondEt.text.toString())
        startActivity(intent)
    }
}
