package com.example.lab1

import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    fun testClick(view: View)
    {
        val inp: TextInputEditText = findViewById(R.id.Input)
        val list = listOf("L","M","K","D")
        if("${inp.text}" in list)
        {
            Toast.makeText(this, "Это согласная буквы", LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(this, "Возможно, это гласная буква", LENGTH_SHORT).show()
        }


    }
}