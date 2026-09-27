// Task 8.3: weather station temperature analysis program
// name: Tang Le
//Student ID:201912989
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.isEmpty()) {
        println("Usage: provide the name of a CSV file")
        exitProcess(1)
    }

    val data = fetchData(args[0])

    if (data.isEmpty()) {
        println("The data file contains no temperature records")
        exitProcess(1)
    }

    val lowest = data.minBy { it.second }
    val highest = data.maxBy { it.second }
    val average = data.map { it.second }.average()

    println("Lowest temperature: ${lowest.first}, ${lowest.second}")
    println("Highest temperature: ${highest.first}, ${highest.second}")
    println("Average temperature: $average")
}
