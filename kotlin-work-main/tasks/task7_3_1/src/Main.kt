// Task 7.3.1: list element access
// name: Tang Le
//Student ID:201912989

fun main() {
    val numbers = listOf(9,3,6,2,8,5)
    println(numbers)


    println(numbers[0])
    println(numbers.get(0))
    
    println(numbers[5])
    println(numbers.slice(2..4))

    println(numbers.first())
    println(numbers.last())

    numbers[0] = 10

    numbers.add(1)
}