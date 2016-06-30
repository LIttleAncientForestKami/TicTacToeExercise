package com.tdudzik.tictactoe.ui;

import com.tdudzik.tictactoe.logic.board.Board;
import com.tdudzik.tictactoe.logic.board.Mark;
import com.tdudzik.tictactoe.logic.board.Position;
import com.tdudzik.tictactoe.logic.io.OutputOperations;
import com.tdudzik.tictactoe.logic.player.Player;

public class ConsoleOutputOperations implements OutputOperations {

    @Override
    public void drawBoard(Board board) {
        Position currentPosition = Position.of(1);

        System.out.println();
        for (int i = 0; i < board.getSize().getValue(); i++) {
            System.out.print(" | ");
            for (int j = 0; j < board.getSize().getValue(); j++) {
                String mark;
                if (!board.isOccupied(currentPosition)) {
                    mark = String.valueOf(currentPosition.getValue());
                } else {
                    mark = board.markOn(currentPosition).equals(Mark.X) ? "X" : "O";
                }
                currentPosition = currentPosition.next();
                System.out.print(mark + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void gameWasWon(Board board, Player winner) {
        drawBoard(board);
        System.out.println("The winner is: " + winner.getName() + ". :)");
    }

    @Override
    public void gameEndedInDraw(Board board) {
        drawBoard(board);
        System.out.println("There is no winner. :(");
    }

}
