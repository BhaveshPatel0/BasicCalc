package com.example.calculatoractapp

class CalculatorHelper() {


    fun addition(number:Int,number1: Int):Int{

        val addition=number+number1

        return addition
    }
    fun division(number1:Int,number2:Int):Int{

        val division=number1/number2

        return division

    }
    fun multiplication(number1: Int,number2: Int):Int{

        val multiplication=number1*number2
        return multiplication
    }
    fun substraction(number1: Int,number2: Int):Int{

        val substration=number1-number2
        return substration

    }
    fun addition(number1: Int,number2: Int,number: Int):Int{


        return number1+number2+number

    }
}