package org.example.Lesson2

fun main() {

    val numberOfStudents = 4
    val grade1 = 3
    val grade2 = 4
    val grade3 = 3
    val grade4 = 5

    val meanGrade = (grade1 + grade2 + grade3 + grade4) / numberOfStudents.toDouble()
    val meanGradeFormatted = String.format("%.2f", meanGrade)

    println(meanGradeFormatted)
}