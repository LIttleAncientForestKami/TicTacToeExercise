package mycompany.ja.krk.tictactoe.arbiter;



import mycompany.ja.krk.tictactoe.map.Shape;
import mycompany.ja.krk.tictactoe.map.TicTacToeMap;
import mycompany.ja.krk.tictactoe.map.TicTacToeMapBuilder;
import mycompany.ja.krk.tictactoe.map.TicTacToeSimpleMap;
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
        arbiter.areYouHandleThis("1");

        Assert.assertTrue(map.hasShapeOnTheField("1", Shape.O));
    }

    @Test
    public void checkIfMapIsFull(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.areYouHandleThis("1");
        arbiter.areYouHandleThis("2");
        arbiter.areYouHandleThis("3");
        arbiter.areYouHandleThis("4");
        arbiter.areYouHandleThis("5");
        arbiter.areYouHandleThis("6");
        arbiter.areYouHandleThis("7");
        arbiter.areYouHandleThis("8");
        arbiter.areYouHandleThis("9");

        Assert.assertTrue(arbiter.isTheMapFull());
    }

    @Test
    public void playerTermTest(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());

        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.areYouHandleThis("1");
        Assert.assertEquals(arbiter.whoIsPlaying(), Shape.X);

    }

    @Test
    public void whoIsTheWinnerTest(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());

        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.areYouHandleThis("1");
        arbiter.areYouHandleThis("2");
        arbiter.areYouHandleThis("3");
        arbiter.areYouHandleThis("4");
        arbiter.areYouHandleThis("5");

        Assert.assertEquals(arbiter.whoIsTheWinner(), Shape.N);

    }

}
