package com.epam.tictactoe.arbiter;

import com.epam.tictactoe.enums.GameState;
import com.epam.tictactoe.player.IPlayer;

import java.util.List;

/**
 * @author Grzegorz Sledz
 */
public interface IArbiter {
    GameState checkIsWinner(IPlayer player);
}
