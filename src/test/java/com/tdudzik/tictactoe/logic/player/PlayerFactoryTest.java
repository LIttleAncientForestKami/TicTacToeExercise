package com.tdudzik.tictactoe.logic.player;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PlayerFactoryTest {

    @Test
    public void createHumanPlayer() {
        // Given
        PlayerFactory playerFactory = new PlayerFactory();

        // When
        Player player = playerFactory.createHumanPlayer("Player1");

        // Given
        assertEquals("Player1", player.getName());
    }

}