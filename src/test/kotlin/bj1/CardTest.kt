package bj1

import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertEquals
import kotlin.test.junit.JUnitAsserter.fail

class CardTest {

    @Test
    fun t1() {

        val c1 = Card(value = 1, suit = 1)
        val c2 = Card(value = 13, suit = 4)

        assertEquals(1, c1.value)
        assertEquals(1, c1.suit)
        assertEquals("Spades", c1.suitName)
        assertEquals("Ace", c1.valueName)
        assertEquals("Ace of Spades", c1.name)
        assertEquals(1, c1.points)

        assertEquals(13, c2.value)
        assertEquals(4, c2.suit)
        assertEquals("Diamonds", c2.suitName)
        assertEquals("King", c2.valueName)
        assertEquals("King of Diamonds", c2.name)
        assertEquals(10, c2.points)


        try {
            Card(value = 1, suit = 5)
            fail("Should never get here")
        } catch (e: IllegalArgumentException) {
            //good
        }

        try {
            Card(value = 14, suit = 1)
            fail("Should never get here")
        } catch (e: IllegalArgumentException) {
            //good
        }

    }


    @Test
    fun t2() {

        val r = 1..4
        println(r.contains(6))
        println(6 in r)

    }
}