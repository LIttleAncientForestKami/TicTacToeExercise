package board;

// adds a single field onto particular board
public class FieldAdder {
    public void addField(Board board, Integer position, Mark mark) {
        board.addAMove(position, mark);
    }
}
