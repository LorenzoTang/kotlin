// Task 7.2: array comparison
//Name: Tang Le 
//ID: 201912989

fun main() {
    val first = arrayOf(1,2,3)
    val second = arrayOf(1,2,3)

    println(first == second)

    println(first.contentEquals(second))

    val third = first

    println(first == third)
    println(first === third)


    val different = arrayOf(1, 2, 4)
    println(first.contentEquals(different))

}