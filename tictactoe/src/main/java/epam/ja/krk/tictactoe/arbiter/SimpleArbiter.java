package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;

/**
 * Created by ehsan on 24.06.16.
 */
public class SimpleArbiter implements Arbiter {

    private TicTacToeMap ticTacToeMap;

    private int moveCounter;

    public SimpleArbiter(TicTacToeMap map) {
        this.ticTacToeMap = map;
    }

    public boolean putXO(String fieldNumber, Shape shape) {
        boolean isPut = false;
        if(ticTacToeMap.hasFreeFieldOn(fieldNumber)){
            isPut = ticTacToeMap.putInTheField(fieldNumber, shape);
        }
        if(isPut){
            moveCounter++;
        }
        return isPut;
    }

    public boolean isTheMapFull() {
        return (moveCounter>=9);
    }


}
