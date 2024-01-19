import org.example.Yahtzee
import kotlin.test.Test
import kotlin.test.assertEquals

class MainKtTest {
    @Test
    fun testChance() {
        assertEquals(Yahtzee(1,2,3,4,5).chance(), 15)
    }

    @Test
    fun testOnes() {
        assertEquals(Yahtzee(1,2,3,4,5).ones(),1)
        assertEquals(Yahtzee(1,2,3,1,5).ones(),2)
    }

    @Test
    fun testPair() {
        assertEquals(Yahtzee(1,2,3,4,4).pair(),8)
        assertEquals(Yahtzee(1,2,3,3,4).pair(),6)
    }

    @Test
    fun testSmallRun() {
        assertEquals(Yahtzee(1,2,3,4,5).smallRun(), 15)
        assertEquals(Yahtzee(6,5,4,3,2).smallRun(), 0)
    }
}
