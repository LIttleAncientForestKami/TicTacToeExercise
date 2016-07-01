package com.maciejkocur.tictactoe.ui.impl;

import com.maciejkocur.tictactoe.ui.InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInputReader implements InputReader {
    private BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public Integer readInput() throws IOException {
        while (true) {
            System.out.println("Please enter field number: ");
            try {
                return Integer.valueOf(inputReader.readLine().trim());
            } catch (final NumberFormatException e) {
                System.out.println("Wrong Input Format!");
            }
        }
    }
}