import Throw.Paper
import Winner.P1_WINS
import Winner.P2_WINS

class Rps {
    fun play(p1: Throw, p2: Throw): Winner {
        if (p2 == Paper) {
            return P2_WINS
        }
        return P1_WINS
    }

}
