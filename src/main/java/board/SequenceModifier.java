package board;

import java.util.*;

import static board.SequencesEnum.*;

public class SequenceModifier {
    void modifySequences(boolean add, Integer nPos, Set<SequencesEnum> set) {
        Set<SequencesEnum> seq = new TreeSet<>();
        switch (nPos) {
            case 1:
                seq.addAll(Arrays.asList( FIRST_ROW, FIRST_COL, FIRST_DIAG ) );
                break;
            case 2:
                seq.addAll(Arrays.asList( FIRST_ROW, SECOND_COL ));
                break;
            case 3:
                seq.addAll(Arrays.asList( FIRST_ROW, THIRD_COL, SECOND_DIAG ));
                break;
            case 4:
                seq.addAll(Arrays.asList( SECOND_ROW, FIRST_COL ));
                break;
            case 5:
                seq.addAll(Arrays.asList( SECOND_ROW, SECOND_COL, FIRST_DIAG, SECOND_DIAG ));
                break;
            case 6:
                seq.addAll(Arrays.asList( SECOND_ROW, THIRD_COL ));
                break;
            case 7:
                seq.addAll(Arrays.asList( THIRD_ROW, FIRST_COL, SECOND_DIAG ));
                break;
            case 8:
                seq.addAll(Arrays.asList( THIRD_ROW, SECOND_COL ));
                break;
            case 9:
                seq.addAll(Arrays.asList( THIRD_ROW, THIRD_COL, FIRST_DIAG ));
                break;
        }
        if (add)
            set.addAll( seq );
        else
            set.removeAll( seq );
    }
}
