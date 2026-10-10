// Task 12.8.2: enum class for playing card suits
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
enum class Suit(val symbol: Char) {
    Clubs('♣'),
    Diamonds('♦'),
    Hearts('♥'),
    Spades('♠');

    val plainSymbol get() = name[0]

    override fun toString() = "$symbol"
}
