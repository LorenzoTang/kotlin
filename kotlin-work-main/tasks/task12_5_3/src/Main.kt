// Task 12.5.3: demo program for class with custom setter
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

import kotlinx.datetime.LocalDate

fun main() {
    val person = Person(
        "Alice",
        LocalDate(1997, 8, 23)
    )

    person.name = ""

    println(person.name)
}