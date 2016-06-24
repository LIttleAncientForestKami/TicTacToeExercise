package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;

/**
 * Created by ehsan on 24.06.16.
 */
public interface Arbiter {


    boolean putXO(String s, Shape o);

    boolean isTheMapFull();
}
