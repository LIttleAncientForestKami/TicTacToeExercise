package epam.ja.krk.tictactoe.graphic;

import epam.ja.krk.tictactoe.environment.Environment;
import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.player.Player;
import epam.ja.krk.tictactoe.player.PlayerO;
import epam.ja.krk.tictactoe.player.PlayerX;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by ehsan on 24.06.16.
 */
public class SimpleGraphicalConsole implements GraphicalViewer {

    private final PrintStream out;
    private final Scanner scanner;

    private final Player playerO;
    private final Player playerX;
    public SimpleGraphicalConsole(PrintStream out, Scanner scanner, PlayerO playerO, PlayerX playerX) {
        this.out = out;
        this.scanner = scanner;
        this.playerO = playerO;
        this.playerX=playerX;
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

    public void showWinner(Environment env) {
        Shape winner = env.getTheWinner();
        Player winnerPlayer = null;
        if(Shape.O.equals(winner)){
            winnerPlayer = playerO;
        }else if(Shape.X.equals(winner)){
            winnerPlayer = playerX;
        }
        if(winner==null){
            out.println("No winner!!");
        }else {
            out.println("The winner is "  + winnerPlayer);
        }
    }


}
