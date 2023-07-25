package com.example.calculatoractapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorAct : AppCompatActivity() {

    //class object declaration
    lateinit var mCalculatorHelper: CalculatorHelper

    lateinit var edtNumber1: EditText
    lateinit var edtNumber2: EditText
    lateinit var btnAddition: Button
    lateinit var btnSubstraction: Button
    lateinit var btnMultiplication: Button
    lateinit var btnDividion: Button
    lateinit var tvAnswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        //class no object
        mCalculatorHelper = CalculatorHelper()

        bindView()
        bindClick()


    }

    fun bindView() {
        edtNumber1 = findViewById(R.id.edtNumber1)
        edtNumber2 = findViewById(R.id.edtNumber2)
        btnAddition = findViewById(R.id.btnAddition)
        btnSubstraction = findViewById(R.id.btnSubstraction)
        btnMultiplication = findViewById(R.id.btnMultiplication)
        btnDividion = findViewById(R.id.btnDividion)
        tvAnswer = findViewById(R.id.tvAnswer)

    }

    fun bindClick() {
        btnAddition.setOnClickListener {

            val number1 = edtNumber1.text.toString().toInt()
            val number2 = edtNumber2.text.toString().toInt()

            val answer = mCalculatorHelper.addition(number1, number2)

            tvAnswer.setText("$answer")

        }
        btnDividion.setOnClickListener {

            val number1 = edtNumber1.text.toString().toInt()
            val number2 = edtNumber2.text.toString().toInt()

            val answer = mCalculatorHelper.division(number1, number2)
            tvAnswer.setText("$answer")
        }
        btnMultiplication.setOnClickListener {

            val number1 = edtNumber1.text.toString().toInt()
            val number2 = edtNumber2.text.toString().toInt()

            val answer = mCalculatorHelper.multiplication(number1, number2)
            tvAnswer.setText("$answer")

        }
        btnSubstraction.setOnClickListener {
            val number1 = edtNumber1.text.toString().toInt()
            val number2 = edtNumber2.text.toString().toInt()

            val answre = mCalculatorHelper.substraction(number1, number2)

            tvAnswer.setText("$answre")


        }


    }


}