package com.epam.tictactoe.player;

import com.epam.tictactoe.board.IPosition;
import com.epam.tictactoe.enums.Sign;

/**
 * @author Grzegorz Sledz
 */
public interface IPlayer {
    public Sign sign();
    public void saveTurn(IPosition position);
    public IPosition lastTurn();
    public int turnsAmount();
}
