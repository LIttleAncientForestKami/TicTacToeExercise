package board;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static board.SequencesEnum.*;

@Test()
public class PossibleSequencesTest {
    private final PossibleSequences pS = PossibleSequences.createInitialSequences();
    private final Set<SequencesEnum> firstSetToRemove;
    private final Set<SequencesEnum> secondSetToRemove;

    private PossibleSequencesTest() {
        firstSetToRemove = new TreeSet<>();
        secondSetToRemove = new TreeSet<>();
        firstSetToRemove.addAll(Arrays.asList(FIRST_COL, FIRST_ROW) );
        secondSetToRemove.addAll(Arrays.asList(FIRST_COL, FIRST_DIAG, SECOND_DIAG) );
    }

    @Test
    public void removeTest() {
        pS.remove(firstSetToRemove);
        Assert.assertEquals(pS.toString(), "[SECOND_ROW, THIRD_ROW, SECOND_COL, THIRD_COL, FIRST_DIAG, SECOND_DIAG]");
        pS.remove(secondSetToRemove);
        Assert.assertEquals(pS.toString(), "[SECOND_ROW, THIRD_ROW, SECOND_COL, THIRD_COL]");
    }
}
