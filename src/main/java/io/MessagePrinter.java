package io;

import player.Player;

public final class MessagePrinter {
    // asks player to make a move
    public void printMessage(Player player) {
        StringBuilder sb = new StringBuilder();
        sb.append(player);
        sb.append(", please make a move [1-9]: ");
        System.out.println(sb.toString());
    }
}
