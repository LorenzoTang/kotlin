// Task 12.9: demo program for class implementing Static Factory Method
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

import kotlinx.datetime.LocalDate

fun main() {
    


    val anotherPerson = Person.create(
        "Sarah",
        LocalDate(2000, 1, 1)
    )

    println(anotherPerson.name)
    println(anotherPerson.birth)
}
