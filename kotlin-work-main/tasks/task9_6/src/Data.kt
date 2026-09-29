// Task 9.6: readData() function
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002


import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(filename: String): List<Double> = buildList {
    Path(filename).forEachLine { line ->
        add(line.toDouble())
    }
}
