package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickmebutton = findViewById<Button>(R.id.clickmebutton)
        val stylesGroup = findViewById<androidx.constraintlayout.widget.Group>(R.id.stylesGroup)

        clickmebutton.text ="click"

        clickmebutton.setOnClickListener {
            if (stylesGroup.visibility == View.VISIBLE){
                stylesGroup.visibility = View.GONE
            } else {
                stylesGroup.visibility = View.VISIBLE
            }

        }

    }
}
