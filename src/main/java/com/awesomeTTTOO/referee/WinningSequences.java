package com.awesomeTTTOO.referee;


import com.awesomeTTTOO.board.Board;

import java.util.*;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class WinningSequences {

    List<Set> sequencesList;


    public WinningSequences() {
        initializeSequences();

    }

    private List<Set> initializeSequences() {
        sequencesList = new ArrayList<Set>();
        int i = 1;
        int a = 1;
        int c = 1;
        Set s;
        for (int z = 0; z < 3; z++) {
            s = new TreeSet();
            for (; i <= 9; i++) {
                s.add(i);
                if (i % 3 == 0) {
                    i++;
                    break;
                }
            }

            sequencesList.add(s);
        }
        for (; a <= 3; a++) {
            s = new TreeSet();
            s.add(a);
            s.add(a + 3);
            s.add(a + 6);

            sequencesList.add(s);
        }

        s = new TreeSet();
        s.add(1);
        s.add(5);
        s.add(9);
        sequencesList.add(s);
        s = new TreeSet();
        s.add(7);
        s.add(5);
        s.add(3);
        sequencesList.add(s);


        return sequencesList;
    }


    public boolean playerWon(Board board) {
        String s;
        Map<Integer, String> gameBoard = board.presentBoard();
        Iterator<Set> myIterator = sequencesList.iterator();
        while (myIterator.hasNext()) {
            s = "";
            for (Object i : myIterator.next()) {
                s += gameBoard.get(i);
            }
            if (s.contains("X") && s.contains("O")) myIterator.remove();
            if (s.equals("XXX")) return true;
            if(s.equals("OOO")) return true;

        }

        return false;
    }


    protected boolean draw(){
        return sequencesList.isEmpty();
    }

}
