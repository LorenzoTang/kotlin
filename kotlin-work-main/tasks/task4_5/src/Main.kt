// Task 4.5: summing odd integers with a for loop
//Name: Tang Le 
//ID: 201912989 
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Error: one integer limit required.")
        exitProcess(1)
    }


    val limit = args[0].toInt()
    var sum = 0L
    
    for (number in 1..limit step 2) {
        sum += number.toLong()
    }
    println(sum)
}
