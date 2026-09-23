// Task 5.4.1: main program
//Name: Tang Le 
//ID: 201912989 

fun main() {
    val shortText = "Hello"
    val exactText = "12345678901234567890"
    val longText = "123456789012345678901"

    println(shortText.isTooLong()) // Output: false
    println(exactText.isTooLong()) // Output: false
    println(longText.isTooLong())  // Output: true
}