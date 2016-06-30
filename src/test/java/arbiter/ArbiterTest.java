package arbiter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import player.PlayerMoves;

import java.util.TreeSet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ArbiterTest {

    private static PlayerMoves playerMovesTrue;
    private static PlayerMoves playerMovesFalse;

    @BeforeClass
    public void init() {
        playerMovesTrue = mock(PlayerMoves.class);
        TreeSet<Integer> setTrue = new TreeSet<>();
        setTrue.add(1);
        setTrue.add(2);
        setTrue.add(3);
        when(playerMovesTrue.getPlayerMoves()).thenReturn(setTrue);
        playerMovesFalse = mock(PlayerMoves.class);
        TreeSet<Integer> setFalse = new TreeSet<>();
        setFalse.add(1);
        setFalse.add(4);
        setFalse.add(3);
        when(playerMovesFalse.getPlayerMoves()).thenReturn(setFalse);
    }


    @Test
    public void arbiterDecisionTest() {
        //Given
        Arbiter arbiter = Arbiter.getArbiter();
        //When
        boolean trueDecision = arbiter.decide(playerMovesTrue.getPlayerMoves());
        boolean falseDecision = arbiter.decide(playerMovesFalse.getPlayerMoves());
        //Then
        assertTrue(trueDecision);
        assertFalse(falseDecision);
    }


}