package board;

import java.util.Set;

public class SequenceAdder {


    void addNewSequence(Integer nPos, Set<SequencesEnum> set) {
        switch (nPos) {
            case 1:
                set.add(SequencesEnum.FIRST_ROW);
                set.add(SequencesEnum.FIRST_COL);
                set.add(SequencesEnum.FIRST_DIAG);
                break;
            case 2:
                set.add(SequencesEnum.FIRST_ROW);
                set.add(SequencesEnum.SECOND_COL);
                break;
            case 3:
                set.add(SequencesEnum.FIRST_ROW);
                set.add(SequencesEnum.THIRD_COL);
                set.add(SequencesEnum.SECOND_DIAG);
                break;
            case 4:
                set.add(SequencesEnum.SECOND_ROW);
                set.add(SequencesEnum.FIRST_COL);
                break;
            case 5:
                set.add(SequencesEnum.SECOND_ROW);
                set.add(SequencesEnum.SECOND_COL);
                set.add(SequencesEnum.FIRST_DIAG);
                set.add(SequencesEnum.SECOND_DIAG);
                break;
            case 6:
                set.add(SequencesEnum.SECOND_ROW);
                set.add(SequencesEnum.THIRD_COL);
                break;
            case 7:
                set.add(SequencesEnum.THIRD_ROW);
                set.add(SequencesEnum.FIRST_COL);
                set.add(SequencesEnum.SECOND_DIAG);
                break;
            case 8:
                set.add(SequencesEnum.THIRD_ROW);
                set.add(SequencesEnum.SECOND_COL);
                break;
            case 9:
                set.add(SequencesEnum.THIRD_ROW);
                set.add(SequencesEnum.THIRD_COL);
                set.add(SequencesEnum.FIRST_DIAG);
                break;
        }
    }
}
