package org.example.lesson3

fun main() {

    var whereFrom = "E2"
    var whereTo = "E4"
    var moveNumber = 1

    println("$whereFrom-$whereTo;$moveNumber")

    whereFrom = "D2"
    whereTo = "D3"
    moveNumber = moveNumber + 1

    println("$whereFrom-$whereTo;$moveNumber")

}