package com.example.urielbattanoli.dojo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity: AppCompatActivity() {

    var valueText: EditText? = null
    var buttonMinus: Button? = null
    var buttonPlus: Button? = null
    var buttonDivide: Button? = null
    var buttonMultiplyer: Button? = null
    var textViewResult: TextView? = null

    val firstValue: Double
        get() = valueText?.text.toString().toDouble() ?: 0.0

    val calculatorView: CalculatorView

    init {
        calculatorView = CalculatorView()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFields()

        setListener(buttonDivide, Operation.Divide)
        setListener(buttonMinus, Operation.Minus)
        setListener(buttonMultiplyer, Operation.Multiply)
        setListener(buttonPlus, Operation.Sum)
    }

    fun setFields() {
        valueText = findViewById(R.id.firstField) as EditText
        textViewResult = findViewById(R.id.resultTextView) as TextView

        buttonMinus = findViewById(R.id.minusButton) as Button
        buttonPlus = findViewById(R.id.sumButton) as Button
        buttonDivide = findViewById(R.id.divideButton) as Button
        buttonMultiplyer = findViewById(R.id.multiplyButton) as Button
    }

    fun setListener(button: Button?, operation: Operation) {
        button?.setOnClickListener {
            calculatorView.calculate(firstValue, operation)
            textViewResult?.text = calculatorView.result
            valueText?.setText("0")
        }
    }
}
