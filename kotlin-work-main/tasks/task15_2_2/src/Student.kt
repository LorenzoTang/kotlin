// Task 15.2.2: Student subclass, showing invocation of constructor
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

class Student(name: String, val degree: String): Person(name) {
    init {
        println("Student constructor invoked")
    }
}
