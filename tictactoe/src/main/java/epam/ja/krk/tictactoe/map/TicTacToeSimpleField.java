package epam.ja.krk.tictactoe.map;

public class TicTacToeSimpleField implements TicTacToeField {

    private Shape shape = null;

    /**
     *
     * @return The shape of the field
     */
    public Shape shape() {
        return shape;
    }

    public boolean isFree() {
        return this.shape==null;
    }

    public void put(Shape shape) {
        this.shape = shape;
    }
}
