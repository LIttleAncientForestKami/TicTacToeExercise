package com.tdudzik.tictactoe.logic.io;

import com.tdudzik.tictactoe.logic.board.Board;
import com.tdudzik.tictactoe.logic.player.Player;

public interface OutputOperations {

    void drawBoard(Board board);

    void gameWasWon(Board board, Player winner);

    void gameEndedInDraw(Board board);

}
