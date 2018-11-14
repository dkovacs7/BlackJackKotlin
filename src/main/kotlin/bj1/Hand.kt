package bj1

class Hand(val name: String) {

    private val _cards = mutableListOf<Card>()

    //val cards: List<Card> get() = _cards

    val cards: List<Card>
        get() {
            return _cards
        }


    //        val a = fun() {
    //            println(111)
    //        }
    //
    //        val b = fun(p1: Int) = p1 * p1


    // fun add(card: Card) = _cards.add(card)

    fun add(card: Card) {
        _cards.add(card)
    }


    //val size get() = _cards.size

    val size: Int
        get() {
            return _cards.size
        }


    //val points get() = _cards.sumBy { it.points }

//    val points: Int
//        get() {
//            return _cards.sumBy { it.points }
//        }


    val points: Int
        get() {
            var retVal = 0
            _cards.forEach {
                retVal += it.points }
            return retVal
        }



}

