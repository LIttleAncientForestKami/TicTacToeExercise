package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ehsan on 27.06.16.
 */
public class SimpleArbiterHelper implements ArbiterHelper {

    private final TicTacToeMap map; // helper also needs to
    private final DirectionFieldNumber directionFieldNumber = new DirectionFieldNumber(); // direction field number gives us some useful possibilities
    private final List<String> freePlaces; // we have this to have control on free places
    public SimpleArbiterHelper(TicTacToeMap map) {
        this.map = map;
        freePlaces = new LinkedList<String>(map.copyOfCurrentMap().keySet());
    }


    public List<DirectionFieldNumber> getTheDirectionsThatHaveTheShape(Shape shape, String fieldNumber) {
        DirectionFieldNumber directionFieldNumber = this.directionFieldNumber;
        List<DirectionFieldNumber> fieldNumberList = new ArrayList<DirectionFieldNumber>();
        List<Direction> directionList = new ArrayList<Direction>();

        for(Direction direction:Direction.values()){
            directionFieldNumber = directionFieldNumber.getFieldNumberOnDirection(direction, fieldNumber);
            if(map.hasShapeOnTheField(directionFieldNumber.fieldNumber, shape)){
                if(directionList.contains(direction.opposite())){
                    // if there was a opposite direction it means we have a winner
                    fieldNumberList.add(directionFieldNumber.getOppositeDirectionFieldNumber());
                    break;
                }
                directionList.add(direction);
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

    public List<String> whatFieldsAreFree() {
        return freePlaces;
    }

    public void deleteFromTheFreeFields(String fieldNumber) {
        freePlaces.remove(fieldNumber);
    }

}
