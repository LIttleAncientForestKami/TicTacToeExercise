package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsan on 27.06.16.
 */
public class SimpleArbiterHelper implements ArbiterHelper {

    private final TicTacToeMap map;
    private final DirectionFieldNumber directionFieldNumber = new DirectionFieldNumber();
    public SimpleArbiterHelper(TicTacToeMap map) {
        this.map = map;
    }


    public List<DirectionFieldNumber> getTheDirectionsThatHaveTheShape(Shape shape, String fieldNumber) {
        DirectionFieldNumber directionFieldNumber = this.directionFieldNumber;
        List<DirectionFieldNumber> fieldNumberList = new ArrayList<DirectionFieldNumber>();
        List<Direction> directionList = new ArrayList<Direction>();
        for(Direction direction:Direction.values()){
            directionFieldNumber = directionFieldNumber.getFieldNumberOnDirection(direction, fieldNumber);
            if(map.hasShapeOnTheField(directionFieldNumber.fieldNumber, shape)){
                directionList.add(direction);
                if(directionList.contains(direction.opposit(direction))){
                    fieldNumberList.add(directionFieldNumber.getOppositeDirectionFieldNumber());
                    break;
                }
                fieldNumberList.add(directionFieldNumber);
            }
        }
        return fieldNumberList;

    }

    public boolean hasTheShapeOn(Direction direction, String fieldNumber, Shape shape){
        DirectionFieldNumber directionFieldNumber = this.directionFieldNumber;
        String key = directionFieldNumber.getFieldNumberOnDirection(direction, fieldNumber).fieldNumber;
        if(key==null){
            return false;
        }
        return map.hasShapeOnTheField(key, shape);
    }

}
