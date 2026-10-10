// Task 12.8.2: class to represent playing cards
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

class Card(
    val rank: Rank,
    val suit: Suit
) {
    val fullName
        get() = "${rank.name} of ${suit.name}"
    
    override fun toString() = "$rank$suit"
}
