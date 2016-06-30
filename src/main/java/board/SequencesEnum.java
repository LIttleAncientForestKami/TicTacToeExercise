package board;

import java.util.*;

// coordinates of possible sequences of the board
public enum SequencesEnum implements Iterable<Position> {
    FIRST_ROW(1,2,3),
    SECOND_ROW(4,5,6),
    THIRD_ROW(7,8,9),
    FIRST_COL(1,4,7),
    SECOND_COL(2,5,8),
    THIRD_COL(3,6,9),
    FIRST_DIAG(1,5,9),
    SECOND_DIAG(3,5,7);

    private final Set<Position> setOfPositions = new HashSet<>();

    SequencesEnum(Integer i1, Integer i2, Integer i3) {
        setOfPositions.add( new Position( i1 ) );
        setOfPositions.add( new Position( i2 ) );
        setOfPositions.add( new Position( i3 ) );
    }

    // returns set of fields with one mark
    Set<Field> returnSetOfFieldsForTheSequence(Mark mark) {
        Set<Field> set = new TreeSet<>();
        setOfPositions.forEach(e -> set.add( new Field( e, mark ) ));
        return set;
    }

    @Override
    public Iterator<Position> iterator() {
        return setOfPositions.iterator();
    }
}
