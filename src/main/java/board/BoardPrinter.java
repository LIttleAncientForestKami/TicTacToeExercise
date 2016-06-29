package board;

import java.util.List;

public class BoardPrinter {
    private Board board;

    public BoardPrinter(Board board) {
        this.board = board;
    }

    public void printBoard() {
        List<Field> fields = board.returnFields();
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            builder.append(fields.get(i - 1));
            if (i % 3 == 0) builder.append("\n");
        }
        System.out.println(builder);
    }
}
