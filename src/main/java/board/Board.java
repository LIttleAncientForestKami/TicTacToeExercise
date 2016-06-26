package board;

import java.util.*;

// board implementation
public class Board {
    private final Integer N = 9;
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

    Board() {
        fieldSet = Board.generateEmptyFields(N);
        markSwitcher = new MarkSwitcher();

        // TODO: change when Player will be implemented...
        currentMark = Mark.O;
    }

    // TODO: change - temporary implementation
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Field field : fieldSet) {
            sb.append(field);
            sb.append(" ");
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




    void makeAMove(Integer pos) {
        this.changeField(pos);
        markSwitcher.switchMark();
    }

    // for test purposes
    public static void main(String[] args) {
        Board b = new Board();
        b.makeAMove(1);
        b.makeAMove(2);
        b.makeAMove(3);
        b.makeAMove(3);

        System.out.println( b );
    }



    // switch mark - helper class
    private final class MarkSwitcher {
        void switchMark() {
            currentMark = currentMark.changeMark();
        }
    }
}