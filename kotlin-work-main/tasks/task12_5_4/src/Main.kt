// Task 12.5.4: demo program for class with a computed property
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

import kotlinx.datetime.LocalDate

fun main() {
    val person = Person(
        "Alice",
        LocalDate(1997, 8, 23)
    )

    println("Name: ${person.name}")
    println("Date of birth: ${person.birth}")
    println("Age: ${person.age}")
}