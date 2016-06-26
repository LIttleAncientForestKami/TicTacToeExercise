package board;

import java.util.*;

// board implementation
public class Board {
    private final Integer N = 9;
    private Mark currentMark;
    private final Set<Field> fieldSet;

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

    // chenges field from null mark to currentMark(O/X)
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

    // first mark on the board!
    void putFirstMark() {
        this.changeField( 5 );
    }



    // for test purposes
    public static void main(String[] args) {
        Board b = new Board();
        b.putFirstMark();
        System.out.println( b );
    }
}