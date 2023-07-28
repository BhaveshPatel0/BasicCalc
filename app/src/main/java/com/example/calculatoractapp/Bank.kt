package com.example.calculatoractapp

class Bank {
    var listOfDiposit = arrayListOf<Int>()
    var listOfWithdraw = arrayListOf<Int>()
    var listOfEntry = arrayListOf<Int>()
    var listOfStringEntry = arrayListOf<String>()
    var total = 0

    fun dipositList(number: Int): ArrayList<Int> {
        listOfDiposit.clear()

        total = total + number
        listOfDiposit.add(total)

        return listOfDiposit
    }

    fun withraw(number: Int): ArrayList<Int> {

        listOfWithdraw.clear()
        total = total - number
        listOfWithdraw.add(total)

        return listOfWithdraw

    }
    fun listOfEntry(number: String): ArrayList<String> {

        listOfStringEntry.add(number)

        return listOfStringEntry
    }
    fun depositentry(number: Int):ArrayList<Int>{

        total=total+number
        listOfDiposit.add(total)
        return listOfDiposit

    }

}