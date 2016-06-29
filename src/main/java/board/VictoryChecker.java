package board;

public class VictoryChecker {
    public boolean checkVictory(Board board, PossibleSequences possibleSequences, Mark mark) {
        for (SequencesEnum seq : possibleSequences) {
            if ( board.returnSetOfFields( seq ).containsAll( seq.returnSetOfFieldsForTheSequence(mark) ) )
                return true;
        }
        return false;
    }
}
