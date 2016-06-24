package epam.ja.krk.tictactoe.graphic;

import epam.ja.krk.tictactoe.map.TicTacToeMap;

import java.io.PrintStream;

/**
 * Created by ehsan on 24.06.16.
 */
public class SimpleGraphicalConsole implements GraphicalViewer {

    private final PrintStream out;

    public SimpleGraphicalConsole(PrintStream out) {
        this.out = out;
    }

    public void displayMap(TicTacToeMap map) {
        out.println(map);
    }
}
