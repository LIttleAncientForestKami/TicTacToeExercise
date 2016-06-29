package io;

import player.Player;

@FunctionalInterface
public interface PlayerMessagePrinter {
    void printMessage(Player player);
}
