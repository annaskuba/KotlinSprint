package org.example.Lesson2

import kotlin.math.pow
import java.util.Locale

const val INTEREST_RATE = 0.167

fun main() {

    val initialSum = 70000
    val years = 20

    val totalSum = initialSum * (1 + INTEREST_RATE).pow(years)
    println(String.format(Locale.US, "%.3f", totalSum))

}