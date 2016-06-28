package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.arbiter.ArbiterHelper;
import epam.ja.krk.tictactoe.arbiter.SimpleArbiterHelper;
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
        MachinePlayer machinePlayer = new SimpleMachinePlayer();
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        ArbiterHelper helper = new SimpleArbiterHelper(map);

        helper.deleteFromTheFreeFields("1");
        helper.deleteFromTheFreeFields("2");
        helper.deleteFromTheFreeFields("3");
        helper.deleteFromTheFreeFields("4");
        helper.deleteFromTheFreeFields("5");
        helper.deleteFromTheFreeFields("6");
        helper.deleteFromTheFreeFields("7");
        helper.deleteFromTheFreeFields("8");
        helper.deleteFromTheFreeFields("8");
        Assert.assertEquals(machinePlayer.whatIsTheNextMove(map.copyOfCurrentMap(), helper), "9");

    }

}
