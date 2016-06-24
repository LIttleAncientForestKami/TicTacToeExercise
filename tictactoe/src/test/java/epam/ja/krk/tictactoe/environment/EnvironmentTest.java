package epam.ja.krk.tictactoe.environment;

import epam.ja.krk.tictactoe.arbiter.Arbiter;
import epam.ja.krk.tictactoe.arbiter.SimpleArbiter;
import epam.ja.krk.tictactoe.graphic.GraphicalViewer;
import epam.ja.krk.tictactoe.graphic.SimpleGraphicalConsole;
import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.map.TicTacToeMapBuilder;
import epam.ja.krk.tictactoe.map.TicTacToeSimpleMap;
import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by ehsan on 24.06.16.
 */
public class EnvironmentTest {

    @Test
    public void startingTheGameTest(){

        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        Arbiter arbiter = new SimpleArbiter(map);
        GraphicalViewer gf = new SimpleGraphicalConsole(System.out, new Scanner(System.in));
        Environment env = new TicTacToeSimpleEnvironment(arbiter,gf,map);

        env.runTheGame();

    }

}
