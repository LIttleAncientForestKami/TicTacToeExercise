package mycompany.ja.krk.tictactoe.environment;

import mycompany.ja.krk.tictactoe.map.Shape;

/**
 * Created by e.golesor@gmail.com on 24.06.16.
 */
public interface Environment extends Runnable{
    Shape getTheWinner();

}
