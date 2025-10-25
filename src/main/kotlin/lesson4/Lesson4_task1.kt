package org.example.lesson4

fun main () {

    val numberOfTables = 13
    val bookedForToday = 13
    val bookedForTomorrow = 9

    val areThereTablesToday = numberOfTables > bookedForToday
    val areThereTablesTomorrow = numberOfTables > bookedForTomorrow

    println("Доступность столиков на сегодня: $areThereTablesToday\n" +
            "Доступность столиков на завтра: $areThereTablesTomorrow")

}