package com.example.composecalculator

sealed class CalculatorOperation(val symbol: String) {
    object Add:CalculatorOperation("+")
    object Substract:CalculatorOperation("-")
    object Multiply:CalculatorOperation("*")
    object Divide:CalculatorOperation("/")

    override fun toString(): String {
        return symbol
    }
}