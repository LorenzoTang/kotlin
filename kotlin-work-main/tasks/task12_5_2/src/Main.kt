// Task 12.5.2: demo program for class with custom getter
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
import kotlinx.datetime.LocalDate

fun main() {
    val person = Person(
        "Alice",
        LocalDate(1997,8,23)
    )

    println(person.name)
}