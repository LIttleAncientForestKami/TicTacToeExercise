package epam.ja.krk.tictactoe.graphic;

import epam.ja.krk.tictactoe.map.TicTacToeMap;

import java.util.Scanner;

/**
 * Created by ehsan on 24.06.16.
 */
public interface GraphicalViewer {
    void displayMap(TicTacToeMap map);

    String whatIsTheNextMove(Scanner scanner);
}
