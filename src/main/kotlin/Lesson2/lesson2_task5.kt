package org.example.Lesson2

import kotlin.math.pow
import java.util.Locale

const val INTEREST_RATE_PERCENTAGE = 16.7
const val PERCENT_FORMATTER = 100


fun main() {

    val interestRate: Double = INTEREST_RATE_PERCENTAGE / PERCENT_FORMATTER
    val initialSum = 70000
    val years = 20

    val totalSum = initialSum * (1 + interestRate).pow(years)
    println(String.format(Locale.US, "%.3f", totalSum))

}