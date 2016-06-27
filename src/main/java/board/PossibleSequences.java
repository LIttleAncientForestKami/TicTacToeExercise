package board;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static board.SequencesEnum.FIRST_COL;
import static board.SequencesEnum.SECOND_ROW;

public class PossibleSequences {
    private Set<SequencesEnum> set = new TreeSet<>();

    static PossibleSequences createInitialSequnces() {
        Set<SequencesEnum> set = new TreeSet<>();
        for (SequencesEnum seq : SequencesEnum.values()) {
            set.add(seq);
        }

        System.out.println(set);
        return new PossibleSequences(set);
    }

    private PossibleSequences(Set<SequencesEnum> set) {
        this.set = set;
    }

    void remove(Set<SequencesEnum> set) {
        this.set.removeAll(set);
        System.out.println(this.set);
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
