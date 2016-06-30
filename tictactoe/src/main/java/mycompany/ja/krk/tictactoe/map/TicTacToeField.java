package mycompany.ja.krk.tictactoe.map;

/**
 * Created by e.golesor@gmail.com on 23.06.16.
 */
public interface TicTacToeField {

    /**
     * The shape of the field
     * @return
     */
    Shape shape();


    boolean isFree();

    void put(Shape o);
}
