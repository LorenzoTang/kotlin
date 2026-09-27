//name: Tang Le, Student ID: 201912989
// Task 3.1: command line arguments
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Please provide exactly two command line arguments.")
        exitProcess(1)
    }
    
    println(args[0])
    println(args[1])
}