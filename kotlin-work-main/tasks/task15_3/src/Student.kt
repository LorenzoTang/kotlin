// Task 15.3: Student class, demonstrating method overriding
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
class Student(val degree: String): Person() {
    override fun speak() {
        println("I am a student, studying $degree")
    }
}