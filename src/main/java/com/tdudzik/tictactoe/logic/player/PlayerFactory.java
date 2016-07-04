package com.tdudzik.tictactoe.logic.player;

import java.util.UUID;

public class PlayerFactory {

    public Player createHumanPlayer(String playerName) {
        return new HumanPlayer(UUID.randomUUID().toString(), playerName);
    }

}
