// Task 12.3.2: demo of Person class with secondary constructor
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002


import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("Alice", "1997-08-23")

    println("Name: ${person.name}")
    println("Date of birth: ${person.birth}")
    println("Married: ${person.isMarried}")
}
