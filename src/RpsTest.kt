import Throw.*
import Winner.P1_WINS
import Winner.P2_WINS
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RpsTest {
    private val rps: Rps = Rps()

    @Test
    fun rockVsScissors() {
        assertEquals(P1_WINS, rps.play(Rock, Scissors))
    }

    @Test
    fun rockVsPaper() {
        assertEquals(P2_WINS, rps.play(Rock, Paper))
    }

    @Test
    fun scissorsVsPaper() {
        assertEquals(P1_WINS, rps.play(Scissors, Paper))
    }

    @Test
    fun scissorsVsRock() {
        assertEquals(P2_WINS, rps.play(Scissors, Rock))
    }
}