package io;

import player.Player;

public class MessagePrinter {


    public void printMessage(Player player) {
        StringBuilder sb = new StringBuilder();
        sb.append(player);
        sb.append(", please make a move [1-9]: ");
        System.out.println(sb.toString());
    }
}
