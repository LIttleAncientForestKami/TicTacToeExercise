package board;

import java.util.Set;
import java.util.TreeSet;

public class Sequence {
    private Set<SequencesEnum> set = new TreeSet<>();
    private SequenceModifier sQ = new SequenceModifier();

    void appendSequencesFromIndexPosition(Integer posIndex) {
        sQ.modifySequences(true, posIndex, set);
    }

    //void remove
}
