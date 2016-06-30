package Board;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class BoardTest {

    @Test
    public void appliesMark0AtCenter() {
        // given
        Board board = createBoard();
        // when
        board.appliesMark(5, Mark.CIRCLE);
        // then
        Assert.assertEquals(Mark.CIRCLE, board.getMarkAtField(5));
    }

    @Test
    public void appliesMarkXAtCenter() {
        // given
        Board board = createBoard();
        // when
        board.appliesMark(5, Mark.CROSS);
        // then
        Assert.assertEquals(Mark.CROSS, board.getMarkAtField(5));
    }

    private Board createBoard() {
        HashMap<Integer, Mark> emptyBoard = new HashMap<>();
        return new Board(emptyBoard);
    }
}
