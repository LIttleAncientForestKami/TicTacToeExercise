package com.maciejkocur.tictactoe;

import com.maciejkocur.tictactoe.arbiter.Arbiter;
import com.maciejkocur.tictactoe.arbiter.impl.SimpleArbiter;
import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.board.Mark;
import com.maciejkocur.tictactoe.board.impl.SimpleMapBoard;
import com.maciejkocur.tictactoe.board.impl.SimpleMapBoardBuilder;
import com.maciejkocur.tictactoe.engine.Game;
import com.maciejkocur.tictactoe.player.Player;
import com.maciejkocur.tictactoe.player.impl.HumanPlayer;
import com.maciejkocur.tictactoe.ui.BoardView;
import com.maciejkocur.tictactoe.ui.InputReader;
import com.maciejkocur.tictactoe.ui.impl.ConsoleBoardView;
import com.maciejkocur.tictactoe.ui.impl.SimpleInputReader;

public class GameStarter {
    public Game prepareGame() throws Exception {
        Board board = new SimpleMapBoard(new SimpleMapBoardBuilder().createMap());
        BoardView boardView = new ConsoleBoardView();
        InputReader inputReader = new SimpleInputReader();
        Arbiter arbiter = new SimpleArbiter(board);
        Player player1 = new HumanPlayer(inputReader, Mark.CIRCLE);
        Player player2 = new HumanPlayer(inputReader, Mark.CROSS);
        return new Game(board, arbiter, player1, player2, boardView);
    }
}
