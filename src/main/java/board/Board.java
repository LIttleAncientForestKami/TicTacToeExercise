package board;

import java.util.*;

// board implementation
public class Board {
    private static final Integer n = 3;
    private final Set<Field> fieldSet;

    // factory method to generate initial empty fields
    private static Set<Field> generateEmptyFields(Integer size) {
        Set<Field> tmpSet = new TreeSet<>();
        for (Integer i = 1; i <= size; i++) {
            tmpSet.add( new Field(i, Mark.EMPTY) );
        }
        return tmpSet;
    }

    public Board() {
        fieldSet = Board.generateEmptyFields(n*n);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Integer cnt = 0;     // counter helper

        for (Field field : fieldSet) {
            sb.append(field);
            ++cnt;
            if (cnt % n == 0) {
                sb.append("\n");
                sb.append("-----\n");
            } else {
                sb.append("|");
            }
        }
        return sb.toString();
    }

    // changes field from null mark to currentMark(O/X)
    // it is not possible to make move on existing mark (i.e. by accident)
    private boolean changeField(Integer nPos, Mark currentMark) {
        for (Field field : fieldSet) {
            if (field.equals( new Field( nPos, Mark.EMPTY ) )) {
                fieldSet.remove( field );
                fieldSet.add( new Field(nPos, currentMark) );
                return true;
            }
        }
        return false;
    }


    Set<Integer> listEmptyPositionIndices() {
        Set<Integer> set = new TreeSet<>();
        Integer pos = 1;
        for (Field field : fieldSet) {
            if (field.equals( new Field( pos, Mark.EMPTY ) ))
                set.add(pos);
            ++pos;
        }
        return set;
    }




    // adds a single move
    public void addAMove(Integer pos, Mark mark) {
        changeField(pos, mark);
    }
}