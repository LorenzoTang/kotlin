// Task 3.5: simple file I/O
//Name: Tang Le 
//ID: 201912989 
import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val file = Path("test.txt")
    file.writeText("This is the first line of text.\n")
    file.appendText("This is the second line of text.")

    val text = file.readText()
    println(text)
}
