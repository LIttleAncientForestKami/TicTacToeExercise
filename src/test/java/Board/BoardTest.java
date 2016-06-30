package Board;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardTest {

    @Test
    public void appliesMark0AtCenter() {
        // given
        Board board = new Board();
        // when
        board.appliesMark(5, "O");
        // then
        Assert.assertEquals("O", board.getMarkAtField(5));
    }

    @Test
    public void appliesMarkXAtCenter() {
        // given
        Board board = new Board();
        // when
        board.appliesMark(5, "X");
        // then
        Assert.assertEquals("X", board.getMarkAtField(5));
    }
}
