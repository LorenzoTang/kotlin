// Task 12.9: class implementing the Static Factory Method pattern
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
import kotlinx.datetime.LocalDate

class Person private constructor(
    val name: String,
    val birth: LocalDate
) {
    companion object Factory {
        private val names = mutableSetOf<String>()

        fun create(name: String, birth: LocalDate): Person {
            require(name !in names) {
                "Name must be unique!"
            }

            names.add(name)
            return Person(name, birth)
        }
    }
}
