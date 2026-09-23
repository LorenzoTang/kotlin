// Task 5.3.2: main program
//Name: Tang Le 
//ID: 201912989 

fun  main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: one dice specification required")
        return
    }

    val specification = args[0]
    val number = specification.substringBefore('d').toInt()
    val sides = specification.substringAfter('d').toInt()

    rollDice(number = number, sides = sides)
}