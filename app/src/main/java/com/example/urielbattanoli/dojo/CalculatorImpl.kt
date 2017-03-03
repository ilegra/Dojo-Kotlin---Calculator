package com.example.urielbattanoli.dojo

/**
 * Created by urielbattanoli on 3/2/17.
 */

class CalculatorImpl: Calculator {
    override fun sum(firstValue: Double, secondValue: Double): Double {
        return firstValue + secondValue
    }

    override fun minus(firstValue: Double, secondValue: Double): Double {
        return firstValue - secondValue
    }


    override fun multiply(firstValue: Double, secondValue: Double): Double {
        return firstValue * secondValue
    }

    override fun divide(firstValue: Double, secondValue: Double): Double {
        return firstValue / secondValue
    }

}