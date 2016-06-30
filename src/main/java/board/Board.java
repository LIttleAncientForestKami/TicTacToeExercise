package board;

import java.util.*;

// board implementation
public class Board {
    private static final Integer n = 3;
    private final Set<Field> fieldSet;

    // factory method
    public static Board createBoard() {
        Set<Field> tmpSet = new TreeSet<>();
        for (Integer i = 1; i <= n*n; i++) {
            tmpSet.add( new Field(i, Mark.EMPTY) );
        }
        return new Board(tmpSet);
    }

    private Board(Set<Field> fieldSet) {
        this.fieldSet = fieldSet;
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

    // lists empty positions - package local
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
    void addAMove(Integer pos, Mark mark) {
        changeField(pos, mark);
    }

    // returns set of fields from the board based on Sequences enum coordinates
    Set<Field> returnSetOfFields(SequencesEnum possibleSequences) {
        List<Field> tmpList = new ArrayList<>( fieldSet );
        Set<Field> set = new HashSet<>();
        for (Position position : possibleSequences) {
            set.add( tmpList.get( Position.asInt( position ) - 1 ) );
        }
        return set;
    }
}