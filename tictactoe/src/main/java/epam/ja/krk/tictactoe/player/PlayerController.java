package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;

/**
 * Created by ehsan on 28.06.16.
 */
public interface PlayerController {

    PlayerType getTypeOfPlayer(Shape shape);

    Player whoPlaysAs(Shape shape);
}
