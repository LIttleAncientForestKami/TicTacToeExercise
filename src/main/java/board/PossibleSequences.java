package board;

import java.util.Set;
import java.util.TreeSet;

public class PossibleSequences {
    private Set<SequencesEnum> set = new TreeSet<>();

    public static PossibleSequences createInitialSequences() {
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
