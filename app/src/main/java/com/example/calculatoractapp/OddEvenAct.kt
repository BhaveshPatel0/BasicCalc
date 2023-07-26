package com.example.calculatoractapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class OddEvenAct : AppCompatActivity() {
    lateinit var mEkda: Ekda
    lateinit var edtNumber: EditText
    lateinit var btnOdd: Button
    lateinit var btnEven: Button
    lateinit var tvAnswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_odd_even)

        mEkda = Ekda()
        bindView()
        bindClick()
    }

    fun bindView() {
        edtNumber = findViewById(R.id.edtNumber)
        btnOdd = findViewById(R.id.btnOdd)
        btnEven = findViewById(R.id.btnEven)
        tvAnswer = findViewById(R.id.tvAnswer)
    }

    fun bindClick() {
        btnOdd.setOnClickListener {

            val number = edtNumber.text.toString().toInt()

            val answer =mEkda.odd(number)

            tvAnswer.setText("$answer")


        }
        btnEven.setOnClickListener {

            val number=edtNumber.text.toString().toInt()

            val answer=mEkda.odd(number)
            tvAnswer.setText("$answer")

        }
    }
}