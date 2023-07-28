package com.example.calculatoractapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BankAct : AppCompatActivity() {
    lateinit var mBank: Bank
    lateinit var edtNumber:EditText
    lateinit var btnDeposit:Button
    lateinit var btnWithdraw:Button
    lateinit var tvAnswer:TextView
    lateinit var tvEntry:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank)
        mBank= Bank()
        bindView()
        bindClick()

    }
    fun bindView(){
        edtNumber=findViewById(R.id.edtNumber)
        btnDeposit=findViewById(R.id.btnDeposit)
        btnWithdraw=findViewById(R.id.btnWithdraw)
        tvAnswer=findViewById(R.id.tvAnswer)
        tvEntry=findViewById(R.id.tvEntry)
    }
    fun bindClick(){

        btnDeposit.setOnClickListener {

            val number=edtNumber.text.toString()

            val entry=mBank.listOfEntry(number.plus(" Deposite"))
            val answer=mBank.dipositList(number.toInt())

            tvAnswer.setText("Total Balance $answer")
            tvEntry.setText("$entry")
        }
        btnWithdraw.setOnClickListener {
            val number=edtNumber.text.toString()
            val answer=mBank.withraw(number.toInt())
            val entry=mBank.listOfEntry(number.plus(" Withdraw"))
            tvAnswer.setText("Total Balance $answer")
            tvEntry.setText("$entry ")

        }

    }
}