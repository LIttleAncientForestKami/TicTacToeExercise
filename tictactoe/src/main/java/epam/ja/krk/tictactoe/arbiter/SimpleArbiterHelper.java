package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;

import java.util.List;

/**
 * Created by ehsan on 27.06.16.
 */
public class SimpleArbiterHelper implements ArbiterHelper {

    private final TicTacToeMap map;

    public SimpleArbiterHelper(TicTacToeMap map) {
        this.map = map;
    }

    public List<DirectionFieldNumber> getTheDirectionsThatHaveTheShape(Shape shape, String fieldNumber) {

        
        return null;

    }

}
