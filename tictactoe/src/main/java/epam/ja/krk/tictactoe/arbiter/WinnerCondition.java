package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;
import sun.security.provider.SHA;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ehsan on 24.06.16.
 */
public class WinnerCondition {
    Map<String, Map<String, String>> winnerConditionMap = new HashMap<String, Map<String, String>>();

    Map<String, Shape> playerXMoves = new HashMap<String, Shape>();
    Map<String, Shape> playerYMoves = new HashMap<String, Shape>();

    String keys = "12345";

    public void buildWinnerCondition(){
        Map<String, String> ss = new HashMap<String, String>();
        ss.put("1","47");
        winnerConditionMap.put("47", "1");
        winnerConditionMap.put("23", "1");

        winnerConditionMap.put("58", "2");

        winnerConditionMap.put("57", "3");
        winnerConditionMap.put("69", "3");

        winnerConditionMap.put("65", "4");

        winnerConditionMap.put("98", "7");

    }

    public void check(String numberI){
        keys.contains(numberI);


    }
    public void addMoveO(){

    }

    public boolean checkWinner(){

    }


}
