// Task 12.5.4: class with a computed property
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
import kotlinx.datetime.LocalDate
import kotlinx.datetime.yearsUntil
    

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    val age
        get() = birth.yearsUntil(today())
}
