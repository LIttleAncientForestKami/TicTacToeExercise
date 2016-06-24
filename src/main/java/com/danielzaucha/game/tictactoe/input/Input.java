package com.danielzaucha.game.tictactoe.input;

import com.danielzaucha.game.tictactoe.player.controller.PlayerControllerObserver;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by daniel on 24.06.16.
 */
public class Input implements  InputBase{
    private Scanner scanner = new Scanner(System.in);
    private PlayerControllerObserver playerControllerObserver;

    private int size;

    public Input(int size)
    {
        this.size = size;
    }

    @Override
    public void read() {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                break;
            } catch (InputMismatchException ex) {
                scanner.next();
                continue;
            }
        }
        if(input > 0 && input <=size*size)
        {
            notifyToObserver(input);
        }
    }

    public void attach(PlayerControllerObserver playerControllerObserver)
    {
        this.playerControllerObserver = playerControllerObserver;
    }

    private void notifyToObserver(int pos)
    {
        playerControllerObserver.play(pos);
    }
}
