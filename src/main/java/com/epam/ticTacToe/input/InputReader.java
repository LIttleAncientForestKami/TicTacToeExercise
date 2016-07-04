package com.epam.ticTacToe.input;

import java.util.Scanner;

/**
 * Created by damian on 04.07.16.
 */
public class InputReader {

    public int readInput() {
        int result;
        Scanner scanner = new Scanner(System.in);
        result = scanner.nextInt();
        return result;
    }
}
