package org.example.lesson3

fun main() {

    val maidenSurname = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val marriedSurname = "Сидорова"
    val firstAge = 20
    val secondAge = 22

    val fullData = """
        $maidenSurname $name $patronymic, $firstAge
        $marriedSurname $name $patronymic, $secondAge
    """.trimIndent()

    println(fullData)

}