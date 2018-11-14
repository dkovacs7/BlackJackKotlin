package bj1

class Hand(val name: String) {

    private val _cards = mutableListOf<Card>()

    val cards: List<Card> get() = _cards

    fun add(card: Card) = _cards.add(card)

    val size get() = _cards.size

    val points get() = _cards.sumBy { it.points }

}

