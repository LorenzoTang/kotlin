// Task 5.1.2: main program
//Name: Tang Le 
//ID: 201912989 

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: one number of die sides required")
        return
    }

    val sides = args[0].toInt()
    rollDie(sides)
}