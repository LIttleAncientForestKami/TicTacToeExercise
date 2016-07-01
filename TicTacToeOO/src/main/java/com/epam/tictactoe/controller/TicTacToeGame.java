package com.epam.tictactoe.controller;

import com.epam.tictactoe.board.*;
import com.epam.tictactoe.input.ConsoleInput;
import com.epam.tictactoe.input.IInput;
import com.epam.tictactoe.managers.IPlayerManager;
import com.epam.tictactoe.managers.PlayerManager;
import com.epam.tictactoe.player.IPlayer;

/**
 * Created by grzegorz_sledz on 30.06.16.
 */
public class TicTacToeGame {

    private final IBoard board;
    private final IDimension dimension;
    private final IPlayerManager playerManager;
    private final IInput console;
    private int correctTurns;

    public TicTacToeGame(IDimension dimension) {
        this.board = new Board(dimension);
        this.dimension = dimension;
        this.playerManager = new PlayerManager();
        this.console = new ConsoleInput();
    }

    public TicTacToeGame playO(){
        makeTurn(playerManager.playerO());
        return this;
    }
    public TicTacToeGame playX(){
        makeTurn(playerManager.playerX());
        return this;
    }

    private void makeTurn(IPlayer player){
        doMove(player);
        System.out.println(board);
        checkIsWinner(player);
    }

    private void checkIsWinner(IPlayer player ){
        if(board.checkIsFullyFilled()){
            System.out.println("Nobody won");
        }
    }

    private void doMove(IPlayer player) {
        boolean isCorrectMove = false;
        IPosition toPosition;
        do {
            System.out.println(player + " choose field [1-" + dimension.value() * dimension.value() + "]: ");
             toPosition = new Position(console.readInt());
            isCorrectMove = board.placeMark(toPosition, player.sign());
            if (!isCorrectMove) {
                System.out.println(toPosition + " is not valid. Try again!!");
            }
        } while (!isCorrectMove);
        player.saveTurn(toPosition);
    }

    private void stop() {
        System.exit(0);
    }
}
