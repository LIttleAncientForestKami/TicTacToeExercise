package epam.ja.krk.tictactoe.graphic;

import epam.ja.krk.tictactoe.arbiter.Arbiter;
import epam.ja.krk.tictactoe.arbiter.SimpleArbiter;
import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.map.TicTacToeMapBuilder;
import epam.ja.krk.tictactoe.map.TicTacToeSimpleMap;
import epam.ja.krk.tictactoe.player.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by ehsan on 24.06.16.
 */
public class GraphicalViewerTest {


    /**
     * Putting O in the middle of the map
     */
    @Test
    public void firstScenario(){

        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.handleThis("5");

        Assert.assertTrue(map.hasShapeOnTheField("5", Shape.O));
    }

    /**
     * Putting more X O
     */
    @Test
    public void secondScenarioTest(){

        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.handleThis("5");
        arbiter.handleThis("4");
        arbiter.handleThis("3");
        arbiter.handleThis("2");
        arbiter.handleThis("1");
        arbiter.handleThis("6");

        //TODO when we are going to have some loggers to we are going to use it
        PlayerO playerO = new PlayerO("Name", "surname", PlayerType.HUMAN);
        PlayerX playerX = new PlayerX("Name", "surname", PlayerType.HUMAN);
        PlayerController controller = new SimplePlayerController(playerO,playerX);
        GraphicalViewer gf = new SimpleGraphicalConsole(System.out, new Scanner(System.in), controller);
        gf.displayMap(map);

        Assert.assertTrue(map.hasShapeOnTheField("2", Shape.X));


    }



}
