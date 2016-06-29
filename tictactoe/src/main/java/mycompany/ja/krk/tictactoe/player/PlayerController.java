package mycompany.ja.krk.tictactoe.player;

import mycompany.ja.krk.tictactoe.map.Shape;

/**
 * Created by ehsan on 28.06.16.
 */
public interface PlayerController {

    /**
     * Getting the type of the player that has the shape
     * @param shape
     * @return the PlayerType
     */
    PlayerType getTypeOfPlayer(Shape shape);

    /**
     * getting the player by his shape
     * @param shape
     * @return
     */
    Player whoPlaysAs(Shape shape);
}
