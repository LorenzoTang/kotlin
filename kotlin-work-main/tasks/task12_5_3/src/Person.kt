// Task 12.5.3: class with a custom setter
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
import kotlinx.datetime.LocalDate

class Person(_name: String, val birth: LocalDate) {
    var isMarried = false

    var name = _name
        set(value) {
           require(value.isNotBlank()) {
            "Name cannot be blank"
           }

           field = value
        }
}
