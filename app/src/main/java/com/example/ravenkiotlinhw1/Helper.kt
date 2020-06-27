package com.example.ravenkiotlinhw1

import android.app.Activity
import android.widget.Toast

class Helper {
    fun showToast(context: Activity, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }
    fun showToast2(context: Activity) {
        Toast.makeText(context, "Введите текст", Toast.LENGTH_LONG).show()
    }
}