// Task 5.5: main program
//Name: Tang Le 
//ID: 201912989 

fun main(args: Array<String>){
    if (args.size != 2) {
        println("Error: two words required")
        return
    }
    val first = args[0]
    val second = args[1]

    if (first anagramsOf second) {
        println("\"$first\" and \"$second\" are anagrams.")
    } else {
        println("\"$first\" and \"$second\" are not anagrams.")
    }
    
}