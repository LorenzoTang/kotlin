// Task 3.2: numeric conversion example
//Name: Tang Le 
//ID: 201912989 
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: integer required on command line")
        exitProcess(1)
    }

    val number = args[0].toInt()
    println(number * number)
}
