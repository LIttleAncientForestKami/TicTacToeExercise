package com.danielzaucha.game.tictactoe.arbiter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by daniel on 29.06.16.
 */
public enum Sequences implements Comparable<Sequences> {
    FROW(1,2,3), 
    SROW(4,5,6),
    TROW(7,8,9),
    FCOL(1,4,7),
    SCOL(2,5,8),
    TCOL(3,6,9),
    FDI(1,5,9),
    SDI(3,5,7);

    private final int fPos, sPos, tPos;
    Sequences(int fPos, int sPos, int tPos) {
        this.fPos = fPos;
        this.sPos = sPos;
        this.tPos = tPos;
    }

    public Set<Integer> convertToSet()
    {
        Set<Integer> set = new HashSet<>();
        set.add(this.fPos);
        set.add(this.sPos);
        set.add(this.tPos);
        return set;
    }
}
