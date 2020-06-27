package com.example.ravenkiotlinhw1

import android.app.Activity
import android.widget.Toast

class Helper {
    fun showToast2(context: Activity) {
        Toast.makeText(context, "Введите текст", Toast.LENGTH_LONG).show()
    }
}