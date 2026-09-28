// Task 9.2: effect of exceptions on flow of control
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
fun main() {
    println("Entered main()")
    first()
    println("Leaving main()")
}

fun first() {
    println("Entered first()")
    second()
    println("Leaving first()")
}

fun second() {
    println("Entered second()")
    val data = listOf(1, 2, 3, 4, 5)
    println(data[5])
    println("Leaving second()")
}
