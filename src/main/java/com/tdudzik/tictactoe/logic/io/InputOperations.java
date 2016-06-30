package com.tdudzik.tictactoe.logic.io;

import com.tdudzik.tictactoe.logic.board.Position;
import com.tdudzik.tictactoe.logic.player.Player;

public interface InputOperations {

    Player readPlayer1();

    Player readPlayer2();

    Position readPosition(String playerName);

}
