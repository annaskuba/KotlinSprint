package org.example.Lesson2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {

    val hourOfDeparture = 9
    val minuteOfDeparture = 39

    val journeyDurationInMinutes = 457

    val hoursEnRoute = journeyDurationInMinutes / MINUTES_IN_HOUR
    val minutesEnRoute = journeyDurationInMinutes % MINUTES_IN_HOUR

    var hourOfArrival = hourOfDeparture + hoursEnRoute
    var minuteOfArrival = minuteOfDeparture + minutesEnRoute

    while (hourOfArrival >= HOURS_IN_DAY) {
        hourOfArrival = hourOfArrival - HOURS_IN_DAY
    }

    if (minuteOfArrival >= MINUTES_IN_HOUR) {
        hourOfArrival = hourOfArrival + 1
        minuteOfArrival = minuteOfArrival - MINUTES_IN_HOUR
    }

    println(String.format("%02d:%02d", hourOfArrival, minuteOfArrival))

}