package epam.ja.krk.tictactoe.graphic;

import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by ehsan on 24.06.16.
 */
public class SimpleGraphicalConsole implements GraphicalViewer {

    private final PrintStream out;
    private final Scanner scanner;

    public SimpleGraphicalConsole(PrintStream out, Scanner scanner) {
        this.out = out;
        this.scanner = scanner;
    }

    public void displayMap(TicTacToeMap map) {
        out.println(map);
    }

    public String whatIsTheNextMove(Shape theShapeOfThePlayer) {
        out.println("Next move player "+theShapeOfThePlayer+": ");
        return scanner.next();
    }

    public void informThat(String str) {
        out.println(str);
    }


}
