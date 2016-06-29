package mycompany.ja.krk.tictactoe.arbiter;

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
        Assert.assertEquals(directionFieldNumber.getFieldNumberOnDirection(Direction.BOTTOM, "5").fieldNumber, "8");
        Assert.assertEquals(directionFieldNumber.getFieldNumberOnDirection(Direction.BOTTOM, "1").fieldNumber, "4");

    }



}
