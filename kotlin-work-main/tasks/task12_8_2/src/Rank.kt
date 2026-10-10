// Task 12.8.2: enum class for playing card ranks
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

enum class Rank(val symbol: Char) {
    Ace('A'),
    Two('2'),
    Three('3'),
    Four('4'),
    Five('5'),
    Six('6'),
    Seven('7'),
    Eight('8'),
    Nine('9'),
    Ten('T'),
    Jack('J'),
    Queen('Q'),
    King('K');

    override fun toString() = "$symbol"
}