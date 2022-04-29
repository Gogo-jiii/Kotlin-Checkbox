package com.example.checkbox

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBoxA.setOnClickListener(this)
        checkBoxB.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val isChecked = (view as CheckBox).isChecked

        if (view === checkBoxA) {
            if (isChecked) {
                Toast.makeText(
                    this@MainActivity, "A is checked.",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(
                    this@MainActivity, "A is un-checked.",
                    Toast.LENGTH_LONG
                ).show()
            }
        } else if (view === checkBoxB) {
            if (isChecked) {
                Toast.makeText(
                    this@MainActivity, "B is checked.",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(
                    this@MainActivity, "B is un-checked.",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}