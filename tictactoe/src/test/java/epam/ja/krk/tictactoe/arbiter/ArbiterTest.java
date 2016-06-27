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
        arbiter.putXO("1");

        Assert.assertTrue(map.hasShapeOnTheField("1", Shape.O));
    }

    @Test
    public void checkIfMapIsFull(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.putXO("1");
        arbiter.putXO("2");
        arbiter.putXO("3");
        arbiter.putXO("4");
        arbiter.putXO("5");
        arbiter.putXO("6");
        arbiter.putXO("7");
        arbiter.putXO("8");
        arbiter.putXO("9");

        Assert.assertTrue(arbiter.isTheMapFull());
    }

    @Test
    public void playerTermTest(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());

        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.putXO("1");
        Assert.assertEquals(arbiter.whoIsPlaying(), Shape.X);

    }

    @Test
    public void whoIsTheWinnerTest(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());

        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.putXO("1");
        arbiter.putXO("2");
        arbiter.putXO("3");
        arbiter.putXO("4");
        arbiter.putXO("5");
        arbiter.putXO("6");
        arbiter.putXO("7");
        arbiter.putXO("8");
        arbiter.putXO("9");

        Assert.assertEquals(arbiter.whoIsTheWinner(), Shape.O);

    }

}
