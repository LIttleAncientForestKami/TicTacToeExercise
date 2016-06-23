package epam.ja.krk.tictactoe.map;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ehsan on 23.06.16.
 */
public class MapTest {

    @Test
    public void freeFieldTest(){
        TicTacToeField theField = new TicTacToeSimpleField();
        Assert.assertTrue(theField.isFree());
    }


    @Test
    public void shapeOFieldTest(){
        TicTacToeField theField = new TicTacToeSimpleField();
        theField.put(Shape.O);
        Assert.assertEquals(Shape.O, theField.shape());
    }

    @Test
    public void shapeXFieldTest(){
        TicTacToeField theField = new TicTacToeSimpleField();
        theField.put(Shape.X);
        Assert.assertEquals(Shape.X, theField.shape());
    }

    @Test
    public void mapOfFieldsTest(){
        Map<String, TicTacToeField> map = new HashMap<String, TicTacToeField>();
        map.put("1", new TicTacToeSimpleField());
        map.put("2", new TicTacToeSimpleField());
        map.put("3", new TicTacToeSimpleField());
        map.put("4", new TicTacToeSimpleField());
        map.put("5", new TicTacToeSimpleField());
        map.put("6", new TicTacToeSimpleField());
        TicTacToeMap ticTacToeMap = new TicTacToeSimpleMap(map);
        Assert.assertTrue(ticTacToeMap.getField("2").isFree());
    }

}
