// Task 12.8.1: demo program for Day enum class
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

fun main() {
    print("Enter a day: ")
    val input = readln()

    val day = Day.entries.firstOrNull {
        it.name.equals(input, ignoreCase = true)
    }

    if (day == null) {
        println("Invalid day: $input")
        println("Please choose one of: ${Day.entries.joinToString()}")
    } else {
        println("You entered $day")
    }
}
