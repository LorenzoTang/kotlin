// Task 12.8.2: program to manipulate playing cards
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002

fun main() {
    val deck = mutableListOf<Card>()

    for (suit in Suit.values()) {
        for (rank in Rank.values()) {
            deck.add(Card(rank, suit))
        }
    }

    deck.shuffle()

    for (card in deck) {
        println(card.fullName)
    }
}