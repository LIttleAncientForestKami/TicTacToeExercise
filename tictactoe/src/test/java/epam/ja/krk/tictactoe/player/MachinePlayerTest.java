package epam.ja.krk.tictactoe.player;

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


        Assert.assertEquals(machinePlayer.whatIsTheNextMove(map), "3");

    }

}
