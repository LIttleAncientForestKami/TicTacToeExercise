package epam.ja.krk.tictactoe.map;

import java.util.Map;

/**
 * Created by ehsan on 23.06.16.
 */
public class TicTacToeSimpleMap implements TicTacToeMap {

    private Map<String, TicTacToeField> map;

    public TicTacToeSimpleMap(Map<String, TicTacToeField> map) {
        this.map = map;
    }

    private boolean mapContainsTheKey(String key){
        return map.containsKey(key);
    }

    public boolean hasFreeFieldOn(String fieldNumber) {
        boolean free = false;
        if(mapContainsTheKey(fieldNumber)){
            free = map.get(fieldNumber).isFree();
        }
        return free;
    }

    public boolean hasShapeOnTheField(String fieldNumber, Shape shape){
        boolean areEqual = false;
        if(!hasFreeFieldOn(fieldNumber)){
            areEqual = map.get(fieldNumber).shape().equals(shape);
        }
        return areEqual;
    }

    public boolean putInTheField(String key, Shape shape) {
        boolean done = false;
        if(mapContainsTheKey(key)){
            map.get(key).put(shape);
            done = true;
        }
        return done;
    }

}
