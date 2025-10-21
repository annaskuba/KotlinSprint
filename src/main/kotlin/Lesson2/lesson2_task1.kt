package org.example.Lesson2

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main() {

    val df = DecimalFormat("#0.00", DecimalFormatSymbols(Locale.US))

    val numberOfStudents = 4
    val grade1 = 3
    val grade2 = 4
    val grade3 = 3
    val grade4 = 5

    val meanGrade = (grade1 + grade2 + grade3 + grade4) / numberOfStudents

    println(df.format(meanGrade))

}