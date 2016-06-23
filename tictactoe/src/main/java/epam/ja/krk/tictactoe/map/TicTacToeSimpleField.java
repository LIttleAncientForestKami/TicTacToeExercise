package epam.ja.krk.tictactoe.map;

/**
 * Created by ehsan on 23.06.16.
 */
public class TicTacToeSimpleField implements TicTacToeField {

    private Shape shape = null;

    public Shape shape() {
        return shape;
    }

    public boolean isFree() {
        return true;
    }

    public void put(Shape shape) {
        this.shape = shape;
    }
}
