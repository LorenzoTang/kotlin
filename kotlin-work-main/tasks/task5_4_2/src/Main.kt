// Task 5.4.2: main program
//Name: Tang Le 
//ID: 201912989 

fun main() {
    val shortText = "Hello"
    val exactText = "12345678901234567890"
    val longText = "123456789012345678901"

    println("${shortText.length}: ${shortText.isTooLong}") 
    println("${exactText.length}: ${exactText.isTooLong}")  
    println("${longText.length}: ${longText.isTooLong}")  

}