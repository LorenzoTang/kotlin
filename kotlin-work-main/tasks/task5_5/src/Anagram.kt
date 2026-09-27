// Task 5.5: anagrams() function
//Name: Tang Le 
//ID: 201912989 


infix fun String.anagramsOf(other: String): Boolean {
    if (this.length != other.length) {
        return false
    }

    val firstChars = this.lowercase().toList().sorted()
    val secondChars = other.lowercase().toList().sorted()

    return firstChars == secondChars
}
