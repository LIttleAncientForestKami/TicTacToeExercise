package epam.ja.krk.tictactoe.map;

/**
 * Created by ehsan on 23.06.16.
 */
public interface TicTacToeMap {

    boolean hasFreeFieldOn(String fieldNumber);

    boolean hasShapeOnTheField(String fieldNumber, Shape shape);

    boolean putInTheField(String key, Shape shape);

}
