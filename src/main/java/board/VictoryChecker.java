package board;

public class VictoryChecker {
    // checks the equality between fields from possibleSequences and the related fields on the board
    public boolean checkVictory(Board board, PossibleSequences possibleSequences, Mark mark) {
        for (SequencesEnum seq : possibleSequences) {
            if ( board.returnSetOfFields( seq ).containsAll( seq.returnSetOfFieldsForTheSequence(mark) ) )
                return true;
        }
        return false;
    }
}
