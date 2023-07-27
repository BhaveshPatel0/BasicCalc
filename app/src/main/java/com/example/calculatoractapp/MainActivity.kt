package com.example.calculatoractapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCalculator:Button
    lateinit var btnClassCalculator:Button
    lateinit var btnEkda:Button
    lateinit var btnOddEven:Button
    lateinit var btnBnak:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindVeiw()
        bindClick()
    }
    fun bindVeiw(){

        btnCalculator=findViewById(R.id.btnCalculator)
        btnClassCalculator=findViewById(R.id.btnClassCalculator)
        btnEkda=findViewById(R.id.btnEkda)
        btnOddEven=findViewById(R.id.btnOddEven)
        btnBnak=findViewById(R.id.btnBnak)

    }
    fun bindClick(){

        btnCalculator.setOnClickListener {


            startActivity(Intent(this,CalculatorAct::class.java))

        }
        btnClassCalculator.setOnClickListener {


            startActivity(Intent(this,ClassCalculatorAct::class.java))

        }
        btnEkda.setOnClickListener {


            startActivity(Intent(this,EkdaAct::class.java))

        }
        btnOddEven.setOnClickListener {


            startActivity(Intent(this,OddEvenAct::class.java))

        }
        btnBnak.setOnClickListener {


            startActivity(Intent(this,BankAct::class.java))

        }

    }

}