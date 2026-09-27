// Task 8.5: example of using a higher-order function
// name: Tang Le
//Student ID:201912989
fun main() {
    val text = "Hello, Kotlin 123!"

    val vowelCount = text.howMany { it.lowercaseChar() in "aeiou" }
    val digitCount = text.howMany { it.isDigit() }
    val whitespaceCount = text.howMany { it.isWhitespace() }
    val uppercaseCount = text.howMany { it.isUpperCase() }

    println("Text: $text")
    println("Vowels: $vowelCount")
    println("Digits: $digitCount")
    println("Whitespace characters: $whitespaceCount")
    println("Uppercase letters: $uppercaseCount")

    check(vowelCount == text.count { it.lowercaseChar() in "aeiou" })
    check(digitCount == text.count { it.isDigit() })
    check(whitespaceCount == text.count { it.isWhitespace() })
    check(uppercaseCount == text.count { it.isUpperCase() })
}
