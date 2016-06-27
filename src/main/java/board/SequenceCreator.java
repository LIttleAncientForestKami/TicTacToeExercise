package board;

import java.util.Collections;
import java.util.Set;

import static board.SequencesEnum.*;

public class SequenceCreator {


    void addNewSequence(Integer nPos, Set<SequencesEnum> set) {
        SequencesEnum[] seq = new SequencesEnum[] {};
        switch (nPos) {
            case 1:
                seq = new SequencesEnum[] {FIRST_ROW, FIRST_COL, FIRST_DIAG};
                break;
            case 2:
                seq = new SequencesEnum[] {FIRST_ROW, SECOND_COL};
                break;
            case 3:
                seq = new SequencesEnum[] {FIRST_ROW, THIRD_COL, SECOND_DIAG};
                break;
            case 4:
                seq = new SequencesEnum[] {SECOND_ROW, FIRST_COL};
                break;
            case 5:
                seq = new SequencesEnum[] {SECOND_ROW, SECOND_COL, FIRST_DIAG, SECOND_DIAG};
                break;
            case 6:
                seq = new SequencesEnum[] {SECOND_ROW, THIRD_COL};
                break;
            case 7:
                seq = new SequencesEnum[] {THIRD_ROW, FIRST_COL, SECOND_DIAG};
                break;
            case 8:
                seq = new SequencesEnum[] {THIRD_ROW, SECOND_COL};
                break;
            case 9:
                seq = new SequencesEnum[] {THIRD_ROW, THIRD_COL, FIRST_DIAG};
                break;
        }
        Collections.addAll( set, seq );
    }
}
