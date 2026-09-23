// Task 5.3.2: rollDice() function
//Name: Tang Le 
//ID: 201912989 
import kotlin.random.Random

fun rollDice(number: Int = 1, sides: Int = 6) {
    if (sides in setOf(4,6,8,10,12,20)) {
        var total = 0

        repeat(number) {
            total += Random.nextInt(1, sides + 1)
        }

        println("Rolled ${number} d$sides...")
        println("Total score: $total")
    } else {
        println("Error: cannot have a $sides-sided die")
    }
}