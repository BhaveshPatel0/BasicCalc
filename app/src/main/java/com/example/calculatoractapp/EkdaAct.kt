package com.example.calculatoractapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EkdaAct : AppCompatActivity() {
    lateinit var mEkda: Ekda
    lateinit var edtNumber: EditText
    lateinit var btnCheck: Button
    lateinit var tvAnswer: TextView
    lateinit var btnEven: Button
    lateinit var tvCheckEvenOdd: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ekda)

        mEkda = Ekda()

        bindView()
        bindClick()
    }

    fun bindView() {
        edtNumber = findViewById(R.id.edtNumber)
        btnCheck = findViewById(R.id.btnCheck)
        tvAnswer = findViewById(R.id.tvAnswer)
        btnEven = findViewById(R.id.btnEven)
        tvCheckEvenOdd = findViewById(R.id.tvCheckEvenOdd)

    }

    fun bindClick() {

        btnCheck.setOnClickListener {

            val number = edtNumber.text.toString().toInt()

            val answer = mEkda.printNumber(number)
            tvAnswer.setText("$answer")
        }
        btnEven.setOnClickListener {

            val number = edtNumber.text.toString().toInt()

            val metod = mEkda.isEven(number)

            val answer=mEkda.checkOddEven(number)
            tvCheckEvenOdd.setText("$metod $answer")

        }

    }

}