package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.map.TicTacToeMapBuilder;
import epam.ja.krk.tictactoe.map.TicTacToeSimpleMap;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ehsan on 24.06.16.
 */
public class ArbiterTest {


    @Test
    public void checkIfArbiterPutsXO(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.handleThis("1");

        Assert.assertTrue(map.hasShapeOnTheField("1", Shape.O));
    }

    @Test
    public void checkIfMapIsFull(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.handleThis("1");
        arbiter.handleThis("2");
        arbiter.handleThis("3");
        arbiter.handleThis("4");
        arbiter.handleThis("5");
        arbiter.handleThis("6");
        arbiter.handleThis("7");
        arbiter.handleThis("8");
        arbiter.handleThis("9");

        Assert.assertTrue(arbiter.isTheMapFull());
    }

    @Test
    public void playerTermTest(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());

        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.handleThis("1");
        Assert.assertEquals(arbiter.whoIsPlaying(), Shape.X);

    }

    @Test
    public void whoIsTheWinnerTest(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());

        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.handleThis("1");
        arbiter.handleThis("2");
        arbiter.handleThis("3");
        arbiter.handleThis("4");
        arbiter.handleThis("5");

        Assert.assertEquals(arbiter.whoIsTheWinner(), Shape.X);

    }

}
