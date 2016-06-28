package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.arbiter.Arbiter;
import epam.ja.krk.tictactoe.arbiter.SimpleArbiter;
import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.map.TicTacToeMapBuilder;
import epam.ja.krk.tictactoe.map.TicTacToeSimpleMap;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ehsan on 28.06.16.
 */
public class MachinePlayerTest {

    //canMachineDoADecision

    @Test
    void canMachineDoADecision(){
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        MachinePlayer machinePlayer = new SimpleMachinePlayer();

        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.areYouHandleThis("1");
        arbiter.areYouHandleThis("2");
        arbiter.areYouHandleThis("3");
        arbiter.areYouHandleThis("4");
        arbiter.areYouHandleThis("5");
        arbiter.areYouHandleThis("6");
        arbiter.areYouHandleThis("8");
        arbiter.areYouHandleThis("7");

        Assert.assertEquals(machinePlayer.whatIsTheNextMove(Shape.O, map.copyOfCurrentMap()), "9");

    }

}
