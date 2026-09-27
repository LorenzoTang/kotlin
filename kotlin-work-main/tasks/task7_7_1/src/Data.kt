// Task 7.7.1: data handling functions
// name: Tang Le
//Student ID:201912989

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(filename: String) = buildList {
    Path(filename).forEachLine {
        add(it.toFloat())
    }
}
