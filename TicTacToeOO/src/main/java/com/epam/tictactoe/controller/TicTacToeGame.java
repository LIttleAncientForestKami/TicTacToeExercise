package com.epam.tictactoe.controller;

import com.epam.tictactoe.board.Board;
import com.epam.tictactoe.board.IBoard;
import com.epam.tictactoe.board.IDimension;
import com.epam.tictactoe.board.Position;
import com.epam.tictactoe.managers.IPlayerManager;
import com.epam.tictactoe.managers.PlayerManager;

/**
 * Created by grzegorz_sledz on 30.06.16.
 */
public class TicTacToeGame{

    private final IBoard board;
    private final IPlayerManager playerManager;

    public TicTacToeGame(IDimension dimension) {
        this.board = new Board(dimension);
        this.playerManager=new PlayerManager();
    }

    public void play(){
        board.placeMark(new Position(5), playerManager.current().sign());
        board.placeMark(new Position(4), playerManager.next().sign());
        board.placeMark(new Position(3), playerManager.next().sign());
        board.placeMark(new Position(2), playerManager.next().sign());
        System.out.println(board);
    }

//
//    void start() {
//        currentPlayer = playerO;
//        IPosition position;
//        int turns = 0;
//        System.out.println(board);
//        do {
//            doMove();
//            turns++;
//            System.out.println(board);
//            if (turns >= 5 && arbiter.isWinner(currentPlayer.winningSeqiences())) {
//                System.out.println("The winner is: " + currentPlayer);
//                stop();
//            }
//            nextPlayer();
//        } while (!board.isFullyFilled());
//        System.out.println("Nobody won");
//    }
//
//    public void doMove() {
//        boolean correctMove = false;
//        do {
//            System.out.println(currentPlayer + " choose field [1-" + dimension.getValue() * dimension.getValue() + "]: ");
//            IPosition position = new Position(input.read());
//            correctMove = board.placeMark(position, currentPlayer.getSign());
//            if (correctMove) {
//                currentPlayer.saveMove(position);
//            } else {
//                System.out.println(position + " is not valid. Try again!!");
//            }
//        } while (!correctMove);
//    }
//
//    private void stop() {
//        System.exit(0);
//    }
}
