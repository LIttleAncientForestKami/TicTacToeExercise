package epam.ja.krk.tictactoe.graphic;

import epam.ja.krk.tictactoe.arbiter.Arbiter;
import epam.ja.krk.tictactoe.arbiter.SimpleArbiter;
import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.map.TicTacToeMapBuilder;
import epam.ja.krk.tictactoe.map.TicTacToeSimpleMap;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        arbiter.putXO("5");

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
        arbiter.putXO("5");
        arbiter.putXO("4");
        arbiter.putXO("3");
        arbiter.putXO("2");
        arbiter.putXO("1");
        arbiter.putXO("6");

        //TODO when we are going to have some loggers to we are going to use it
        GraphicalViewer gf = new SimpleGraphicalConsole(System.out);
        gf.displayMap(map);

        Assert.assertTrue(map.hasShapeOnTheField("2", Shape.X));


    }


}
