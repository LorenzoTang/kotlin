// Task 10.3.1
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun loadDatabase(filename: String) = buildMap {
    Path(filename).forEachLine {
        val parts = it.split(",")
        put(parts[0].trim(), parts[1].trim())
    }
}
