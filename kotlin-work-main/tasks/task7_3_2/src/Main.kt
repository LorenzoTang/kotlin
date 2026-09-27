// Task 7.3.1: list element access
// name: Tang Le
//Student ID:201912989

fun main() {
    val numbers = mutableListOf(9,3,6,2,8,5)
    println(numbers)

    numbers.add(1)//ADD
    println(numbers)

    numbers.add(0,10)
    println(numbers)

    numbers.addAll(listOf(4,7))//ADDALL
    println(numbers)

    numbers.remove(3)
    println(numbers)//REMOVE

    numbers.clear()//CLEAR
    println(numbers)

    

}