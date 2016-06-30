package io;

import player.Player;

public final class MessagePrinter implements PlayerMessagePrinter {
    // asks player to make a move
    @Override
    public void printMessage(Player player) {
        StringBuilder sb = new StringBuilder();
        sb.append(player);
        sb.append(", please make a move [1-9]: ");
        System.out.println(sb.toString());
    }
}
