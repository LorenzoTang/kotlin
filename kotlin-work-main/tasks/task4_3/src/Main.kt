// Task 4.3: grade calculation using a when expression
//Name: Tang Le 
//ID: 201912989 
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if(args.size != 3){
        println("Error: exactly three marks are required")
        exitProcess(1)
    }

    val mark1 = args[0].toDouble()
    val mark2 = args[1].toDouble()
    val mark3 = args[2].toDouble()

    val average = (mark1 + mark2 + mark3) / 3.0
    val roundedAverage = average.roundToInt()

    val grade = when(roundedAverage){
        in 70..100 -> "Distinction"
        in 40..69 -> "Pass"
        in 0..39 -> "Fail"
        else -> "Invalid mark"
    }
    println("Average: $roundedAverage")
    println(grade)
}