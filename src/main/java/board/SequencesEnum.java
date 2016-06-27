package board;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public enum SequencesEnum {
    FIRST_ROW(1,2,3),
    SECOND_ROW(4,5,6),
    THIRD_ROW(7,8,9),
    FIRST_COL(1,4,7),
    SECOND_COL(2,5,8),
    THIRD_COL(3,6,9),
    FIRST_DIAG(1,5,9),
    SECOND_DIAG(3,5,7);

    private final Position p1, p2, p3;

    SequencesEnum(Integer i1, Integer i2, Integer i3) {
        p1 = new Position(i1);
        p2 = new Position(i2);
        p3 = new Position(i3);
    }

    Set<Field> returnSetOfFieldsForTheSequence(Mark mark) {
        Set<Field> set = new TreeSet<>();
        set.add( new Field(p1, mark) );
        set.add( new Field(p2, mark) );
        set.add( new Field(p3, mark) );
        return set;
    }
}
