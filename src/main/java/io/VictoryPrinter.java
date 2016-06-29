package io;

import player.Player;

public class VictoryPrinter implements PlayerMessagePrinter {
    @Override
    public void printMessage(Player player) {
        StringBuilder sb = new StringBuilder();
        sb.append("VICTORY! ").append(player).append(" won!");
        System.out.println(sb.toString());
    }
}
