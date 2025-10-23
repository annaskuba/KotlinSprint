package org.example.Lesson2

const val BUFF_COEFFICIENT = 0.2

fun main() {

    val buffIsOn = true
    val crystalOre = 7
    val ironOre = 11
    var bonusCrystalOre = 0
    var bonusIronOre = 0

    if (buffIsOn == true) {
        bonusCrystalOre = (crystalOre * BUFF_COEFFICIENT).toInt()
        bonusIronOre = (ironOre * BUFF_COEFFICIENT).toInt()
    }

    println("Кристаллическая руда: $bonusCrystalOre")
    println("Железная руда: $bonusIronOre")

}