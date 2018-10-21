import Throw.*
import Winner.P1_WINS
import Winner.P2_WINS

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


        return P1_WINS
    }
}
