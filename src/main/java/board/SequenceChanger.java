package board;

public class SequenceChanger {
    public PossibleSequences changeSequences(PossibleSequences current, PossibleSequences pS1, PossibleSequences pS2) {
        if (current.equals( pS1 ))
            return pS2;
        return pS1;
    }
}
