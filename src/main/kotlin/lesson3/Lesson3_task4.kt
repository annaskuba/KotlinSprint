package org.example.lesson3

fun main() {
    val chessMove = "D2-D4;0"
    val parts = chessMove.split("-", ";")

    val fromWhere = parts[0]
    val toWhere = parts[1]
    val moveCounter = parts[2].toInt()

    println(
        """
        $fromWhere
        $toWhere
        $moveCounter
    """.trimIndent()
    )

}