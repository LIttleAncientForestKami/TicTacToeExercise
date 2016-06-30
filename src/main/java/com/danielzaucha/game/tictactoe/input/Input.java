package com.danielzaucha.game.tictactoe.input;

import com.danielzaucha.game.tictactoe.display.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by daniel on 24.06.16.
 */
public class Input implements  InputBase{
    private Scanner scanner = new Scanner(System.in);

    private int size;

    public Input(int size)
    {
        this.size = size;
    }

    @Override
    public int read() {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                break;
            } catch (InputMismatchException ex) {
                Logger.printUnproperInputException();
                scanner.next();
                continue;
            }
        }
        if(input > 0 && input <=size*size)
        {
            return input;
        }
        Logger.printUnproperInputException();
        return 0;
    }
}
