package board;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PossibleSequences implements Iterable<SequencesEnum> {
    private Set<SequencesEnum> set = new TreeSet<>();

    // initial sequences
    public static PossibleSequences createInitialSequences() {
        Set<SequencesEnum> set = new TreeSet<>();
        for (SequencesEnum seq : SequencesEnum.values()) {
            set.add(seq);
        }
        return new PossibleSequences(set);
    }

    private PossibleSequences(Set<SequencesEnum> set) {
        this.set = set;
    }

    // remove sequences
    void remove(Set<SequencesEnum> set) {
        this.set.removeAll(set);
        System.out.println(this.set);
    }

    // iterator
    public Iterator<SequencesEnum> iterator() {
        return set.iterator();
    }

    @Override
    public String toString() {
        return set.toString();
    }

    @Override
    public boolean equals(Object possibleSeqObj) {
        if (this == possibleSeqObj) return true;
        if (possibleSeqObj == null) return false;
        if (!this.getClass().equals( possibleSeqObj.getClass() ))
            return false;
        PossibleSequences posSeqTmp = (PossibleSequences)possibleSeqObj;
        return set.equals( posSeqTmp.set );
    }

    @Override
    public int hashCode() {
        return set.hashCode();
    }
}
