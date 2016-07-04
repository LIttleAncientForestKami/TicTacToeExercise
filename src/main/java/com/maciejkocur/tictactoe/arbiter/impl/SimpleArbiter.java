package com.maciejkocur.tictactoe.arbiter.impl;

import com.maciejkocur.tictactoe.arbiter.Arbiter;
import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.board.Mark;
import com.maciejkocur.tictactoe.board.impl.Field;
import com.maciejkocur.tictactoe.engine.GameStatus;

import java.util.Set;

public class SimpleArbiter implements Arbiter {
    private final Board board;
    private GameStatus status;

    public SimpleArbiter(Board board) {
        this.status = GameStatus.PLAYING;
        this.board = board;
    }

    @Override
    public boolean isGameOver(Field lastMove) {
        return checkWinningCondition(lastMove) || isDraw(board.getAvailableFields());
    }

    @Override
    public void announceResult() {
        if (status == GameStatus.O_WINS) {
            System.out.println("Player O wins!");
        } else if (status == GameStatus.X_WINS) {
            System.out.println("Player X wins!");
        } else if (status == GameStatus.DRAW) {
            System.out.println("Draw!");
        } else {
            System.out.println("Still Playing!");
        }
    }

    private boolean isDraw(Set<Field> availableFields) {
        if (availableFields.isEmpty()) {
            status = GameStatus.DRAW;
            return true;
        } else {
            return false;
        }
    }

    boolean checkWinningCondition(Field lastMove) {
        if (checkWinningConditionForVertical(lastMove)
                || checkWinningConditionForHorizontal(lastMove)
                || checkWinningConditionForPrimaryDiagonal(lastMove)
                || checkWinningConditionForSecondaryDiagonal(lastMove)) {
            updateGameStatus(lastMove);
            return true;
        }
        return false;
    }

    private void updateGameStatus(Field lastMove) {
        if (board.getMarkAtField(lastMove) == Mark.CROSS) {
            status = GameStatus.X_WINS;
        } else {
            status = GameStatus.O_WINS;
        }
    }


    private boolean checkWinningConditionForVertical(Field lastMove) {
        Mark mark = board.getMarkAtField(lastMove);
        Set<Field> sequence = lastMove.getColumn();
        return resolveSequence(mark, sequence);
    }


    private boolean checkWinningConditionForHorizontal(Field lastMove) {
        Mark mark = board.getMarkAtField(lastMove);
        Set<Field> sequence = lastMove.getRow();
        return resolveSequence(mark, sequence);
    }

    private boolean checkWinningConditionForPrimaryDiagonal(Field lastMove) {
        Mark mark = board.getMarkAtField(lastMove);
        Set<Field> sequence = lastMove.getPrimaryDiagonal();
        return resolveSequence(mark, sequence);
    }

    private boolean checkWinningConditionForSecondaryDiagonal(Field lastMove) {
        Mark mark = board.getMarkAtField(lastMove);
        Set<Field> sequence = lastMove.getSecondaryDiagonal();
        return resolveSequence(mark, sequence);
    }

    private boolean resolveSequence(Mark mark, Set<Field> sequence) {
        for (Field field : sequence) {
            if (board.getMarkAtField(field) != mark) {
                return false;
            }
        }
        return true;
    }
}