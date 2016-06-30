package mycompany.ja.krk.tictactoe.arbiter;

import mycompany.ja.krk.tictactoe.map.Shape;

/**
 * Created by e.golesor@gmail.com on 24.06.16.
 */
public interface Arbiter {

    boolean areYouHandleThis(String fieldNumber);

    boolean isTheMapFull();

    /**
     * At the beggining the game choose one or the first player will be choosen by default
     *
     * @param shape
     */
    void letToPlay(Shape shape);

    /**
     * getting the current player
     * @return
     */
    Shape whoIsPlaying();

    boolean wantsToContinue();

    Shape whoIsTheWinner();
}
