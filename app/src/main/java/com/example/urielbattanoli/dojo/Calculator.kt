package com.example.urielbattanoli.dojo

/**
 * Created by urielbattanoli on 3/2/17.
 */
interface Calculator {

    fun sum(firstValue: Double, secondValue: Double): Double

    fun minus(firstValue: Double, secondValue: Double): Double

    fun multiply(firstValue: Double, secondValue: Double): Double

    fun divide(firstValue: Double, secondValue: Double): Double
}

fun Calculator.calculate(firstValue: Double, secondValue: Double, operation: Operation): Double {
    when(operation) {
        Operation.Minus -> return minus(firstValue, secondValue)
        Operation.Sum -> return sum(firstValue, secondValue)
        Operation.Multiply -> return multiply(firstValue, secondValue)
        Operation.Divide -> return divide(firstValue, secondValue)
    }
}