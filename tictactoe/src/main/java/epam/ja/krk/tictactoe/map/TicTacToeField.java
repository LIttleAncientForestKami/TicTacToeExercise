package epam.ja.krk.tictactoe.map;

/**
 * Created by ehsan on 23.06.16.
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
