package com.firstapp.basic_calc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.firstapp.basic_calc.R.id
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val input1: EditText = findViewById(R.id.num1)
        val input2: EditText = findViewById(R.id.num2)
        val restext: TextView = findViewById(R.id.res)
        val add: Button = findViewById(R.id.add1)
        val sub: Button = findViewById(R.id.sub1)
        val mul: Button = findViewById(R.id.mul1)
        val div: Button = findViewById(R.id.div1)


        add.setOnClickListener {
            val input1 = input1.text.toString().toDoubleOrNull()
            val input2 = input2.text.toString().toDoubleOrNull()
            if ((input1 != null) and (input2 != null)) {
                val result = input1?.plus(input2!!)
                val res= round(result!! * 100) /100
                val a =res.toString()
                restext.setText(a)
            } else {
                restext.text = "Please enter a valid value"
            }
        }

        sub.setOnClickListener {
            val input1 = input1.text.toString().toDoubleOrNull()
            val input2 = input2.text.toString().toDoubleOrNull()
            if ((input1 != null) and (input2 != null)) {
                val result = input1?.minus(input2!!)
                val res= round(result!! * 100) /100
                val a =res.toString()
                restext.setText(a)
            } else {
                restext.text = "Please enter a valid value"
            }
        }

        mul.setOnClickListener {
            val input1 = input1.text.toString().toDoubleOrNull()
            val input2 = input2.text.toString().toDoubleOrNull()
            if ((input1 != null) and (input2 != null)) {
                val result = input1?.times(input2!!)
                val res= round(result!! * 100) /100
                val a =res.toString()
                restext.setText(a)
            } else {
                restext.text = "Please enter a valid value"
            }
        }

        div.setOnClickListener {
            val input1 = input1.text.toString().toDoubleOrNull()
            val input2 = input2.text.toString().toDoubleOrNull()
            if ((input1 != null) and (input2 != null)) {
                val result = input1?.div(input2!!)
                val res= round(result!! * 100) /100
                val a =res.toString()
                restext.setText(a)
            } else {
                restext.text = "Please enter a valid value"
            }
        }




    }
}