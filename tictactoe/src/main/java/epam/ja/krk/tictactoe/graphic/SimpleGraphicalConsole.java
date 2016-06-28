package epam.ja.krk.tictactoe.graphic;

import epam.ja.krk.tictactoe.environment.Environment;
import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.player.*;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by ehsan on 24.06.16.
 */
public class SimpleGraphicalConsole implements GraphicalViewer {

    private final PrintStream out;
    private final Scanner scanner;

    private final PlayerController playerController;

    public SimpleGraphicalConsole(PrintStream out, Scanner scanner, PlayerController playerController) {
        this.out = out;
        this.scanner = scanner;
        this.playerController = playerController;

    }

    public void displayMap(TicTacToeMap map) {
        out.println(map);
    }

    public String whatIsTheNextMove(Shape theShapeOfThePlayer, TicTacToeMap ticTacToeMap) {
        PlayerType type = playerController.getTypeOfPlayer(theShapeOfThePlayer);
        String retNumber;
        if(type.equals(PlayerType.HUMAN)){
            out.println("Next move player "+theShapeOfThePlayer+": ");
            retNumber = scanner.next();
        }else {
            retNumber = createAIMove(ticTacToeMap);
        }

        return retNumber;
    }

    public void informThat(String str) {
        out.println(str);
    }

    public void showWinner(Environment environment) {
        Player winner = playerController.whoPlaysAs(environment.getTheWinner());
        if(winner.type()== PlayerType.NOT_A_PLAYER){
            out.println("No Winner");
        }else{
            out.printf("The Winner is %s \n", winner);
        }
    }

    private String createAIMove(TicTacToeMap ticTacToeMap){
        return "1";
    }
}
