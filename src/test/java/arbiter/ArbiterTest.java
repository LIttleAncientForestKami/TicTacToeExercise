package arbiter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import player.PlayerMoves;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;

public class ArbiterTest {

    private static PlayerMoves playerMovesTrue = mock(PlayerMoves.class);
    private static PlayerMoves playerMovesFalse;
    private static TreeSet<Integer> integers = new TreeSet<>();

    @BeforeClass
    public void init() {
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
        boolean trueDecision = arbiter.compereToPossibleConditions(playerMovesTrue.getPlayerMoves());
        boolean falseDecision = arbiter.compereToPossibleConditions(playerMovesFalse.getPlayerMoves());
        //Then
        assertTrue(trueDecision);
        assertFalse(falseDecision);
    }

    @Test(dataProvider = "dataProvider")
    public void arbiterDecisionTest(boolean test, Collection<Integer> array) {
        //Given
        Arbiter arbiter = Arbiter.getArbiter();
        integers.addAll(array);
        when(playerMovesTrue.getPlayerMoves()).thenReturn(integers);
        //When
        boolean trueDecision = arbiter.compereToPossibleConditions(playerMovesTrue.getPlayerMoves());
        //Then
        assertEquals(test, trueDecision);
        //assertFalse(falseDecision);
    }


    @DataProvider
    public Object[][] dataProvider() {
        return new Object[][]{{true, Arrays.asList(1, 2, 3)},
                {true, Arrays.asList(4, 5, 6)},
                {true, Arrays.asList(7, 8, 9)},
                {true, Arrays.asList(1, 4, 7)},
                {true, Arrays.asList(2, 5, 8)},
                {true, Arrays.asList(3, 6, 9)},
                {true, Arrays.asList(1, 5, 9)},
                {true, Arrays.asList(3, 5, 7)},
                {true, Arrays.asList(1, 3, 5, 7, 9)}};
    }
}


