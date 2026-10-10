// Task 12.3.2: Person class with secondary constructor
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002


import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    constructor(name: String, birth: String) :
            this(name, LocalDate.parse(birth))
}
