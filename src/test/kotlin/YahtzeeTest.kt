import org.example.Yahtzee
import kotlin.test.Test
import kotlin.test.assertEquals

class MainKtTest {
    @Test
    fun testChance() {
        assertEquals(15, Yahtzee(1,2,3,4,5).chance())
    }

    @Test
    fun testOnes() {
        assertEquals(1, Yahtzee(1,2,3,4,5).ones())
        assertEquals(2, Yahtzee(1,2,3,1,5).ones())
    }

    @Test
    fun testPair() {
        assertEquals(8, Yahtzee(1,2,3,4,4).pair())
        assertEquals(6, Yahtzee(1,2,3,3,4).pair())
        assertEquals(10, Yahtzee(1,1,3,5,5).pair())
        assertEquals(0, Yahtzee(1,2,3,4,5).pair())
    }

    @Test
    fun testSmallRun() {
        assertEquals(15, Yahtzee(1,2,3,4,5).smallRun())
        assertEquals(0, Yahtzee(6,5,4,3,2).smallRun())
    }
}
