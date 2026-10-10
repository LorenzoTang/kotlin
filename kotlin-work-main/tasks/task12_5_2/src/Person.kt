// Task 12.5.2: class with a custom getter
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
import kotlinx.datetime.LocalDate

class Person(_name: String, val birth: LocalDate) {
    var isMarried = false

    var name = _name
        get() {
            return field.uppercase()
        }
}
