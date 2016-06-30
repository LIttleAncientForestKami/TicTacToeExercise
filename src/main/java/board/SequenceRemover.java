package board;

import java.util.Set;

// class to remove sequences from PossibleSequences
public class SequenceRemover {
    private SequenceLister sequenceLister = new SequenceLister();

    public void remove(PossibleSequences possibleSequences, Integer nPos) {
        Set<SequencesEnum> set = sequenceLister.listSequence(nPos);
        possibleSequences.remove(set);
    }
}
