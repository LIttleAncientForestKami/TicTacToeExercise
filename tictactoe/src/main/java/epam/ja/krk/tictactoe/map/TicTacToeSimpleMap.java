package epam.ja.krk.tictactoe.map;

import java.util.Map;

/**
 * Created by ehsan on 23.06.16.
 */
public class TicTacToeSimpleMap implements TicTacToeMap {

    private static int MIN_FIELD_NUMBER = 1;
    private static int MAX_FIELD_NUMBER = 9;
    public static int NUMBER_OF_ROWS = 3;

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
        if(mapContainsTheKey(fieldNumber)){
            if(!hasFreeFieldOn(fieldNumber)){
                areEqual = map.get(fieldNumber).shape().equals(shape);
            }
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

    public String toString(){
        String tempNumber = "";
        StringBuilder stringBuilder = new StringBuilder();
        for(int iterator=MIN_FIELD_NUMBER; iterator<=MAX_FIELD_NUMBER; iterator++){
            tempNumber = String.valueOf(iterator);
            if(iterator%3==1){
                stringBuilder.append("\n");
            }else {
                stringBuilder.append("\t");
            }
            stringBuilder.append(map.get(tempNumber));
        }
        return stringBuilder.toString();
    }

}
