// Task 12.3.2: demo of Person class with secondary constructor
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002


import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(1997, 8, 23)
    val person = Person("Alice", date)

    println("Name: ${person.name}")
    println("Date of birth: ${person.birth}")
    println("Married: ${person.isMarried}")
}
