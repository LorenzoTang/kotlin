// Task 12.7: data classes vs regular classes
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
import kotlinx.datetime.LocalDate

data class Person(
    var name: String, 
    val birth: LocalDate, 
    var isMarried: Boolean = false)
