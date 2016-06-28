package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.arbiter.ArbiterHelper;
import epam.ja.krk.tictactoe.map.TicTacToeField;

import java.util.HashMap;

/**
 * Created by ehsan on 28.06.16.
 */
public class SimpleMachinePlayer implements MachinePlayer {
    public String whatIsTheNextMove(HashMap<String, TicTacToeField> map, ArbiterHelper helper) {
        return getFreeField(map, helper);
    }


    private String getFreeField(HashMap<String, TicTacToeField> map, ArbiterHelper helper){
        return  helper.whatFieldsAreFree().get(0);
    }

}
