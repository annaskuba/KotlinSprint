package org.example.Lesson2

const val BONUS_PERCENTAGE = 20
const val PERCENT_FORMATTER = 100

fun main() {

    val buffCoefficient = BONUS_PERCENTAGE / PERCENT_FORMATTER
    val buffIsOn = true
    val crystalOre = 7
    val ironOre = 11
    var bonusCrystalOre = 0
    var bonusIronOre = 0

    if (buffIsOn == true) {
        bonusCrystalOre = (crystalOre * buffCoefficient).toInt()
        bonusIronOre = (ironOre * buffCoefficient).toInt()
    }

    println("Кристаллическая руда: $bonusCrystalOre")
    println("Железная руда: $bonusIronOre")

}