package com.danielzaucha.game.tictactoe.board;

import com.danielzaucha.game.tictactoe.player.base.Sign;

/**
 * Created by daniel on 24.06.16.
 */
public interface BoardBase {
    String toString();
    boolean placeCharacterOnBoard(int pos, Sign s);
}
