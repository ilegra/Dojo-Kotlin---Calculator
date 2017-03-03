package com.example.urielbattanoli.dojo

/**
 * Created by urielbattanoli on 3/2/17.
 */
enum class Operation {
    Sum, Minus, Divide, Multiply

}
class CalculatorView {

    private var calculatedValue: Double = 0.0
    val result: String
    get() = calculatedValue.toString()

    private var calculator: Calculator

    init {
        calculator = CalculatorImpl()
    }

    fun calculate(value: Double, operation: Operation) {
        calculatedValue = calculator.calculate(calculatedValue, value, operation)
    }
}