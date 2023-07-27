package com.example.calculatoractapp

class Ekda {

    var listofNumbers = arrayListOf<Int>()
    fun printNumber(n: Int): ArrayList<Int> {
        listofNumbers.clear()
        for (number in 1..n) {


            listofNumbers.add(number)

        }

        return listofNumbers

    }

    fun isEven(number: Int): Boolean {

        var isodd = false
        if (number % 2 == 0) {
            isodd = false

        } else {
            isodd = true

        }

        return isodd
    }

    fun checkOddEven(number: Int,):String{

        var answer=""
        if (number%2==0) {

            answer="$number is Even"

        } else {


            answer="$number is Odd"

        }
        return answer
    }
    fun odd(n: Int):ArrayList<Int>{

        for (number in 1..n) {

            if (number % 2 != 0){

                listofNumbers.add(number)
            }

        }
        return listofNumbers
    }
    fun even(n: Int):ArrayList<Int>{

        for (number in 1..n) {

            if (number % 2 == 0){

                listofNumbers.add(number)
            }


        }
        return listofNumbers
    }
}