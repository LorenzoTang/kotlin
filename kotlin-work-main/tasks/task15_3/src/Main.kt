// Task 15.3: program demonstrating dynamic binding
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
fun main() {
    val p = Person()
    p.speak()

    val s = Student("Computer Science")
    s.speak()

    val p2: Person = Student("Math")
    p2.speak()
}