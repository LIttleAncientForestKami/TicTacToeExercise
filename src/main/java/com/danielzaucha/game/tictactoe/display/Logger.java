package com.danielzaucha.game.tictactoe.display;

import com.danielzaucha.game.tictactoe.game.GameResult;
import com.danielzaucha.game.tictactoe.player.base.Sign;

/**
 * Created by daniel on 30.06.16.
 */
public class Logger {

    static public void printBoard(Object board){
        System.out.println(board);
    }

    static public void announceResult(GameResult gr, Sign s){
        switch(gr){
            case WIN:
                System.out.println("The winner is: " + s);
                break;
            case DRAW:
                System.out.println("It's a draw!");
                break;
        }
    }

    static public void printUnproperInputException(){
        System.out.println("Unproper input! Type the number beetween 1-9");
    }

    static public void printPlayerShell(Sign s){
        System.out.println("Player " + s + ": ");
    }

    static public void printWelcomeMessage(){
        System.out.println("Welcome! This is OX game. You can type the number of field when you want to put your sign! Good Luck!");
    }
}
