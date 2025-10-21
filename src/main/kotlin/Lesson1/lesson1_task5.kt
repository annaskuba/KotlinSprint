package org.example.Lesson1

fun main() {

    val secondsInSpace = 6480
    val hours = secondsInSpace/3600
    val minutes = (secondsInSpace-hours*3600)/60
    val seconds = (secondsInSpace-hours*3600) - minutes * 60

    if (hours < 10) {
        print("0$hours")
    } else {
        print(hours)
    }
    print(":")
    if (minutes < 10) {
        print("0$minutes")
    } else {
        print(minutes)
    }
    print(":")
    if (seconds < 10) {
        print("0$seconds")
    } else {
        print(seconds)
    }

}