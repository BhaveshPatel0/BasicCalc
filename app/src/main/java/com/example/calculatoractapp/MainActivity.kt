package com.example.calculatoractapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCalculator:Button
    lateinit var btnClassCalculator:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindVeiw()
        bindClick()
    }
    fun bindVeiw(){

        btnCalculator=findViewById(R.id.btnCalculator)
        btnClassCalculator=findViewById(R.id.btnClassCalculator)

    }
    fun bindClick(){

        btnCalculator.setOnClickListener {


            startActivity(Intent(this,CalculatorAct::class.java))

        }
        btnClassCalculator.setOnClickListener {


            startActivity(Intent(this,ClassCalculatorAct::class.java))

        }

    }

}