// Task 7.7.2: database-handling functions
// name: Tang Le
//Student ID:201912989
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    Path(filename).forEachLine { line ->
        val parts = line.split(",", limit = 2)

        if (parts.size == 2) {
            val name = parts[0]
            val phoneNumber = parts[1]
            this[name] = phoneNumber
        }
    }
}

fun Database.save(filename: String) {
    // Add code here to write the keys and values of the map to
    // the file, separated by a comma, one pairing per line

    Path(filename).writer().use { writer ->
        for ((name, phoneNumber) in this) {
            writer.write("$name,$phoneNumber\n")
        }
    }
}
