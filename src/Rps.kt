import Throw.*
import Winner.*

class Rps {
    fun play(p1: Throw, p2: Throw): Winner {
        if (p1 == p2)
            return TIE

        if (p1 == Rock && p2 == Paper
                || p1 == Scissors && p2 == Rock
                || p1 == Paper && p2 == Scissors)
            return P2_WINS

        return P1_WINS
    }
}
