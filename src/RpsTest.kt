import Throw.*
import Winner.*
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

    @Test
    fun paperVsRock() {
        assertEquals(P1_WINS, rps.play(Paper, Rock))
    }

    @Test
    fun paperVsScissors() {
        assertEquals(P2_WINS, rps.play(Paper, Scissors))
    }

    @Test
    fun rockTie() {
        assertEquals(TIE, rps.play(Rock, Rock))
    }

    @Test
    fun scissorsTie() {
        assertEquals(TIE, rps.play(Scissors, Scissors))
    }

    @Test
    fun paperTie() {
        assertEquals(TIE, rps.play(Paper, Paper))
    }
}