package com.example.calculatoractapp

class Bank {
    var listOfDiposit = arrayListOf<Int>()
    var listOfWithdraw = arrayListOf<Int>()
    var total = 0

    fun dipositList(number: Int): ArrayList<Int> {

        total = total + number
        listOfDiposit.add(total)
        return listOfDiposit

    }

    fun withraw(number: Int): ArrayList<Int> {

        total = total - number
        listOfWithdraw.add(total)
        return listOfWithdraw

    }
}