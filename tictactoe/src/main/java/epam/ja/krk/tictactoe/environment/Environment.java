package epam.ja.krk.tictactoe.environment;

import epam.ja.krk.tictactoe.map.Shape;

/**
 * Created by ehsan on 24.06.16.
 */
public interface Environment {
    void runTheGame();

    Shape getTheWinner();

}
