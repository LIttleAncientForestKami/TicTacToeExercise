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
        arbiter.putXO("1", Shape.O);

        Assert.assertTrue(map.hasShapeOnTheField("1", Shape.O));
    }

    @Test
    public void checkIfMapIsFull(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.putXO("1", Shape.O);
        arbiter.putXO("2", Shape.X);
        arbiter.putXO("3", Shape.O);
        arbiter.putXO("4", Shape.X);
        arbiter.putXO("5", Shape.O);
        arbiter.putXO("6", Shape.X);
        arbiter.putXO("7", Shape.O);
        arbiter.putXO("8", Shape.X);
        arbiter.putXO("9", Shape.X);

        Assert.assertTrue(arbiter.isTheMapFull());
    }

    @Test
    public void playerTermTest(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());

        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.putXO("1", Shape.X);
        Assert.assertEquals(arbiter.whoIsNext(), Shape.O);

    }

}
