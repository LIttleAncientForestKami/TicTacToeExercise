package board;

import java.util.*;

// board implementation
public class Board {
    private final Integer n = 3;
    private Mark currentMark;
    private final Set<Field> fieldSet;

    private final MarkSwitcher markSwitcher;

    // factory method to generate initial empty fields
    private static Set<Field> generateEmptyFields(Integer size) {
        Set<Field> tmpSet = new TreeSet<>();
        for (Integer i = 1; i <= size; i++) {
            tmpSet.add( new Field(i, null) );
        }
        return tmpSet;
    }

    public Board() {
        fieldSet = Board.generateEmptyFields(n*n);
        markSwitcher = new MarkSwitcher();

        // TODO: change when Player will be implemented...
        currentMark = Mark.O;
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
    private boolean changeField(Integer nPos) {
        for (Field field : fieldSet) {
            if (field.equals( new Field( nPos, null ) )) {
                fieldSet.remove( field );
                fieldSet.add( new Field(nPos, currentMark) );
                return true;
            }
        }
        return false;
    }



    // makes a single move
    public void makeAMove(Integer pos) {
        this.changeField(pos);
        markSwitcher.switchMark();
    }




    // switch mark - helper class
    private final class MarkSwitcher {
        void switchMark() {
            currentMark = currentMark.changeMark();
        }
    }
}