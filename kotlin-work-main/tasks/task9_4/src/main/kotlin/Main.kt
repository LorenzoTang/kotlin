// Task 9.4: use of catch blocks
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
fun main() {
    try {
        print("Enter numerator: ")
        val numerator = readln().toInt()
        print("Enter denominator: ")
        val denominator = readln().toInt()

        val result = numerator / denominator
        val remainder = numerator % denominator
        println("Result = $result remainder $remainder")
    }
    catch (error: NumberFormatException) {
        println("You didn't enter a valid number")
    }
    catch (error: IllegalArgumentException) {
        println("Illegal argument")
    }
    
    catch (error: ArithmeticException) {
        println("You tried to divide by zero")
    }            //these are the lines that could be deleted.

    catch (error: Exception) {
        println("Some sort of error occurred")
    }
}
