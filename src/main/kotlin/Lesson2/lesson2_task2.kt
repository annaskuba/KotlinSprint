package org.example.Lesson2

fun main() {

    val numberOfStaff = 50
    val staffWage = 30000
    val numberOfInterns = 30
    val internsWage = 20000

    val staffWageFund = numberOfStaff * staffWage
    val totalWageFund = staffWageFund + (numberOfInterns * internsWage)
    val averageWage = totalWageFund / (numberOfStaff + numberOfInterns)

    println(staffWageFund)
    println(totalWageFund)
    println(averageWage)

}