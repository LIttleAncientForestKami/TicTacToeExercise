package mycompany.ja.krk.tictactoe.map;

public class TicTacToeSimpleField implements TicTacToeField {

    private Shape shape = null;

    /**
     * This key helps us to debug easier and have more simple and general toString implementation for all fields
     */
    private String key = "";

    public TicTacToeSimpleField() {
    }

    public TicTacToeSimpleField(String key) {
        this.key = key;
    }

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

    public String toString(){
        String str = key;
        if(!isFree()){
            str = shape.toString();
        }
        return str;
    }
}
