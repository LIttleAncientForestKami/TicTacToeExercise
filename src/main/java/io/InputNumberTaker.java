package io;

import player.Player;

import java.util.Scanner;
import java.util.Set;

public final class InputNumberTaker {
    private final Integer MIN = 1;
    private final Integer MAX = 9;
    private MessagePrinter messagePrinter = new MessagePrinter();

    // collects valid data - only for empty positions on the board
    public Integer collectValidData(Player player, Set<Integer> freePositions) {
        messagePrinter.printMessage(player);

        while (true) {
            try {
                Integer n = Integer.parseInt( new Scanner( System.in ).next() );
                if (n >= MIN && n <= MAX && freePositions.contains(n)) {
                    return n;
                }
                else {
                   messagePrinter.printMessage(player);
                }
            } catch (NumberFormatException e) {
                messagePrinter.printMessage(player);
            }
        }
    }
}
