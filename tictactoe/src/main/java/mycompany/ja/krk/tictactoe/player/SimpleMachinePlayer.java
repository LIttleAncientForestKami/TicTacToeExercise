package mycompany.ja.krk.tictactoe.player;


import mycompany.ja.krk.tictactoe.arbiter.ArbiterHelper;
import mycompany.ja.krk.tictactoe.arbiter.Direction;
import mycompany.ja.krk.tictactoe.arbiter.DirectionFieldNumber;
import mycompany.ja.krk.tictactoe.arbiter.SimpleArbiterHelper;
import mycompany.ja.krk.tictactoe.map.Shape;

import mycompany.ja.krk.tictactoe.map.TicTacToeField;
import mycompany.ja.krk.tictactoe.map.TicTacToeSimpleMap;

import java.util.List;
import java.util.Map;


/**
 * Created by e.golesor@gmail.com on 28.06.16.
 */
public class SimpleMachinePlayer implements MachinePlayer {
    public String whatIsTheNextMove(Shape shape, Map<String, TicTacToeField> currentMap) {
        ArbiterHelper helper = new SimpleArbiterHelper(new TicTacToeSimpleMap(currentMap));

        List<DirectionFieldNumber> directionFieldNumberList ;
        for(String key : currentMap.keySet()){
            if(currentMap.get(key).isFree()){
                directionFieldNumberList = helper.getTheDirectionsThatHaveTheShape(shape, key);
                for (DirectionFieldNumber fieldNumber:directionFieldNumberList){
                    if(fieldNumber.direction.equals(Direction.OPPOSITE)){
                        return key;
                    }
                    if(helper.hasTheShapeOn(fieldNumber.direction, fieldNumber.fieldNumber, shape)){
                        return key;
                    }
                }
            }
        }
        for(String key : currentMap.keySet()){
            if(currentMap.get(key).isFree()){
                directionFieldNumberList = helper.getTheDirectionsThatHaveTheShape(Shape.O, key);
                for (DirectionFieldNumber fieldNumber:directionFieldNumberList){
                    if(fieldNumber.direction.equals(Direction.OPPOSITE)){
                        return key;
                    }
                    if(helper.hasTheShapeOn(fieldNumber.direction, fieldNumber.fieldNumber, Shape.O)){
                        return key;
                    }
                }
            }
        }

        for(String key : currentMap.keySet()){
            if(currentMap.get(key).isFree()){
                if(helper.getTheDirectionsThatHaveTheShape(shape,key).size()>0){
                    return key;
                }
            }
        }

        for(String key : currentMap.keySet()){
            if(currentMap.get(key).isFree()){

                    return key;

            }
        }

        return "";
    }

}
