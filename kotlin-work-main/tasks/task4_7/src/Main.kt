// Task 4.7: finding the longest line in a file
//Name: Tang Le 
//ID: 201912989 
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 1) {
        println("Error: one input file required.")
        exitProcess(1)
    }
    val filePath = Path(args[0])

    var lineNumber = 0
    var longestLineNumber = 0
    var longestLength = 0

    filePath.forEachLine{ line ->
        lineNumber++

        if(line.length > longestLength) {
            longestLength = line.length
            longestLineNumber = lineNumber
        }
    }
    println("Line $longestLineNumber is the longest (length = $longestLength)")
}