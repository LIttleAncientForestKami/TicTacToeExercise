package com.maciejkocur.tictactoe.arbiter.impl;

import com.maciejkocur.tictactoe.arbiter.Arbiter;
import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.board.Mark;
import com.maciejkocur.tictactoe.board.impl.Field;
import com.maciejkocur.tictactoe.board.impl.SimpleMapBoard;
import com.maciejkocur.tictactoe.board.impl.SimpleMapBoardBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimpleArbiterTest {

    @Test
    public void endsGameWhenOInRow() {
        //given
        Board board = createBoard(move(2, Mark.CIRCLE), move(3, Mark.CIRCLE), move(1, Mark.CIRCLE));
        Arbiter arbiter = new SimpleArbiter(board);
        //when
        boolean endGame = arbiter.isGameOver(new Field(1));
        //then
        Assert.assertEquals(endGame, true);
    }

    @Test
    public void endsGameWhenXInRow() {
        //given
        Board board = createBoard(move(2, Mark.CROSS), move(3, Mark.CROSS), move(1, Mark.CROSS));
        Arbiter arbiter = new SimpleArbiter(board);
        //when
        boolean endGame = arbiter.isGameOver(new Field(1));
        //then
        Assert.assertEquals(endGame, true);
    }

    @Test
    public void endsGameWhenOInColumn() {
        //given
        Board board = createBoard(move(4, Mark.CIRCLE), move(7, Mark.CIRCLE), move(1, Mark.CIRCLE));
        Arbiter arbiter = new SimpleArbiter(board);
        //when
        boolean endGame = arbiter.isGameOver(new Field(1));
        //then
        Assert.assertEquals(endGame, true);
    }

    @Test
    public void endsGameWhenXInColumn() {
        //given
        Board board = createBoard(move(4, Mark.CROSS), move(7, Mark.CROSS), move(1, Mark.CROSS));
        Arbiter arbiter = new SimpleArbiter(board);
        //when
        boolean endGame = arbiter.isGameOver(new Field(1));
        //then
        Assert.assertEquals(endGame, true);
    }

    @Test
    public void endsGameWhenOInPrimaryDiagonal() {
        //given
        Board board = createBoard(move(5, Mark.CIRCLE), move(9, Mark.CIRCLE), move(1, Mark.CIRCLE));
        Arbiter arbiter = new SimpleArbiter(board);
        //when
        boolean endGame = arbiter.isGameOver(new Field(1));
        //then
        Assert.assertEquals(endGame, true);
    }

    @Test
    public void endsGameWhenXInPrimaryDiagonal() {
        //given
        Board board = createBoard(move(5, Mark.CROSS), move(9, Mark.CROSS), move(1, Mark.CROSS));
        Arbiter arbiter = new SimpleArbiter(board);
        //when
        boolean endGame = arbiter.isGameOver(new Field(1));
        //then
        Assert.assertEquals(endGame, true);
    }

    @Test
    public void endsGameWhenOInSecondaryDiagonal() {
        //given
        Board board = createBoard(move(3, Mark.CIRCLE), move(7, Mark.CIRCLE), move(5, Mark.CIRCLE));
        Arbiter arbiter = new SimpleArbiter(board);
        //when
        boolean endGame = arbiter.isGameOver(new Field(5));
        //then
        Assert.assertEquals(endGame, true);
    }

    @Test
    public void endsGameWhenXInSecondaryDiagonal() {
        //given
        Board board = createBoard(move(3, Mark.CROSS), move(7, Mark.CROSS), move(5, Mark.CROSS));
        Arbiter arbiter = new SimpleArbiter(board);
        //when
        boolean endGame = arbiter.isGameOver(new Field(5));
        //then
        Assert.assertEquals(endGame, true);
    }

    @Test
    public void endsGameWhenMovesNotAvailable() {
        //given
        Board board = createBoard(
                move(1, Mark.CROSS), move(2, Mark.CIRCLE), move(3, Mark.CROSS),
                move(4, Mark.CROSS), move(5, Mark.CIRCLE), move(6, Mark.CIRCLE),
                move(7, Mark.CIRCLE), move(8, Mark.CROSS), move(9, Mark.CROSS));
        Arbiter arbiter = new SimpleArbiter(board);
        //when
        boolean endGame = arbiter.isGameOver(new Field(9));
        //then
        Assert.assertEquals(endGame, true);
    }

    private Object move(int position, Mark mark) {
        return new Object[]{position, mark};
    }

    private Board createBoard(Object... objects) {
        Map<Field, Mark> board = new SimpleMapBoardBuilder().createMap();
        for (int i = 0; i < objects.length; i++) {
            Object[] field = (Object[]) objects[i];
            Integer position = (Integer) field[0];
            Mark mark = (Mark) field[1];
            board.put(new Field(position), mark);
        }
        return new SimpleMapBoard(board);
    }

    private Set<Field> moves(int... moves) {
        HashSet<Field> availableMoves = new HashSet<>();
        for (int move : moves) {
            availableMoves.add(new Field(move));
        }
        return availableMoves;
    }
}