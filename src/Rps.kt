import Throw.*
import Winner.*

class Rps {
    fun play(p1: Throw, p2: Throw): Winner {
        if (p1 == Rock && p2 == Scissors) {
            return P1_WINS
        }

        if (p1 == Rock && p2 == Paper) {
            return P2_WINS
        }

        if (p1 == Scissors && p2 == Paper) {
            return P1_WINS
        }

        if (p1 == Scissors && p2 == Rock) {
            return P2_WINS
        }

        if (p1 == Paper && p2 == Scissors) {
            return P2_WINS
        }

        if (p1 == Rock && p2 == Rock) {
            return TIE
        }

        if (p1 == Scissors && p2 == Scissors) {
            return TIE
        }

        if (p1 == Paper && p2 == Paper) {
            return TIE
        }


        return P1_WINS
    }
}
