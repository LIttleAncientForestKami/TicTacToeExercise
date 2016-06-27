package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.map.TicTacToeMapBuilder;
import epam.ja.krk.tictactoe.map.TicTacToeSimpleMap;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ehsan on 27.06.16.
 */
public class DirectionFieldNumberTest {

    /*
        1 2 3
        4 5 6
        7 8 9
     */
    @Test
    public void validFieldNumberTest(){

        DirectionFieldNumber directionFieldNumber = new DirectionFieldNumber();
        Assert.assertEquals(directionFieldNumber.getFieldNumberOnDirection(Direction.BOTOMN, "5").fieldNumber, "8");
        Assert.assertEquals(directionFieldNumber.getFieldNumberOnDirection(Direction.BOTOMN, "1").fieldNumber, "4");

    }



}
